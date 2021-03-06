package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	
	WebDriver driver;
	WebDriverWait wait;
	
	By loginAccLink=By.xpath("//span[contains(@class,'userNameIcon')]");
	By loginWithGoogle=By.xpath("//div[contains(@class,'googleLoginBtn')]");
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		wait=new WebDriverWait(driver,10);
	}
	
	public void clickOnLoginlink() {
		WebElement loginLink=driver.findElement(loginAccLink);
		wait.until(ExpectedConditions.visibilityOf(loginLink));
		loginLink.click();
	}
	
	public void clickOnLoginWithGoogle() {
		WebElement loginWithGo=driver.findElement(loginWithGoogle);
		wait.until(ExpectedConditions.visibilityOf(loginWithGo));
		loginWithGo.click();
	}
}
