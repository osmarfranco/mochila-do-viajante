#! /bin/bash
echo Removendo o ambiente wordpress...
docker stop web
docker stop db
docker rm web
docker rm db
docker network rm public
docker network rm internal
docker rmi mysql:5.7
docker rmi wordpress:latest
echo Pronto!