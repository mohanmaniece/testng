package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class pagefactoryLoginpageobjects {
//user name,pwd,submit button
	//@FindBy(how=How.NAME,using="username")
	
	@FindBy(name = "username")
	public static WebElement username;
	@FindBy(name = "password")
	public static WebElement pwd;
	@FindBy(css = "#loginfrm > button")
	public static WebElement submit;
	
}
