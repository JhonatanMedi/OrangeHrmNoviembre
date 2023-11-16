#Proyecto de pruebas y cargado en Github
#27/01/2020
#Jhonatan Medina Blanco
Feature: yo como usuario valido login

  @Regresion
    @HU001
  Scenario Outline: Login exitoso
    Given abrir el navegador
    When el usuario diligenica usuario <userName> diligencia password <password>

    Examples:
      | userName | password |
      | Admin    | admin123 |
