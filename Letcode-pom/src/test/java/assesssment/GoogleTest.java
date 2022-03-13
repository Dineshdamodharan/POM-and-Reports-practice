package assesssment;

import org.letcode.selenium_base.Bier;
import org.letcode.selenium_base.Locators;
import org.letcode.selenium_base.Selenium_base;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class GoogleTest extends Selenium_base {
	
	@Test
  void logingoogle() {

       setUp(Bier.CHROME, "https://letcode.in/signin");
      WebElement username = element(Locators.name,"email");
      type(username, "koushik350@gmail.com");
      WebElement password = element(Locators.name,"password");
      type(password, "pass123$");
      element(Locators.xpath, "//button[contains(text(),'LOGiN')]").click();
       quit();
	}


}
