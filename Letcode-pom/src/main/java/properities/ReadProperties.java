package properities;

import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadProperties {
public static void main(String[] args) throws FileNotFoundException, IOException {
	 Properties properties = new Properties();
	 properties.load(new FileInputStream("./locators.properties"));
	 ChromeDriver driver = new ChromeDriver();
	 driver.get("https://letcode.in/signin");
	 driver.findElement(By.name("email")).sendKeys(properties.getProperty("email"));
	 driver.findElement(By.name("password")).sendKeys(properties.getProperty("password"));
	driver.findElementByXPath("//button[text()='LOGiN']").click();
}
}
//Properties properties = new Properties();
//properties.load(new FileinputStream("./letcodefrench.properties"));
//String property = properties.getProperty("welcome");
//System.out.println(property);

