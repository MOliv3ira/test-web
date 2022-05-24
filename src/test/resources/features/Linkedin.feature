# language: pt
# charset: UTF-8

@linkedin
Funcionalidade: Login Linkedin
  Eu como cliente gostaria de acessar o sistema via login somente com credenciais validas

  @valido
  Cenario: Executar login valido
    Dado que estou na pagina de login
    Quando efetuar o login com credencias validas
    Entao vai ser apresentado a tela do menu principal

  @fillField
  Cenario: Executar login valido - fill field
    Dado que estou na pagina de login
    E o usuario preenche o campo "login" com "msdv.oliveira@outlook.com"
    E o usuario preenche o campo "password" com "****"
    Quando o usuário clicar em entrar
    Entao vai ser apresentado a tela do menu principal

  @postlinkedin
  Cenario: Executar post
    Dado que estou na pagina de login
    E efetuar o login com credencias validas
    E vai ser apresentado a tela do menu principal
    Quando usuario clica em começar publicação
    E o usuario escrever um "post" com "Essa publicação foi feita através de uma automação  de software."
    E clicar em publicar
    Entao o post devera aparecer na tela do menu principal


