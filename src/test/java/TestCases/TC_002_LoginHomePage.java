package TestCases;

import org.testng.annotations.Test;

import TestBase.BaseClassTest;
import pageObject.HomePage1;
import pageObject.LoginHomePage;

public class TC_002_LoginHomePage extends BaseClassTest {

	@Test
	public void tc_002_Login() 
	{
		logger.info("Login to TestcASE");
		HomePage1 ph=new HomePage1(driver);
		ph.clickAccount();
		ph.clickLogin();
		
		LoginHomePage lp=new LoginHomePage(driver);
		lp.setEmail(rb.getString("email"));
		lp.setPassowrd(rb.getString("password"));
		lp.clickLogin();
		
	}
}
