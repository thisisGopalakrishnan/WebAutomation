package testNG;

import java.time.Duration;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.FirefoxDriverManager;

public class Nextgeration {

	@BeforeMethod
	public void driverinitialtion() {
		WebDriverManager.firefoxdriver().driverVersion("0.32.2").setup();
		WebDriverManager.edgedriver().setup();
	}

	@Test(priority = 3)

	private void firefox() throws InterruptedException {
		// Launch Firefox
		WebDriverManager driver = new FirefoxDriverManager();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		Thread.sleep(2000);
		WebElement findElement = driver.findElement(By.xpath("(//a[@id='endpoint'])[6]"));
		Thread.sleep(1000);
		findElement.click();
//	((JavascriptExecutor) driver).executeScript("arguments[0].click();", findElement);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement thumbnail = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@title, 'Good Bad Ugly Tamil Teaser')]")));
		thumbnail.click();
		Thread.sleep(500);
		WebElement Fullscreen = driver.findElement(By.xpath("(//button[@class='ytp-fullscreen-button ytp-button'])[1]"));
	   ((JavascriptExecutor) driver).executeScript("arguments[0].click();", Fullscreen);
		
	}

	@Test(priority = 2)
	private void Edge() throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
//		driver.get("https://www.youtube.com/");
		WebElement findElement = driver.findElement(By.xpath("//yt-formatted-string[normalize-space()='Trending']"));
		findElement.click();
//		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
		WebElement thumnail = driver.findElement(By.xpath("(//a[@id='video-title'])[7]"));
		thumnail.click();
		WebElement Fullscreen = driver.findElement(By.xpath("(//button[@class='ytp-fullscreen-button ytp-button'])[1]"));
		Fullscreen.click();
	}

//	we can provide the data from .XMLfile using the parameter keyword
	@Test(priority = 1)
	@Parameters({ "username", "password" })
	public void loginTest(String user, String pass) {
		System.out.println("Username: " + user);
		System.out.println("Password: " + pass);
	}
}
