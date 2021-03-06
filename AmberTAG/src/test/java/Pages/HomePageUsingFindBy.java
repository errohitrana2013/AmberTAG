package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePageUsingFindBy {

	WebDriver driver;
	WebDriverWait wait;
	
	public HomePageUsingFindBy(WebDriver driver) {

		this.driver=driver;
		wait=new WebDriverWait(driver,10);
	}
	
	@FindBy(xpath="//span[contains(@class,'userNameIcon')]")WebElement loginAccLink;
	@FindBy(how=How.XPATH,using="//div[contains(@class,'googleLoginBtn')]")WebElement loginWithGoogle;
	
	public void HomePageActions() {
		
		wait.until(ExpectedConditions.visibilityOf(loginAccLink));
		loginAccLink.click();
		
		wait.until(ExpectedConditions.visibilityOf(loginWithGoogle));
		loginWithGoogle.click();
	}
}
