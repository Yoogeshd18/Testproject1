package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ApplicationHeader {

	@FindBy (xpath = "//a[@class='content tt_selected selected']")
	private WebElement timeTrack ;
	
	@FindBy (xpath = "//div[text()='Tasks']")
	private WebElement task ;
	
	@FindBy (xpath = "//div[text()='Reports']")
	private WebElement report ;
	
	@FindBy (xpath = "//div[text()='Users']")
	private WebElement users ;
	
	@FindBy (xpath = "//a[@id='logoutLink']")
	private WebElement logout ;
	
	private WebDriver driver;
	
	public ApplicationHeader(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void openTimeTrackPage() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(timeTrack));
		timeTrack.click();
	}
	
	public void openTaskPage() {
		Actions act = new Actions(driver);
		task.click();
	}
	
	public void openReportPage() {
		report.click();
	}
	
	public void openUsersPage() {
		users.click();	
	}
	
	public void logoutFromApp() {
		logout.click();
	}	
		    
}
