# language: pt
# charset: UTF-8

@agapito
Funcionalidade: CRUD de novo usuário

  @post
  Cenário: Criar um novo usuário
    Dado que o usuário está no sistema Agapito Server
    E o usuário escolhe o menu Usuários
    E o usuário clica no botão novo usuário
    E o usuário preenche o campo "login" com "Robson Agapito"
    E o usuário preenche o campo "nome completo" com "Robson Agapito"
    E o usuário preenche o campo "email" com "Robson Agapito"
    E o usuário preenche o campo "idade" com "18"
    Quando o usuário clicar em salvar
    Então o usuário deveria ver a mensagem "Usuário foi criado com sucesso."

  @get
  Cenário: Consultar um novo usuário
    Dado que o usuário está no sistema Agapito Server
    E o usuário escolhe o menu Usuários
    E o usuário clica no botão novo usuário
    E o usuário preenche o campo "login" com "Robson Agapito"
    E o usuário preenche o campo "nome completo" com "Robson Agapito"
    E o usuário preenche o campo "email" com "Robson Agapito"
    E o usuário preenche o campo "idade" com "18"
    E o usuário clicar em salvar
    E o usuário clicar em voltar
    Quando o usuário consultar o último usuário cadastrado
    Então o usuário deveria ver "login" com "Robson Agapito"
    E o usuário deveria ver "nome completo" com "Robson Agapito"
    E o usuário deveria ver "email" com "Robson Agapito"
    E o usuário deveria ver "idade" com "18"

  @put
  Cenário: Editar um novo usuário
    Dado que o usuário está no sistema Agapito Server
    E o usuário escolhe o menu Usuários
    E o usuário clica no botão novo usuário
    E o usuário preenche o campo "login" com "Robson Agapito"
    E o usuário preenche o campo "nome completo" com "Robson Agapito"
    E o usuário preenche o campo "email" com "Robson Agapito"
    E o usuário preenche o campo "idade" com "18"
    E o usuário clicar em salvar
    E o usuário clicar em voltar
    Quando o usuário editar o último usuário cadastrado
    E o usuário preenche o campo "nome completo" com "Binho Fernandes" na Edição
    E o usuário clicar em salvar na Edição
    E o usuário clicar em voltar
    E o usuário consultar o último usuário cadastrado
    Então o usuário deveria ver "login" com "Robson Agapito"
    E o usuário deveria ver "nome completo" com "Binho Fernandes"
    E o usuário deveria ver "email" com "Robson Agapito"
    E o usuário deveria ver "idade" com "18"

  @delete
  Cenário: Deletar um usuário
    Dado que o usuário está no sistema Agapito Server
    E o usuário escolhe o menu Usuários
    E o usuário clica no botão novo usuário
    E o usuário preenche o campo "login" com "Robson Agapito"
    E o usuário preenche o campo "nome completo" com "Robson Agapito"
    E o usuário preenche o campo "email" com "Robson Agapito"
    E o usuário preenche o campo "idade" com "18"
    E o usuário clicar em salvar
    E o usuário clicar em voltar
    Quando o usuário deleta o último usuário cadastrado
    E o usuário confirma a deleção
    Então o usuário não deveria ver o registro deletado

  @esquema
  Esquema do Cenario: exemplo de scenario outline - <id>
    Dado que o usuário está no sistema Agapito Server
    E o usuário escolhe o menu Usuários
    E que o usuário acabou de cadastrar o código "<id>"
    E o usuário consultar o último usuário cadastrado
    Então o usuário deveria ver "login" com "<login>"

    Exemplos:
      | id    | login          |
      | 13214 | Robson Agapito |
      | 13215 | Robson Agapito |
      | 13216 | Robson Agapito |

