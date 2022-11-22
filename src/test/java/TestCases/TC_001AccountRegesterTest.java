package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import TestBase.BaseClassTest;
import pageObject.HomePage1;
import pageObject.AccountRegisterPage1;


public class TC_001AccountRegesterTest extends BaseClassTest 
{
	@Test
	 public void test_account() 
	{
		  logger.info("String the test");
		  try {
		
			 HomePage1 ph = new HomePage1(driver);
			ph.clickAccount();
			logger.info("Clicking to My Account");
			ph.clickToReg();
			logger.info("Clicking to Register ");
			
			AccountRegisterPage1 ar=new AccountRegisterPage1(driver);
			logger.info("Get all the Customer inforamtion ");
			ar.setfirstName(randomStringAlpha().toUpperCase());
			ar.setLastName(randomStringAlpha().toUpperCase());
			ar.setEmail(randomALphaNamdNumber()+"@gmail.com");
			String password=randomNumber();
			ar.setTelePhone(password);
			ar.setPassword(password);
			ar.setconformPassword(password);
			ar.setredioBtn();
			ar.setPrivacy();
			ar.setSubMitbtn();
			logger.info("Click to Continue Button ");
			String msg=ar.getCofarmationmsg();
			logger.info("Take the Expected Massege ");
			Assert.assertEquals(msg, "Your Account Has Been Created!");
	       
		}
		  catch(Exception e)
		  {
			  Assert.fail();
			  }
		  logger.info("the test is done ");
		  }
	
	}
	
	
