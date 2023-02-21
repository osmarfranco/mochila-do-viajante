*** Variables ***
${SITE}  https://www.saucedemo.com/
${BROWSER}  Chrome
${USER_FIELD}  id=user-name
${PASSWORD_FIELD}  id=password
${LOGIN_BUTTON}  id=login-button

*** Keywords ***
Abrir o site da loja Sauce Demo
  Open Browser    ${SITE}  ${BROWSER}
  Maximize Browser Window

Fazer login
  Input Text           ${USER_FIELD}  standard_user
  Input Text           ${PASSWORD_FIELD}  secret_sauce
  Click Element        ${LOGIN_BUTTON}
  Page Should Contain  Products

