package org.stepdefination;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import gopal.org.Pojo;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Testing extends Pojo {


	@Given("I am on the login page")
    public void iAmOnTheLoginPage() throws IOException, InterruptedException {
      edgebrowser();
      url("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @When("I enter {string} and {string}")
    public void iEnterAnd(String username, String password) {
        WebElement name = driver.findElement(By.xpath("//input[@name='username']"));
        name.sendKeys(username);
     

        WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
        pass.sendKeys(password);
  
    }

    @When("I click the login button")
    public void iClickTheLoginButton() throws InterruptedException {
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//li[@class='oxd-main-menu-item-wrapper'])[3]")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//a[text()='Apply']")).click();	
    Thread.sleep(2000);
    scroll();
   // driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']")).click();
    driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("2024-10-10");
    // selectyeardatetime(driver, "2025", "17", "June");
    Thread.sleep(3000);
    }	
    @When("going to apply leave")
    public void goingToApplyLeave() {  
   
    }

    @Then("I should be logged in as {string}")
    public void iShouldBeLoggedInAs(String string) {
   // driver.quit();
}




}
