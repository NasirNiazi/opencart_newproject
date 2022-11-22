package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegisterPage1 extends BaseClass{

	public AccountRegisterPage1(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(id="input-firstname")
	WebElement firstName;
	
	@FindBy(id="input-lastname")
	WebElement lastName;
	
	@FindBy(id="input-email")
	WebElement email;
	@FindBy(id="input-telephone")
	WebElement telephone;
	
	@FindBy(id="input-password")
	WebElement password;
	@FindBy(id="input-confirm")
	WebElement conformPassword;
	
	@FindBy(css="input[value='0']")
	WebElement subscribeBtn;
	
	@FindBy(css="input[type='checkbox']")
	WebElement privacyPolicy;
	
	@FindBy(css="input[type='submit']")
	WebElement submitbtn;
	
	@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgConfirmation;
	
	//Actions
	public void setfirstName(String name) 
	{
		firstName.sendKeys(name);
	}
	public void setLastName(String lastN) 
	{
		lastName.sendKeys(lastN);
	}
	public void setEmail(String emaill) 
	{
		email.sendKeys(emaill);
	}
	public void setTelePhone(String phone)
	{
		telephone.sendKeys(phone);
	}
	public void setPassword(String pwd) 
	{
		password.sendKeys(pwd);
	}
	public void setconformPassword(String conPwd) 
	{
		conformPassword.sendKeys(conPwd);
	}
	public void setredioBtn() 
	{
		subscribeBtn.click();
	}
	public void setPrivacy() 
	{
		privacyPolicy.click();
	}
	public void setSubMitbtn() 
	{
		submitbtn.click();
	}
	public String getCofarmationmsg() 
	{
		try 
		{
			return(msgConfirmation.getText());
		}catch(Exception e) 
		{
			return(e.getMessage());
		}
	}
}
