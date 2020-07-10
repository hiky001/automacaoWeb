#language: pt
#enconding: UTF-8
#author: henrique.silva
#date: 03/07/2000
#version: 1.0

Funcionalidade: Validar login da aplicação


  @login @web
  Cenario: Realizar login na aplicacao com usuario cadastrado
    Dado que clico no botao "Login"
    E preencho os dados de login com usuário cadastrado
    Quando clico em "Entrar"
    Entao visualizo a tela home com meu usuário logado
