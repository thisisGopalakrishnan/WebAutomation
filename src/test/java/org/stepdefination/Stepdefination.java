package org.stepdefination;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.AssertJUnit;
import org.testng.asserts.SoftAssert;

import com.github.dockerjava.api.model.UpdateContainerResponse;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v112.browser.Browser;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import gopal.org.Baseclass;
import gopal.org.Pojo;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class Stepdefination extends Pojo {

	@Given("open the browser and open the web page for the ERP")
	public void openTheBrowserAndOpenTheWebPageForTheERP() throws IOException, InterruptedException {
		edgebrowser();
		url("https://qa-erp.e-consystems.net/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement logo = driver.findElement(By.xpath("//img[@class = 'logo-src']"));
		if (logo != null) {
			if (logo.isDisplayed()) {
				System.out.println("Logo is displayed");
			} else {
				System.out.println("Logo is Not displayed");
			}
		} else {
			System.out.println("Log is not present");
		}
	}

	@When("login with correct credentials {string} and {string}")
	public static void loginWithCorrectCredentialsAnd(String username, String password) throws InterruptedException, AWTException {
		Robot robot = new Robot();
		Username.sendKeys(username);
		id.sendKeys(password);
		checkbox.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("remembermeCheck")));
		// Thread.sleep(3000);
		element.click();
		signin.click();
		String title = "EC View | Your Gateway for Inventory Tracking";
		// assertEquals(title, "EC View | Your Gateway for Inventory tracking"); //Hard
		// Assertion
		// SoftAssert soft = new SoftAssert();
		// soft.assertEquals(title, "EC View | Your Gateway for Inventory Tracking");
		// //Soft Assertion
		WebElement x = driver.findElement(By.xpath("(//a[@class = 'nav-link'])[1]"));
		if (x != null) {
			x.click();
			System.out.println("logged in successfuly");
		} else {
			WebElement text = driver.findElement(
					By.xpath("//b[text()=' The Login ID/Password you have entered is invalid, please try again ']"));
			String y = text.getText();
			System.out.println(y);
		}
		scroll();
		issues.click();
		plusbutton.click();
		request.click();
		selectOptionByIndex(driver, request, 2);

		Thread.sleep(2000);
		WebElement s = driver.findElement(By.xpath("//label[text()='Branch']"));
		System.out.println("trialRun" + s.getText());
		Thread.sleep(2000);
		diableddropdown.click();
		// selectOptionByIndex(driver, diableddropdown, 0);
		WebElement d = diableddropdown;
		String m = d.getText();
		System.out.println(m);
		// warehouse selection and print

		Warehouseunitz.click();
		selectOptionByIndex(driver, Warehouseunitz, 3);
		// Thread.sleep(2000);
		// Create a Select object
		Select select = new Select((driver.findElement(By.xpath("(//select)[4]"))));
		Thread.sleep(2000);
		// Get all options within the dropdown
		List<WebElement> options = select.getOptions();
		// Print the text of each option
		System.out.println("Options in the source warehouse dropdown:");
		for (WebElement Ware : options) {
			System.out.println(Ware.getText());
		}
		// print the selected source warehouse
		WebElement firstSelectedOption = select.getFirstSelectedOption();
		System.out.println("Selected Option in the source warehouse dropdown" + firstSelectedOption.getText());
		// source store print the selected name
		System.out.println("option from source store");
		Select select1 = new Select((driver.findElement(By.xpath("(//select)[5]"))));
		WebElement sourcestore = select1.getFirstSelectedOption();
		System.out.println("source store" + sourcestore.getText());
	
		// print all the text from destination warehouse
		
		Select select2 = new Select((driver.findElement(By.xpath("(//select)[6]"))));
		List<WebElement> destinationware = select2.getOptions();
		
		for (int i = 0; i < destinationware.size(); i++) {
			select2.selectByIndex(i);
			WebElement selectedOptions = select2.getFirstSelectedOption();
			System.out.println("Destinatiowarehoues:  " + selectedOptions.getText());
			Select destination = new Select((driver.findElement(By.xpath("(//select)[7]"))));// Destination
			WebElement destinationtext = destination.getFirstSelectedOption();
			System.out.println("Destination unit;" + destinationtext.getText());
		}
	
		WebElement requesttime = driver.findElement(
				By.xpath("(//input[@class=\"form-control small-view ng-untouched ng-pristine ng-star-inserted\"])[3]"));
		//java script executor
		String requestime = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value",
				requesttime);
		WebElement isuuestatus = driver.findElement(By.xpath("(//input[@type='text'])[5]"));
		String statusissue = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value",
				isuuestatus);
		WebElement requestdatee = Requestdate;
		String requestdat = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value",
				requestdatee);
		WebElement requestnume = Requestnumber;
		String requestnum = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value",
				requestnume);
		// print the text
		System.out.println("Requested time and date: " + requestime);
		System.out.println("issue ststus; " + statusissue);
		System.out.println("Requestnumber; " + requestnum);
		System.out.println("Requestdate; " + requestdat);
		// Robot Class
		Requestorname.sendKeys("Gopal");
		Requestorname2.sendKeys("Todd");
		Projectname.sendKeys("pro");
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		Productcode.sendKeys("CIL078");
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		WebElement Material = driver.findElement(By.id("form_grid_0"));
		System.out.println("Material grid ;" + Material.getText());
	}

	@Then("close the application.")
	public void closeTheApplication() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();

	}

}

// @Given("enter google")
//
// public void enter_google() throws IOException {
// shortcuts();
// }
//
// @When("ipaddress")
// public void ipaddress() throws IOException {
//
// browser();
// url("https://www.amazon.in/");
// Username.sendKeys("mobile");
// id.click();
//// driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile");
//// driver.findElement(By.id("nav-search-submit-button")).click();
// scroll();
//
// }
//
// @Then("close")
// public void close() {

// }
