#Autor: Juan Pablo Guzman Quintero

Feature: Automate transactions by payment methods transfer

  Background:
    Given The user enters the Wompi payments page transfer

  Scenario Outline:
    When The user enter all data neccesary transfer
      | <amount> | <email> | <fullName> | <cel> | <typeBank> |
    Then The transaction is transfer validated
      | <typeBank> |
    Examples:
      | amount | email                  | fullName         | cel        | typeBank |
      | 200000 | juan97guzman@gmail.com | Juan Pablo Guzmn | 3017790918 | APPROVED |
      | 100000 | juan97guzman@gmail.com | Juan Pablo Guzma | 3017790928 | DECLINED |
      | 300000 | juan97guzman@gmail.com | Juan Pablo Guzan | 3017790938 | ERROR    |

