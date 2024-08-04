package com.insta.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.insta.pagaobjects.LoginInsta;

public class TC_instalogin_001 extends BaseInsta {
	
	@Test
	
	public void login()
	{
		LoginInsta li = new LoginInsta(driver);
		li.setusername(username);
		li.setpassword(password);
		li.clickbtn();
		
		if(driver.getTitle().equals(title))
		{
			Assert.assertTrue(true);
		}
		
		else
		{
			Assert.assertTrue(false);
		}
	}

}
