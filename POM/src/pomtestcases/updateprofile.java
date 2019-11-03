package pomtestcases;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import pageobject.Loginpageobjects;
public class updateprofile {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:/Users/mohan/Documents/Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			
		   
		    driver.get("https://www.phptravels.net/login");
		    driver.manage().window().maximize();
		/*
		 * WebElement username=driver.findElement(By.name("username"));
		 * username.sendKeys("user@phptravels.com"); WebElement
		 * pwd=driver.findElement(By.name("password")); pwd.sendKeys("demouser");
		 * WebElement submit=driver.findElement(By.cssSelector("#loginfrm > button"));
		 * submit.sendKeys(Keys.ENTER);
		 * 
		 * WebElement myprofile= driver.findElement(By.xpath(
		 * "//*[@id=\"body-section\"]/div[2]/div[2]/div/div[1]/ul/li[2]/a/span[2]"));
		 * myprofile.click();
		 */
		    
		    Loginpageobjects loginpage=new Loginpageobjects();
		    loginpage.username(driver).sendKeys("user@phptravels.com");
		    loginpage.pwd(driver).sendKeys("demouser");
		    loginpage.pwd(driver).sendKeys(Keys.ENTER);
		    
	}

}
