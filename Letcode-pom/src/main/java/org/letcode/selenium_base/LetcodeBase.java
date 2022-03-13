package org.letcode.selenium_base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import utils.ReadExcel;

public class LetcodeBase {
	 protected  static RemoteWebDriver driver = null;
	String url = "http://omayo.blogspot.com/";
	public String fileName="";
	@DataProvider(name="data")
	public String[][] dataprovider() {
		 String[][] exceldata = ReadExcel.getexcel(fileName);
		 return exceldata;
	}
	
	@BeforeMethod
	public void startapp() {
		//RemoteWebDriver driver = null;
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//String url = "http://omayo.blogspot.com/";
		driver.get(url);
	}
	@AfterMethod
	public void StopApp() {
		driver.close();
		driver.quit();
	}



}
