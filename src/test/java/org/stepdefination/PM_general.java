package org.stepdefination;

import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import gopal.org.Pojo;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PM_general extends Pojo{
	@Given("open the browser and open the web page for the ERP with right credential")
	public void open_the_browser_and_open_the_web_page_for_the_erp_with_right_credential() throws InterruptedException, IOException {
	    edgebrowser();
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    url("https://qa-erp.e-consystems.net/");
	    Username.sendKeys("purchasehead@e-consystems.com");
	    id.sendKeys("Purchasehead123");
	    signin.click();
		try {
			WebElement logo = wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//img[@class = 'logo-src']"))));
			if (!logo.equals(null)) {
				System.out.println("Logo is presented");
			} 
		} catch (Exception e) {
			System.out.println("Log is not presented");
			 
		}
//	    WebElement x = driver.f	indElement(By.xpath("(//a[@class = 'nav-link'])[1]"));
//		WebElement x = driver.findElement(By.xpath("(//a[@class = 'nav-link'])[1]"));
		
		try {
			WebElement navigationLink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@class='nav-link'])[1]")));
			if (navigationLink != null) {
	            System.out.println("Navigation link is present. Logged in successfully.");
			
		}} catch (Exception e) {
			WebElement text1 = driver.findElement(
					By.xpath("//b[text()=' The Login ID/Password you have entered is invalid, please try again ']"));
			String y1 = text1.getText();
			System.out.println(y1);
		}
		
		
		} 
	
	@When("handle the PM general")
	public void handle_the_pm_general() throws InterruptedException {
		
		issues.click();
		plusbutton.click();
		request.click();
		selectOptionByIndex(driver, request, 0);
	WebElement branch = driver.findElement(By.xpath("(//select[@class='form-control small-view ng-untouched ng-pristine ng-valid ng-star-inserted'])[2]"));
	String Branch = branch.getText();
	System.out.println("Branch name"+Branch);
	//WebElement warehouse = driver.findElement(By.xpath("(//div[@class='form-group mar-botm-group'])[3]"));
	
		Select select=new Select(driver.findElement(By.xpath("(//select)[3]")));
		List<WebElement> warehouse = select.getOptions();
		for (int i = 0; i < warehouse.size(); i++) {
			select.selectByIndex(i);
			Thread.sleep(2);
			WebElement selectedoption = select.getFirstSelectedOption();
			Thread.sleep(2);
			System.out.println("Selected inside the dropdown warehouse name "+ selectedoption.getText());
			Select select1=new Select(driver.findElement(By.xpath("(//select)[4]")));
			Thread.sleep(2);
			WebElement storeorunit = select1.getFirstSelectedOption();
			System.out.println("Selected inside the dropdown Store or unit"+ storeorunit.getText());	
		}

		Select purposee =new Select(purpose);
		List<WebElement> Purpose=	purposee.getOptions();		
		for (int i = 0; i < Purpose.size(); i++) {
			purposee.selectByIndex(i);
			WebElement firstSelectedOption = purposee.getFirstSelectedOption();
			System.out.println("selected option inside the Purpose dropdown:" + firstSelectedOption.getText());
		}
		
		Select initiator =new Select(initiatorname);
		WebElement firstSelectedOption = initiator.getFirstSelectedOption();
		System.out.println("Initiator name"+ firstSelectedOption.getText());
//		Date and Time Selection
		date.click();
		date.sendKeys("04-06");
		Thread.sleep(5);
	}
		 
	

	@Then("Close the browser.")
	public void close_the_browser() throws InterruptedException {
	   
		Thread.sleep(3);
		//driver.close();
		
		
		
	}
}
