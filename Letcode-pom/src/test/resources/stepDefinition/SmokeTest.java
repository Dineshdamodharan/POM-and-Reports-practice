package stepDefinition;


import org.openqa.selenium.By;
import org.openqa.selenium.By.Byid;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTest {
 WebDriver driver;
@Given("^open chrome and valid application$")
public void open_chrome_and_valid_application() thi Exception {
      driver= new ChromeDriver ();
      driver.get("https://letcode.in/signin");
}

@When("^i enter  valid username and password$")
public void i_enter_valid_username_and_password() thi Exception {
   driver.findElement(By.name("email")).sendKeys("dinesh00@gmail.com");
   driver.findElement(By.name("password")).sendKeys("pass123$");
}

@Then("^user should able to login successfully$")
public void user_should_able_to_login_successfully() thi Exception {
   driver.findElement(By.xpath("//button[contains(text(),'LOGiN')]")).click();
   driver.quit();
}


	}

