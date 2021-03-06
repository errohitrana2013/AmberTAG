package TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.HomePage;

public class VerifyMakeMyTripLogin 
{
	WebDriver driver;
	
	@BeforeTest
	public void beforeSuit() {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\exeFile\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
	}
	
	@Test
	public void verifyMakeMyTripLog() {
		
		HomePage login=new HomePage(driver);
		login.clickOnLoginlink();
		login.clickOnLoginWithGoogle();
	}

}
