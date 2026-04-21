Feature: Login
  As a registered user
  In order to access home page
  I want to login
  @smoke
Scenario Outline:
  Given The user is in the login page
  When The user enter valid "<username>" and "<password>"
  Then Then The user will be directed to the homepage
  Examples:
    | username         | password     |
    | standard_user    | secret_sauce |
    | visual_user      | secret_sauce |
    | mahmoud_abdallah | mahmoud123   |

