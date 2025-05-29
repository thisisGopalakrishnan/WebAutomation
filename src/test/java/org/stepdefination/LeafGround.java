package org.stepdefination;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

import antlr.collections.List;
import gopal.org.Pojo;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LeafGround extends Pojo {

	@Given("Haldle the iframes")
	public void haldle_the_iframes() throws IOException, InterruptedException {
		edgebrowser();
		url("https://leafground.com/window.xhtml");
		driver.findElement(By.xpath("(//i[@class='pi pi-globe layout-menuitem-icon'])[1]")).click();
		WebElement oldwindow = driver.findElement(By.id("menuform:m_frame"));
		oldwindow.click();
		driver.switchTo().frame(0);
		driver.findElement(By.id("Click")).click();
		System.out.println("Hurray! You Clicked Me.");
		driver.switchTo().defaultContent();
		driver.switchTo().frame(2);
		driver.switchTo().frame("frame2");
		driver.findElement(By.id("Click")).click();

		driver.switchTo().defaultContent();

		java.util.List<WebElement> totalsizeofframes = driver.findElements(By.tagName("iframe"));
		int size = totalsizeofframes.size();
		System.out.println("Number of iframes" + size);
		driver.close();

	}

	@When("Handle the window swithching")
	public void handle_the_window_swithching() throws IOException, InterruptedException {
		edgebrowser();
		url("https://leafground.com/window.xhtml");
		String oldwindow = driver.getWindowHandle();
		WebElement findElement = driver.findElement(By.xpath("(//button[@type='button'])[1]"));
		findElement.click();
		Set<String> newwindow = driver.getWindowHandles();
		for (String windownew : newwindow) {
			driver.switchTo().window(windownew);
			driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Hello");
			// driver.close();

			driver.switchTo().window(oldwindow);
		}

		driver.findElement(By.id("j_idt88:j_idt91")).click();
		int size = driver.getWindowHandles().size();
		System.out.println("windows count" + size);

		WebElement Newwindows = driver.findElement(By.id("j_idt88:j_idt93"));
		Newwindows.click();
		Set<String> windowhanles = driver.getWindowHandles();

		for (String Multiwindow : windowhanles) {
			if (!Multiwindow.equals(oldwindow)) {
				driver.switchTo().window(Multiwindow);
				driver.close();

			}

		}

		driver.quit();
	}

	@When("Handle the alert")
	public void handle_the_alert() throws InterruptedException, IOException {
	
		edgebrowser();
		url("https://leafground.com/window.xhtml");
		driver.findElement(By.xpath("(//i[@class='pi pi-globe layout-menuitem-icon'])[1]")).click();
		driver.findElement(By.id("menuform:m_overlay")).click();
		driver.findElement(By.id("j_idt88:j_idt91")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		driver.findElement(By.xpath("(//i[@class='pi pi-globe layout-menuitem-icon'])[1]")).click();
		driver.findElement(By.id("menuform:m_overlay")).click();
		driver.findElement(By.id("j_idt88:j_idt91")).click();
		Alert alert3 = driver.switchTo().alert();
		alert3.accept();
		driver.findElement(By.xpath(
				"//button[@id='j_idt88:j_idt104']//span[@class='ui-button-text ui-c'][normalize-space()='Show']"))
				.click();
		Alert alert2 = driver.switchTo().alert();
		alert2.sendKeys("new one");
		alert2.accept();
		driver.findElement(By.xpath(
				"//button[@id='j_idt88:j_idt100']//span[@class='ui-button-text ui-c'][normalize-space()='Show']"))
				.click();
//	WebDriver WAIT
//	WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
//	wait.until(ExpectedConditions.elementToBeClickable(By.id("")));
		Thread.sleep(1000);
		WebElement findElement = driver.findElement(By.id("j_idt88:j_idt101_title"));
		String text = findElement.getText();
		System.out.println(text);
		driver.findElement(
				By.xpath("(//a[@class='ui-dialog-titlebar-icon ui-dialog-titlebar-close ui-corner-all'])[2]")).click();
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt95']")).click();
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt98']")).click();
//	 WebElement confirmButton = driver.findElement(By.xpath("//button[contains(@class, 'swal-button') and text()='OK']"));
//     confirmButton.click();
		// driver.findElement(By.xpath("//a[@role='button'])[2]")).click();
		driver.close();

	}

	@When("Handke the deag and drop down")
	public void handke_the_deag_and_drop_down() throws InterruptedException, IOException {
		
		edgebrowser();
		url("https://leafground.com/window.xhtml");
		driver.findElement(By.xpath("(//i[@class='pi pi-globe layout-menuitem-icon'])[1]")).click();
		driver.findElement(By.id("menuform:m_drag")).click();
		WebElement from = driver.findElement(By.xpath("//p[text()='Drag to target']"));
		WebElement to = driver.findElement(By.xpath("//span[text()='Droppable Target']"));
		Actions action = new Actions(driver);
		action.dragAndDrop(from, to).perform();
		WebElement drop = driver.findElement(By.xpath("(//tr[@data-ri='1'])[2]"));
		WebElement drag = driver.findElement(By.xpath("(//tr[@data-ri='3'])[2]"));
		action.dragAndDrop(drag, drop).build().perform();
		// action.clickAndHold(drag).moveToElement(drop).release().build().perform();
		System.out.println("drag values " + drag.getText());
		System.out.println("drop values " + drop.getText());
	}

	@Then("close the browser")
	public static void close_the_browser() {

	}
}
