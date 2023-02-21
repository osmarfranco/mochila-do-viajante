#! /bin/bash
echo Colocando o site no ar...
docker build -t my-apache2 .
docker run -dit --name my-running-app -p 8080:80 my-apache2
echo Pronto! Acesse o site em http://localhost:8080/