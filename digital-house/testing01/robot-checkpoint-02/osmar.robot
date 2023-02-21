# Osmar Franco de Toledo Junior

*** Settings ***
Library     SeleniumLibrary
Resource    ./osmar.resource

*** Test Case ***
Processo de compra da Floral Wrap Dress no site Spree
    01-Acessar a loja Spree
    01-Pesquisar pelo produto e seleciona-lo
    01-Validar o preço, customizar e incluir na sacola
    01-Validar informações do checkout e fechar o pedido

Processo de compra da Polo T Shirt no site Spree
    02-Acessar a loja Spree
    02-Pesquisar pelo produto e seleciona-lo
    02-Validar o preço, customizar e incluir na sacola
    02-Validar informações do checkout e fechar o pedido

Processo de compra da Running Sweatshirt no site Spree
    03-Acessar a loja Spree
    03-Pesquisar pelo produto e seleciona-lo
    03-Validar o preço, customizar e incluir na sacola
    03-Validar informações do checkout e fechar o pedido