package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.Browser;
import pom.ApplicationHeader;
import pom.LoginPage;

public class VerifyHeadersOfApplication extends Browser {
	
	private WebDriver driver;
	private ApplicationHeader applicationHeader;
	private LoginPage loginPage;
	
	@BeforeTest
	@Parameters("browser")
	public void launchBrowser(String browser) {
		
		System.out.println(browser);
		
		if(browser.equalsIgnoreCase("Chrome"))
		{
			driver = launchChromeBrowser();
		}
		
		if(browser.equalsIgnoreCase("Firefox"))
		{
			driver = launchFirefoxBrowser();
		}
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@BeforeClass
	public void createPOMObject() {
		
		loginPage = new LoginPage(driver);
		applicationHeader = new ApplicationHeader(driver);
	}
	
	@BeforeMethod
	public void loginToApplication() {
		System.out.println("login To Application");
        driver.get("http://localhost/login.do");
		loginPage = new LoginPage(driver);
		loginPage.senduserName("admin");
		loginPage.sendpassword("manager");
		loginPage.clickOnlogin();
	}
	
	@Test
	public void toVerifyTaskButton() {
		System.out.println("To Verify Task Button");
		applicationHeader.openTaskPage();
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		if(url.equals("http://localhost/tasks/otasklist.do"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		if(title.equals("actiTIME - Open Tasks"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
	
	@Test
	public void verifyUserTab() {
		System.out.println("To Verify User Tab");
		applicationHeader.openUsersPage();
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		if(url.equals("http://localhost/tasks/otasklist.do"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		if(title.equals("actiTIME - Open Tasks"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
	
	@AfterMethod
	public void logoutFromApplication() {
		System.out.println("logout");
		applicationHeader.logoutFromApp();
	}
	
	@AfterClass
	public void clearPOMObject() {
		loginPage = null;
		applicationHeader = null;
	}
	
	@AfterTest
	public void closedBrowser() {
		System.out.println("after class");
		driver.quit();
		driver = null;
		
		System.gc();
	}
}
