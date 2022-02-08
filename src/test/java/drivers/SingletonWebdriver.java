package drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingletonWebdriver {
	
private static volatile WebDriver driver = null; 
	
	 public static  WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver", "C://chrome_webdriver//chromedriver.exe");
		if(driver == null)
		{
			synchronized (WebDriver.class) {
				if(driver == null) {
					driver= new ChromeDriver();
					driver.manage().window().maximize();
				}
			}
		}		
		return driver;
	}

}
