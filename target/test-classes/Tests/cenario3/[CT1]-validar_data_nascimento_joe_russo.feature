# language: pt
# encofing: UTF-8

@Buscar
Funcionalidade: Validar Data nascimento 'Joe Russo'

  @Buscar
  Cenário: Validar data de nascimento 'Joe Russo'
    Dado que navego na url do google
    Quando insiro no campo de perquisa 'Joe Russo'
    E clico no botao 'Pesquisa Google'
    Então capturo a data de nascimento do diretor 'Joe Russo'
