#language: pt
#enconding: UTF-8
#author: henrique.silva
#date: 10/07/2000
#version: 1.0

  Funcionalidade: Realizar cadastro no site

    @cadastro @web
    Cenario: Realizar cadastro com sucesso de um cliente válido
      Dado que clico no botao "Novo usuário?"
      E preencho os dados de cadastro
      Quando clico em cadastrar
      Entao visualizo a mensagem "Usuário inserido com sucesso"
