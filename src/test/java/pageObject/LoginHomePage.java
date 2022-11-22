package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginHomePage extends BaseClass {

	public LoginHomePage (WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(id="input-email")
	WebElement email;
	@FindBy(id="input-password")
	WebElement password;
	@FindBy(xpath="//input[@class='btn btn-primary']")
	WebElement login;
	
	public void setEmail(String eml) 
	{
		email.sendKeys(eml);
	}
	public void setPassowrd(String pwd) 
	{
		password.sendKeys(pwd);
	}
	public void clickLogin() 
	{
		login.click();
	}
}
