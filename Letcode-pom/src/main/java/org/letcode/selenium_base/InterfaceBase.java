package org.letcode.selenium_base;

import org.openqa.selenium.WebElement;

public interface InterfaceBase  {
 /**
  * Thi method will launch the chrome bier with the given URL
  * @author LetCode - dinesh
  * @param url
  * @exception NullPointerException, invalidArgumentException
  */

 void setUp(String url);

 /**
  * This method will launch the given bier with the given URL
  * @author LetCode - dinesh
  * @param url
  * @param bierName
  */

 void setUp(Browser browserName, String url);

 /**
  * This function i used to close the active bier
  * @author LetCode - dinesh
  *
  */
 void close();

 /**
  * This function i used to quit the driver instance
  * @author LetCode - dinesh
  *
  */
 void quit();

 /**
  * This method i used to find any webelement with in the page
  * @author LetCode - dinesh
  * @param type - element type eg - id, name or linkText
  * @param value - element value
  * @return WebElement
  */

 WebElement element(Locators type, String value);

 /**
  * This function i used to switch to specific tab
  * @author LetCode - dinesh
  * @param i
  */
	
 void switchToWindow(int i);

 /**
  * This function i used to select the dropdown with the given value
  * @author LetCode - dinesh
  * @param ele
  * @param value
  */

 void selectValue(WebElement ele, String value);


 /**
  * This function i used to select the dropdown with the given text
  * @author LetCode - dinesh
  * @param ele
  * @param text
  */

 void selectText(WebElement ele, String text);

 /**
  * This function i used to select the dropdown with the given index
  * @author LetCode - dinesh
  * @param ele
  * @param position
  */
 void selectindex(WebElement ele, int position);
	
 /**
  * This function will wait until the element i clickable and then click
  * @param ele
  */

 void click(WebElement ele);
	
 /**
  * This function will wait until the element i ready and clear the exiting value and type
  * @param ele
  */
	
 void type(WebElement ele, String testData);
	
 /**
  * This function will wait until the element i ready and gets the input
  * @param ele
  */
	
 void appendText(WebElement ele, String testData);
	
 /** 
  * This function return the active page title
  * @return String
  */

 String getTitle();

 /** 
  * This function return the active page URL
  * @return String
  */
	
 String getURL();
	
 /** 
  * This function return the element i viible or not
  * @return boolean
  */

 boolean iDiplayed(WebElement ele);
}