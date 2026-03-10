package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import java.util.Map;

public class StepDefinitions {
    // Fields
    private WebDriver driver;

    // Methods
    @Given("The user is in the login page")
    public void goToLoginPage(){
        driver = new EdgeDriver();
        driver.get("https://www.saucedemo.com/");
    }
    @When("The user enter valid credentials")
    public void login(io.cucumber.datatable.DataTable table){
        Map<String,String> map = table.asMap(String.class,String.class);
        driver.findElement(By.id("user-name")).sendKeys(map.get("username"));
        driver.findElement(By.id("password")).sendKeys(map.get("password"));
        driver.findElement(By.id("login-button")).click();
    }
    @Then("The user will be directed to the homepage")
    public void directedToHomepage(){
        System.out.println(driver.findElement(By.className("app_logo")).getText());
        driver.quit();
    }
}
