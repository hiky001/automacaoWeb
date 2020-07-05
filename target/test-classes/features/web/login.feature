#language: pt
#enconding: UTF-8
#author: henrique.silva
#date: 03/07/2000
#version: 1.0

Funcionalidade: Validar login da aplicação

  Cenario: Realizar login na aplicação com usuário cadastrado
    Dado que clico no botão "Entre ou Cadastre-se"
    E preencho os dados de login com usuário "cadastrado"
    Quando clico em "Continuar"
    Entao vizualizo a tela inicial com meu usuário logado

