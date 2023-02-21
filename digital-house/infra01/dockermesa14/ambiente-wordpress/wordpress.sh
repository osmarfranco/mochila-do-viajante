#! /bin/bash
echo Criando redes...
docker network create public
docker network create internal --internal

echo Criando Banco de Dados...
docker run -d --name db --network internal -e MYSQL_ROOT_PASSWORD=my-secret-pw -e MYSQL_USER=wpuser -e MYSQL_PASSWORD=my-secret-pw -e MYSQL_DATABASE=wordpressdb -e WORDPRESS_TABLE_PREFIX=hj mysql:5.7

echo Criando WordPress...
docker create -p 8081:80 --name web --network public -e WORDPRESS_DB_HOST=db:3306 -e WORDPRESS_DB_USER=wpuser -e WORDPRESS_DB_PASSWORD=my-secret-pw -e WORDPRESS_DB_NAME=wordpressdb -e WORDPRESS_TABLE_PREFIX=hj wordpress:latest

echo Conectando com a rede interna...
docker network connect internal web

echo Inicializando...
docker start web

echo Pronto! Acesse o ambiente em http://127.0.0.1:8081/