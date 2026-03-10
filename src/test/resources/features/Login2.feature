Feature: Login
  As a registered user
  In order to access home page
  I want to login

  @smoke
 Scenario: Valid Login2
    Given The user is in the login page
    When The user enter valid credentials
      | username | standard_user |
      | password | secret_sauce  |
   Then The user will be directed to the homepage
# Examples:
#   | username      | password     |
#   | "standard_user" | "secret_sauce" |
#   | "visual_user"   | "secret_sauce" |
#   | "Mahmoud"       | "mahmoud123"   |

