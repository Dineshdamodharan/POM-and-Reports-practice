package org.letcode.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

public class loginpage extends LetcodeBase {
	//RemoteWebDriver driver= null;
	public loginpage(RemoteWebDriver driver){
		this.driver= driver;
	}
//locators
 public boolean getUsernameLabel(){
	return driver.findElementByName("userid").isDisplayed();
	
}
 public boolean getpasswordlabel() {
	return driver.findElementByXPath("//input[@name='pswrd']").isDisplayed();
	
}	
public boolean clickLoginlabel(){
	 return driver.findElementByXPath("//div[contains(text(),'Login page')]").isDisplayed();
}
	
	//actions
/**
 * 
 * @param name - pass the user name
 * @return 
 * @return 
 * @return
 */

 public loginpage enterUsername(String name){
	driver.findElementByName("userid").sendKeys("dinesh");
	return this;
}
public loginpage enterPassword(String password){
	driver.findElementByName("pswrd").sendKeys("pass123$");
	return this ;
}
  public DashBoardPage ClickLogin(){
	driver.findElementByXPath("//div[contains(text(),'Login page')]").click();
	return  new DashBoardPage() ;
}
  /**
   * @description - this function used to login into the application
 * @return 
   * 
   */
  public void login(String username, String pass) {
	  enterUsername(username);
	  enterPassword(pass);
  }
  
  
  
  
  
  
  
  
  
  
}
