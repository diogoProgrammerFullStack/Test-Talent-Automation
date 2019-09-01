#language: pt
#Author: Diogo Oliveira
#Version: 1.0
#Encoding: UTF-8
Funcionalidade: - Criacao de e-mail no gmail

  @CT001 @chrome @Regressivo
  Cenario: CT001 - Verificar criacao de e-mail no gmail com sucesso
    Dado que estou na home do gmail
    Quando faco cadastramento completo de dados para criacao do email 
    E clico em "Ok"
    Entao devo visualizar a mensagem welcome
    E devo visualizar a mensagem account created


