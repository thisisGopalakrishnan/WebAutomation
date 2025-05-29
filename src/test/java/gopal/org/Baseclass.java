package gopal.org;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.stepdefination.Stepdefination;
import org.stepdefination.Testing;
import org.testng.annotations.Test;

import com.google.common.io.Files;
import com.sun.java_cup.internal.runtime.Scanner;
import com.sun.java_cup.internal.runtime.Symbol;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	public static WebDriver driver;

	@Test
	public void edgebrowser() throws IOException, InterruptedException {
		WebDriverManager.edgedriver().setup();// driver = new ChromeDriver();
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		url("https://www.google.com");
		WebElement findElement = driver.findElement(By.id("APjFqb"));
		findElement.sendKeys("Abisheik");
		WebElement element = driver.findElement(By.xpath("//input[@name='btnK']"));
		jsclick(element);
		Thread.sleep(500);
		
		// CLICKING THE HIDDEN ELEMENTS USING JAVASCRIPTEXCECUTOR
//		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		PageFactory.initElements(driver, Stepdefination.class);
		PageFactory.initElements(driver, Testing.class);

	}

//CLICKING THE HIDDEN ELEMENTS USING JAVASCRIPTEXCECUTOR
	public static void jsclick(WebElement element) {
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
	}

//	@Test
	public void firefox() {
		WebDriverManager.firefoxdriver().driverVersion("0.32.2").setup();
		// Launch Firefox
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		WebElement findElement = driver.findElement(By.id("APjFqb"));
		findElement.sendKeys("Abisheik");

		WebElement clck = driver.findElement(By.xpath("//input[@name='btnK']"));
		clck.click();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		PageFactory.initElements(driver, Stepdefination.class);
		PageFactory.initElements(driver, Testing.class);

	}

	public static void url(String url) {
		driver.get(url);
	}

	public static void screenshot() throws IOException {
		File s = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(s, new File("C:\\Users\\GopalakrishnanG\\Pictures\\Camera Roll\\Screenshot1.jpeg"));
	}

	public static void scroll() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)", "");

	}

	public static void robotClass() throws AWTException {
		Robot robot = new Robot();
	}

	public static WebElement selectOptionByIndex(WebDriver driver, WebElement dropdownElement, int index) {
		Select select = new Select(dropdownElement);
		select.selectByIndex(index);
		return select.getOptions().get(index);

	}

	public static void elementwait(WebElement elemennt, WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(elemennt));

	}

	public static void findelement(WebElement element) {

		driver.findElement(By.xpath("element"));

	}

	public static void selectyeardatetime(WebDriver driver, String year, String date, String month) {

//	String Currentmonth =driver.findElement(By.xpath("//p[normalize-space()='May']")).getAttribute("placeholder");
//	
//	String currentyear =driver.findElement(By.xpath("//li[@class='oxd-calendar-selector-year']//p[1]")).getText();
//	
//	String cureentdate = driver.findElement(By.xpath("//div[@class='oxd-calendar-dates-grid']")).getText();

		while (true) {
			String currentmonth = driver.findElement(By.xpath("//p[normalize-space()='May']"))
					.getAttribute("placeholder");

			String currentyear = driver.findElement(By.xpath("//li[@class='oxd-calendar-selector-year']//p[1]"))
					.getText();

			if (currentmonth.equals(month) && currentyear.equals(year)) {

				break;
			}
			driver.findElement(By.xpath("//i[@class='oxd-icon bi-chevron-right']")).click();

		}
		List<WebElement> currentdate = driver.findElements(By.xpath("//div[@class='oxd-calendar-dates-grid']"));
		for (WebElement dt : currentdate) {
			if (dt.getText().equals(date)) {
				dt.click();
				break;
			}
		}
	}

}
