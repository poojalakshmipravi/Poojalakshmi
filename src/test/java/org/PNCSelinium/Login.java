package org.PNCSelinium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login {
	
	private WebDriver driver;
	
  @Test
  public void login() {
	  driver.findElement(By.xpath("/html/body/div[5]/div[1]/div[4]/div/div[1]/div/div/div[1]") ).click();
	  driver.findElement(By.name("login[username]")).clear();
	  driver.findElement(By.name("login[username]")).sendKeys("pjlakshmi16@gmail.com");
	  driver.findElement(By.name("login[password]")).clear();
	  driver.findElement(By.name("login[password]")).sendKeys("poojalakshmi09");
	  driver.findElement(By.name("send"));
  }
  @BeforeTest
  public void beforeTest() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\pdc4-training.pdc4\\Desktop\\Poojalakshmi\\Driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.stalkbuylove.com/");
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
