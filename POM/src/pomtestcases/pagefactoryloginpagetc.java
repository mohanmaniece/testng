package pomtestcases;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


import pageobject.pagefactoryLoginpageobjects;
public class pagefactoryloginpagetc {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:/Users/mohan/Documents/Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			
		   
		    driver.get("https://www.phptravels.net/login");
		    driver.manage().window().maximize();
		
		    PageFactory.initElements(driver, pagefactoryLoginpageobjects.class);
		    
		    pagefactoryLoginpageobjects.username.sendKeys("user@phptravels.com");
		    pagefactoryLoginpageobjects.pwd.sendKeys("demouser");
		    pagefactoryLoginpageobjects.pwd.sendKeys(Keys.ENTER);
		    
		    
	}

}
