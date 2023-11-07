# Wompi
El objetivo general es implementar la automatizacion hacia la pagina web https://checkout.co.uat.wompi.dev/l/stagtest_VPOS_bdQraT, específicamente al flujo que tiene la aplicacion para poder comprobar el estado de una transaccion. A manera de obtener un sistema que pueda ser ejecutado para realizar uso de diferentes medios de pago satisfactorios.

#HERRAMIENTAS UTILIZADAS Se emplea el IDE de IntelliJ. Se usa el driver de google en su ultima version 118.0.5993.120 para ejecucion de la automatizacion. SerenityBDD, Screenplay, lenguaje Gherkin, Cucumber.

#ESTRATEGIA DE AUTOMATIZACIÓN. El proyecto hace uso del patrón Screenplay, con Cucumber y Gradle. Screenplay se orienta en el usuario y específicamente en las tareas, además utiliza los principios S.O.L.I.D. Con este patrón de pruebas se pueden escribir en un lenguaje más natural y entendible. El proyecto se estructura de la siguiente manera: Task: Son las tareas que realiza el actor a nivel de negocio. User-Interface: Donde se realiza el mapeo de los target con los que el usuario interactúa. Question: Donde se realizan los Assert y las verificaciones del proceso. Model: Clases donde se encuentran los objetos complejos de negocio. Feature: Donde se narran los casos de prueba utilizando el lenguaje Gherkin.

#DESCRIPCIÓN GENERAL AUTOMATIZACIONES

Las automatizaciones fueron a los procesos de pago PSE, pago QR y pago por transferencia a lo cual se le hizo el debido flujo para poder ejecutar la transaccion. A estos tres escenarios se le realizo un escenario outline donde se validara el proceso de aprobado, declinado y con error.
Los datos ingresados fueron manejados por medio de un data table para mayor practicidad dado el tiempo de la prueba.
#Escenarios
Feature: Automate transactions by payment methods pse

  Background:
    Given The user enters the Wompi payments page

  Scenario Outline:
    When The user enter all data neccesary
      | <amount> | <email> | <fullName> | <cel> | <typeBank> | <typeDocument> | <numDoc> |
    Then The transaction is validated
    |<typeBank>|
    Examples:
      | amount | email                  | fullName         | cel        | typeBank                  | typeDocument | numDoc    |
      | 200000 | juan97guzman@gmail.com | Juan Pablo Guzmn | 3017790918 | Banco que aprueba         | CC           | 112344268 |
      | 100000 | juan97guzman@gmail.com | Juan Pablo Guzma | 3017790928 | Banco que declina         | CC           | 112344269 |
      | 300000 | juan97guzman@gmail.com | Juan Pablo Guzan | 3017790938 | Banco que simula un error | CC           | 112344260 |

#Validaciones
En las validaciones que se plantearon a realizar fueron hechas a partir de los mensajes que muestra la pagina al finalizar la ejecucion de la transaccion. 

#TENER EN CUENTA ANTES DE EJECUTAR LA AUTOMATIZACIÓN

Tener el driver de la ultima version de google chrome dentro del proyecto.