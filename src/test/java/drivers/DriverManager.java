package drivers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public abstract class DriverManager {
	protected ThreadLocal<WebDriver> drivers = new ThreadLocal<WebDriver>();
	protected abstract WebDriver createDriver();
	
	public void quitDriver() {
		if (null != drivers.get()) {
			try {
				drivers.get().quit(); // First quit WebDriver session gracefully
				drivers.remove(); // Remove WebDriver reference from the ThreadLocal variable.
			} catch (Exception e) {
				System.out.println("Unable to gracefully quit WebDriver."+ e.toString()); // We'll replace this with actual Loggers later - don't worry !
			}
			
		}
	}
	
	public WebDriver getDriver() {
		if (null == drivers.get()) {
			drivers.set(this.createDriver());
		}
		drivers.get().manage().timeouts().implicitlyWait(1L, TimeUnit.SECONDS);
		
		return drivers.get();
	}

}
