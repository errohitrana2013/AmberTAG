package TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.HomePageUsingFindBy;

public class VerifyMakeMyTripLogin_PageFactory {

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
		
		HomePageUsingFindBy homePage=PageFactory.initElements(driver, HomePageUsingFindBy.class);
		homePage.HomePageActions();
		
	}
}
