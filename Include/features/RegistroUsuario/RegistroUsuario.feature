#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

@tag
Feature: Registro de usuario
  Yo como usuario deseo registrarme en la aplicación para tener acceso a todo

  @tag1
  Scenario Outline: Registro de usuario
    Given que he ingresado a la página principal de Registro
    And he ingresado en el campo Usename <Username>
    And he ingresado en el campo Email <Email>
    And he ingresado en el campo Password <Password1>
    And he ingresado en el campo Confirm Password <Password2>
    And he seleccionado en el campo Date
    And he ingresado en el campo Phone <Phone>
    And he seleccionado en el campo Choose Gender
    And he seleccionado en el campo Terms and Conditions   
    When seleccione el botón SignUp
    Then Debería visualizar el registro limpio

    Examples: 
      | Username  			| Email 				 | Password1  	 |Password2  		| Phone			  |
      | Liced Lorena 		| Lto@gmail.com	 | 5r8fCJ9Enso=  |5r8fCJ9Enso=  | 3103611725	|
      | Liced TORO	| LtoDD@gmail.com	   | 5r8fCJ9Enso=  |5r8fCJ9Enso=  | 3102544857	|