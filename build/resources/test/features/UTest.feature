#Autor: Xiomara Cortes
@stories
Feature: Utest
  Como usuario quiero crear una cuenta en la página Utest.com.

  @scenario1
  Scenario: Registro en lapafina UTest
    Given :Juan quiere registrase en Utestcom primer paso
      | strNombre  | strApellido |
      | strEmail  | strLenguaje |
    When :Él continua registrandose en las secciones 2,3 y 4
      | strCiudad  | intCodigo| srtPais| strDispositivo |intVersion| strLenguaje | strContrasena |strConfirmarCon| strTerminos|

    Then : El confirma que ya este en la pagina de Utest
      | StrHome  |