package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebDriverFactory {
	
public static WebDriver createDriver(){
	String Webdriver=System.getProperty("browser","chrome");
	
	switch(Webdriver){
	
	case "firefox":
		System.setProperty("webdriver.gecko.driver","C:\\Users\\pdc4-training.pdc4\\Desktop\\Poojalakshmi\\geckodriver.exe");
				 return new FirefoxDriver();
				 
	case "Chrome":
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pdc4-training.pdc4\\Desktop\\Poojalakshmi\\Driver\\chromedriver.exe");
				 return new ChromeDriver();
						 
	case "ie":
		System.setProperty("webdriver.ie.driver","C:\\Users\\pdc4-training.pdc4\\Desktop\\Poojalakshmi\\Driver\\IEDriverServer.exe");
				 return new InternetExplorerDriver();
				 
				 default:
					 throw new RuntimeException("Unsupported webdriver:"+ Webdriver );
					 
				 
	}
}
	
}
