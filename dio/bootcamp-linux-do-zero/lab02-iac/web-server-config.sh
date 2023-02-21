#!/bin/bash

# Atualizando o servidor
echo "Atualizando o servidor..."
apt-get update
apt-get upgrade -y

# Instalando softwares necessários
echo "Instalando o Apache..."
apt-get install apache2 -y

echo "Instalando o Unzip..."
apt-get install unzip -y

# Baixando a aplicação para um diretório temporário
echo "Baixando e descompactando a aplicação..."
wget -P /tmp/ https://github.com/denilsonbonatti/linux-site-dio/archive/refs/heads/main.zip
unzip /tmp/linux-site-dio-main.zip

echo "Copiando aplicação para o servidor..."
cp -R /tmp/linux-site-dio-main/* /var/www/html/

echo "Pronto, agora é só acessar a aplicação!"