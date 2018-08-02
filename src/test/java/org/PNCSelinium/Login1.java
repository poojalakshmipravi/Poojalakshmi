package org.PNCSelinium;

import org.testng.annotations.Test;

import Pages.Loginpageobject;
import Utility.WebDriverFactory;

import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
private WebDriver driver; 

public class Login1 {
  @Test(dataProvider = "usernameandpassword",description="This will do login")
  public void login(String username, String password) {
	  Loginpageobject.uname.clear();
	  Loginpageobject.uname.sendKeys(username);
	  Loginpageobject.pass.clear();
	  Loginpageobject.pass.sendKeys(password);
	  Loginpageobject.login_button.click();
	  
  }
  

  @DataProvider(name="usernameandpassword")
  public String[][] credentials() {
    return new String[][] {
      new String[] { "invalidUN", "invalidPW" }      
    };
  }
  @BeforeTest
  public void beforeTest() {
	  
 driver = WebDriverFactory.createDriver();
	  
	  //System.setProperty("webdriver.chrome.driver","C:\\Users\\pdc4-training.pdc4\\Desktop\\Poojalakshmi\\Driver\\chromedriver.exe");
		//driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
  PageFactory.initElements(driver,Loginpageobject.class);
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
