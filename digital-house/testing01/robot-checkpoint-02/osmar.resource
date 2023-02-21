*** Settings ***
Library    SeleniumLibrary
# Osmar Franco de Toledo Junior

*** Variables ***
${SITE}            https://demo.spreecommerce.org/
${NAVEGADOR}       Chrome
${SHOP_NOW}        xpath=//a[contains(text(),'Shop Now')]

${WOMEN}           xpath=//a[contains(text(),'Women')]
${MEN}             xpath=//a[contains(text(),'Men')]
${SPORTSWEAR}      xpath=//a[contains(text(),'Sportswear')]

${DRESSES}         xpath=//a[contains(text(),'Dresses')]

${FLORAL}          xpath=//img[@alt='Floral Wrap Dress']
${POLO}            xpath=//img[@alt='Polo T Shirt']
${RUNNING}         xpath=//img[@alt='Running Sweatshirt']

${INCREASE_BTN}    css=.quantity-select-increase
${ADD_CARRINHO}    id=add-to-cart-button
${VER_CARRINHO}    xpath=//a[contains(text(),'View cart')]
${CHECKOUT}        id=checkout-link


*** Keywords ***
Processo de compra da Floral Wrap Dress no site Spree
01-Acessar a loja Spree
  Open Browser             ${SITE}  ${NAVEGADOR}
  Maximize Browser Window
  Sleep    2s
  Click Element            ${SHOP_NOW}

01-Pesquisar pelo produto e seleciona-lo
  Click Element   ${WOMEN}
  Sleep    2s
  Click Element   ${DRESSES}
  Sleep    2s
  Click Element   ${FLORAL}
  Sleep    2s

01-Validar o preço, customizar e incluir na sacola
  Page Should Contain   $71.99
  Click Element   css=g:nth-child(2) > circle:nth-child(1)
  Sleep    2s
  Click Element   css=li:nth-child(2) .d-flex span
  Sleep    2s
  Click Element   css=li:nth-child(3) .d-flex span
  Sleep    2s
  Click Element   ${ADD_CARRINHO}
  Sleep    2s
  Click Element   ${VER_CARRINHO}
  Sleep    2s

01-Validar informações do checkout e fechar o pedido
  Page Should Contain   Size: Xs
  Page Should Contain   Length: Mini
  Page Should Contain   Color: Black
  Click Element   ${CHECKOUT}
  Sleep    3s
  Close Browser

Processo de compra da Polo T Shirt no site Spree
02-Acessar a loja Spree
  Open Browser             ${SITE}  ${NAVEGADOR}
  Maximize Browser Window
  Sleep    2s
  Click Element            ${SHOP_NOW}

02-Pesquisar pelo produto e seleciona-lo
  Click Element   ${MEN}
  Sleep    2s
  Click Element   ${POLO}
  Sleep    2s

02-Validar o preço, customizar e incluir na sacola
  Page Should Contain   $10.99
  Click Element   css=g:nth-child(2) > circle:nth-child(1)
  Sleep    2s
  Click Element   css=.select-label
  Sleep    2s
  Click Element   ${INCREASE_BTN}
  Sleep    2s
  Click Element   ${INCREASE_BTN}
  Sleep    2s
  Click Element   ${ADD_CARRINHO}
  Sleep    2s
  Click Element   ${VER_CARRINHO}
  Sleep    2s

02-Validar informações do checkout e fechar o pedido
  Page Should Contain   Size: Xs
  Page Should Contain   Color: Light Blue
  Page Should Contain   $32.97
  Click Element   ${CHECKOUT}
  Sleep    3s
  Close Browser

Processo de compra da Running Sweatshirt no site Spree
03-Acessar a loja Spree
  Open Browser             ${SITE}  ${NAVEGADOR}
  Maximize Browser Window
  Sleep    2s
  Click Element            ${SHOP_NOW}

03-Pesquisar pelo produto e seleciona-lo
  Click Element   ${SPORTSWEAR}
  Sleep    2s
  Click Element   ${RUNNING}
  Sleep    2s

03-Validar o preço, customizar e incluir na sacola
  Page Should Contain   $78.99
  Click Element   css=g:nth-child(2) > circle:nth-child(1)
  Sleep    2s
  Click Element   css=.select-label
  Sleep    2s
  Click Element   ${INCREASE_BTN}
  Sleep    2s
  Click Element   ${ADD_CARRINHO}
  Sleep    2s
  Click Element   ${VER_CARRINHO}
  Sleep    2s

03-Validar informações do checkout e fechar o pedido
  Page Should Contain   Size: Xs
  Page Should Contain   Color: Light Blue
  Page Should Contain   $157.98
  Click Element   ${CHECKOUT}
  Sleep    3s
  Close Browser