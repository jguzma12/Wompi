#Autor: Juan Pablo Guzman Quintero

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

