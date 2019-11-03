package pageobject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class pagefactorywithoutfindby {
	public static WebElement username;
	public static WebElement password;
	
	@Test
	public void login()
	{
		System.setProperty("webdriver.chrome.driver","C:/Users/mohan/Documents/Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			
		   
		driver.get("https://www.phptravels.net/login");
		driver.manage().window().maximize();
		    
		PageFactory.initElements(driver, pagefactorywithoutfindby.class);
	    username.sendKeys("user@phptravels.com");
	    password.sendKeys("demouser"+Keys.ENTER);
	    
}
}
