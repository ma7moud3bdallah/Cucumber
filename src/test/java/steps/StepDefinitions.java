package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefinitions {
    // Fields
    private WebDriver driver;

    // Methods
    @Given("The user is in the login page")
    public void toLoginPage(){
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
    }
    @When("The user enter valid {string} and {string}")
    public void login(String username,String password){
        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();
    }
    @Then("Then The user will be directed to the homepage")
    public void toHomePage(){
        System.out.println(driver.findElement(By.className("app_logo")).getText());
    }
}
