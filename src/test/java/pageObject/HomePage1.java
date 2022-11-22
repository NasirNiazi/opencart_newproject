package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage1 extends BaseClass {

	public HomePage1(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//span[text()='My Account']")
	WebElement clickMyAccount;
	@FindBy(linkText="Register")
	WebElement clickRegester;
	@FindBy(xpath="//a[text()='Login']")
	WebElement login;
	
	public void clickAccount() 
	{
		clickMyAccount.click();
	}
	public void clickToReg() 
	{
		clickRegester.click();
	}
	public void  clickLogin() 
	{
		login.click();
	}
 
}
