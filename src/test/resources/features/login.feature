#language: pt
#enconding: UTF-8
#author: henrique.silva
#date: 03/07/2000
#version: 1.0

Funcionalidade: Teste execucao Site Porto Seguro

#  Cenario: Realizar o cadastro de usuário
#    Dado que clico no botão "Novo usuário?"
#    E preencho os dados de login
#    Quando clico em "Cadastrar"
#    Entao visualizo a tela inicial com meu usuário logado

  @login @web
  Cenario: Realizar login na aplicacao com usuario cadastrado
    Dado que clico no botao "Login"
    E preencho os dados de login com usuário cadastrado
    Quando clico em "Entrar"
    Entao visualizo a tela inicial com meu usuário logado
