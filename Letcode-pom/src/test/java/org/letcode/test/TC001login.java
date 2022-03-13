package org.letcode.test;

import org.letcode.pages.LetcodeBase;
import org.letcode.pages.loginpage;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC001login extends LetcodeBase {
//@Test(invocationCount = 2 /*,threadPoolSize = 2,invocationTimeOut = 3000*/)
	@BeforeTest
	public void setData() {
		fileName="TC001";
	}
	@Test(dataProvider = "data")
	public void LoginTest(String[]data) {
		loginpage lp = new loginpage(driver);
//		lp.enterPassword("dinesh");
//		lp.enterUsername("pass123$");
//		lp.ClickLogin();
		boolean usernamelabel = lp.getUsernameLabel();
		Assert.assertTrue(usernamelabel);
		boolean passwordlabel = lp.getpasswordlabel();
		Assert.assertTrue(passwordlabel);
		 
		new loginpage(driver)
				.enterUsername(/* "dinesh" */ data[0])
				.enterPassword(/* "pass123$" */ data[1])
		.ClickLogin();
	}
}
