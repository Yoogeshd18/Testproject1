package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
	
	public static WebDriver launchChromeBrowser() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ydasp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;
	}
	
	public static WebDriver launchFirefoxBrowser() {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\ydasp\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	return driver;
    }

}
