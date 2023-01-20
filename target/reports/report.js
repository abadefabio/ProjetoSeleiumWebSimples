$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:features/cadastro_usuario.feature");
formatter.feature({
  "name": "Cadastro de usuario",
  "description": "    Eu como novo usuario quero me cadastrar na aplicacao para fazer compras",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@cadastro"
    }
  ]
});
formatter.scenario({
  "name": "Registra novo usuario com sucesso",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@cadastro"
    },
    {
      "name": "@cadastro_sucesso"
    }
  ]
});
formatter.step({
  "name": "que estou na tela de login",
  "keyword": "Dado "
});
formatter.match({
  "location": "LoginSteps.que_estou_na_tela_de_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "acesso o cadastro de usuario",
  "keyword": "E "
});
formatter.match({
  "location": "LoginSteps.acesso_o_cadastro_de_usuario()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu preencho o formulario de cadastro",
  "keyword": "Quando "
});
formatter.match({
  "location": "CadastroSteps.eu_preencho_o_formulario_de_cadastro()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clico em registrar",
  "keyword": "E "
});
formatter.match({
  "location": "CadastroSteps.clico_em_registrar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "vejo a mensagem de cadastro realizado com sucesso",
  "keyword": "Entao "
});
formatter.match({
  "location": "CadastroSteps.vejo_a_mensagem_de_cadastro_realizado_com_sucesso()"
});
formatter.result({
  "status": "passed"
});
});