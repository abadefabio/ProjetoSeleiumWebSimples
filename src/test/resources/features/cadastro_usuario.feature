# language: pt

  @cadastro
  Funcionalidade: Cadastro de usuario
    Eu como novo usuario quero me cadastrar na aplicacao para fazer compras

    @cadastro_sucesso
  Cenario: Registra novo usuario com sucesso
    Dado que estou na tela de login
    E acesso o cadastro de usuario
    Quando eu preencho o formulario de cadastro
    E clico em registrar
    Entao vejo a mensagem de cadastro realizado com sucesso