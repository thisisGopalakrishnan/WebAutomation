package gopal.org;

import java.io.IOException;
import java.util.Set;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Pojo extends Baseclass {

	@Test
	public void shortcuts() throws IOException, InterruptedException {
		edgebrowser();
		url("https://leafground.com/window.xhtml");
		String oldWindow = driver.getWindowHandle();
		WebElement openNewindow = driver.findElement(By.id("j_idt88:new"));
		openNewindow.click();
		Set<String> mulpilewindow = driver.getWindowHandles();
		for (String newwindow : mulpilewindow) {
			driver.switchTo().window(newwindow);
		}
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("HIIIIIII");
		driver.close();

		driver.switchTo().window(oldWindow);
//count for number of windows opened.
		WebElement numberofwindows = driver.findElement(By.xpath("(//button[@type='button'])[2]"));
		numberofwindows.click();
		int windowscount = driver.getWindowHandles().size();
		System.out.println("NUMBEROFOPENWINDOWS; " + windowscount);
//close all windows except parent window
		WebElement closetabs = driver.findElement(By.xpath("(//button[@type='button'])[3]"));
		closetabs.click();
		Set<String> primary = driver.getWindowHandles();
		for (String allwindows : primary) {
			if (!allwindows.equals(oldWindow)) {
				driver.switchTo().window(allwindows);
				driver.close();
			}

		}
	}

//@Test
	public void iframes() throws IOException, InterruptedException {

		edgebrowser();
		url("https://leafground.com/frame.xhtml;jsessionid=node0bj446171qpz518gll02tenyaf797893.node0");
		driver.switchTo().frame(0);
		WebElement frame = driver.findElement(By.id("Click"));
		frame.click();
		System.out.println("clicked");
		driver.switchTo().defaultContent();

		driver.switchTo().frame(2);
		driver.switchTo().frame("frame2");
		WebElement nestedFrame = driver.findElement(By.id("Click"));
		nestedFrame.click();
		driver.switchTo().defaultContent();

		java.util.List<WebElement> totalsizeofframes = driver.findElements(By.tagName("iframe"));
		int size = totalsizeofframes.size();
		System.out.println(size);

	}

	// login page
	@FindBy(id = "loginkey")
	public static WebElement Username;
	@FindBy(id = "password")
	public static WebElement id;
	@FindBy(id = "remembermeCheck")
	public static WebElement checkbox;
	@FindBy(xpath = "//button[@Class='btn btn-block btn-flat sign-btn']")
	public static WebElement signin;
//stocks
	@FindBy(xpath = "(//a[@class = 'nav-link'])[1]")
	public static WebElement stocks;
	@FindBy(xpath = "(//a[@class = 'nav-link'])[2]")
	public static WebElement RawmaterialStocks;
	@FindBy(xpath = "(//a[@class = 'nav-link'])[25]")
	public static WebElement settings;
	@FindBy(xpath = "//a[text() ='Receipt']")
	public static WebElement Receipt;

	// Issues
	@FindBy(xpath = "//a[text() ='Issues']")
	public static WebElement issues;
	@FindBy(xpath = "//*[@id=\"head\"]/div[2]/button")
	public static WebElement plusbutton;
	@FindBy(xpath = "(//Select[@class='form-control small-view ng-untouched ng-pristine ng-valid ng-star-inserted'])[1]")
	public static WebElement request;
	@FindBy(xpath = "//button[@class='btn btn-default float-right']")
	public static WebElement Cancelbutton;
	@FindBy(xpath = "(//div[@class='form-group mar-botm-group'])[2]")
	public static WebElement branch;
	@FindBy(xpath = "//option[text()='E-Con MEPZ']")
	public static WebElement diableddropdown;
	@FindBy(xpath = "//label[text()='Warehouse']")
	public static WebElement Warehouse;
	@FindBy(xpath = "(//select)[4]")
	public static WebElement Warehouseunitz;
	@FindBy(xpath = "(//input[@type='text'])[1]")
	public static WebElement Requestorname;
	@FindBy(xpath = "(//input[@type='text'])[2]")
	public static WebElement Requestorname2;
	@FindBy(xpath = "(//input[@type='text'])[3]")
	public static WebElement Projectname;
	@FindBy(xpath = "(//input[@type='text'])[4]")
	public static WebElement Productcode;
	@FindBy(xpath = "(//input[@type='text'])[5]")
	public static WebElement issuestatus;
	@FindBy(xpath = "(//input[@type='text'])[6]")
	public static WebElement Requestdate;
	@FindBy(xpath = "(//input[@type='text'])[8]")
	public static WebElement Requestnumber;

//	PM GENERAL
	@FindBy(xpath = "(//select)[5]")
	public static WebElement purpose;
	@FindBy(xpath = "(//select)[7]")
	public static WebElement initiatorname;

	@FindBy(xpath = "//input[@type='date']")
	public static WebElement date;
}
