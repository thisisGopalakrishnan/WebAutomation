package testNG;

import static org.testng.Assert.fail;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Data_provide {

	@DataProvider(name = "loginData")
	public Object[][] getdata() { // creating the 2 diamention array
		return new Object[][] { { "ydmin", "admin123" } };
// , { "Admin2", "pass2" }, { "Admin", "Admin12" } Additional login datas
	}
// , retryAnalyzer = RetryAnalyzer.class, "exceldata",dataProviderClass=Data_driven.class
	@Test(dataProvider = "exceldata",dataProviderClass=Data_driven.class)
	public void login(String Username, String password) throws InterruptedException {
		
			System.out.println("Username  " + Username + "  Password  " + password);
			WebDriverManager.edgedriver().setup();
			WebDriver driver = new EdgeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			// webelement wait for intract with the element
			WebDriverWait Wait = new WebDriverWait(driver, Duration.ofSeconds(10));	
			try {
			WebElement until = Wait
					.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='username']")));
			until.sendKeys(Username);
			} catch (Exception e) {
				System.out.println("Test failed due to an unknown issue: " + e.getMessage());
//			here We are using the Assertion for retring the test
				Assert.fail("Login test failed due to unexpected exception.");
				
			}
			WebElement pass = Wait
					.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='password']")));
			//
			pass.sendKeys(password);
			// String oldwindow = driver.getWindowHandle();
			driver.findElement(By.xpath("//button[@type='submit']")).click();
//			Thread.sleep(2000);
//			 Get the text from invalid credetials and store into invalidtext
			WebElement invalidtext = Wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[text()='Invalid credentials']")));
			
//			invalidtext = driver.findElement(By.xpath("//p[text()='Invalid credentials']"));
			// If invaid text shows close the driver.
			Thread.sleep(2000);
			if (invalidtext.isDisplayed()) {
				System.out.println("Login failed: Invalid credentials");
				driver.close();
			}
		System.out.println("Application closed");
	}

}
