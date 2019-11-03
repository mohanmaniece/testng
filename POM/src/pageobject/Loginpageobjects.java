package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpageobjects {
//user name,pwd,submit button
	public static WebElement username(WebDriver driver)
	{
		return driver.findElement(By.name("username"));
	}
	public static WebElement pwd(WebDriver driver)
	{
		return driver.findElement(By.name("password"));
	}
	public static WebElement submit(WebDriver driver)
	{
		return driver.findElement(By.cssSelector("#loginfrm > button"));
	}
}
