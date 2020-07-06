#language: pt
#enconding: UTF-8
#author: henrique.silva
#date: 03/07/2000
#version: 1.0

Funcionalidade: Teste execucao Site Porto Seguro

  @login @web
  Cenario: Realizar login na aplicacao com usuario cadastrado
    Dado que clico no botao "Seu Barriga"
    E preencho os dados de login com usuário "cadastrado"
    Quando clico em "Continuar"
    Entao visualizo a tela inicial com meu usuário logado
