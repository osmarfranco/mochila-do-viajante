#!/bin/bash

# criando diretórios
echo "Criando diretórios..."
mkdir publico adm ven sec

# criando grupos
echo "Criando grupos..."
groupadd GRP_ADM
groupadd GRP_VEN
groupadd GRP_SEC

# criando usuarios
echo "Criando usuários..."
useradd carlos -c "Carlos Silva" -m -s /bin/bash -p $(openssl passwd -crypt Senha123) -G GRP_ADM
passwd carlos -e
useradd maria -c "Maria Bertolatto" -m -s /bin/bash -p $(openssl passwd -crypt Senha123) -G GRP_ADM
passwd maria -e
useradd joao -c "João Amaral" -m -s /bin/bash -p $(openssl passwd -crypt Senha123) -G GRP_ADM
passwd joao -e
useradd debora -c "Debora Almeida" -m -s /bin/bash -p $(openssl passwd -crypt Senha123) -G GRP_VEN
passwd debora -e
useradd sebastiana -c "Sebastiana Moraes" -m -s /bin/bash -p $(openssl passwd -crypt Senha123) -G GRP_VEN
passwd sebastiana -e
useradd roberto -c "Roberto Malaquias" -m -s /bin/bash -p $(openssl passwd -crypt Senha123) -G GRP_VEN
passwd roberto -e
useradd josefina -c "Josefina Amancio" -m -s /bin/bash -p $(openssl passwd -crypt Senha123) -G GRP_SEC
passwd josefina -e
useradd amanda -c "Amanda Moreira" -m -s /bin/bash -p $(openssl passwd -crypt Senha123) -G GRP_SEC
passwd amanda -e
useradd rogerio -c "Rogerio Clotz" -m -s /bin/bash -p $(openssl passwd -crypt Senha123) -G GRP_SEC
passwd rogerio -e

# permissionamento dos diretórios
echo "Atribuindo permissionamentos..."
chmod 777 /publico

chown root:GRP_ADM /adm
chmod 770 adm

chown root:GRP_VEN /ven
chmod 770 ven

chown root:GRP_SEC /sec
chmod 770 sec

echo "Pronto!"

