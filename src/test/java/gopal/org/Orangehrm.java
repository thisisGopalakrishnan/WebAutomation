package gopal.org;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Orangehrm {
	
	//login page
		@FindBy(name="username")
		public static WebElement Username;
		@FindBy(name ="password")
		public static WebElement id;
		@FindBy(id ="remembermeCheck")
		public static WebElement checkbox;
		@FindBy(xpath ="//button[@type = 'submit']")
		public static WebElement signin;	
	
	

}
