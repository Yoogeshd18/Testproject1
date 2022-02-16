package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy (xpath = "//input[@id='username']")
	private WebElement userName ;
	
	@FindBy (xpath = "//input[@name='pwd']")
	private WebElement password ;
	
	@FindBy (xpath = "//a[@id='loginButton']")
	private WebElement login ;
	
	@FindBy (xpath = "//input[@id='keepLoggedInCheckBox']")
	private WebElement keepMeLoginCheckbox ;
	
	public LoginPage(WebDriver driver1)
	{
		PageFactory.initElements(driver1, this);
	}
	
	public void senduserName(String userID) {
		userName.sendKeys(userID);
	}
	
	public void sendpassword(String pass) {
		password.sendKeys(pass);
	}
	
	public String getTextofloginButton() {
		String text = login.getText();
		return text;
	}
	
	public void clickOnlogin() {
		login.click();
	}
	
	public void selectKeepMeLogin() {
		keepMeLoginCheckbox.click();
	}
	
	public void loginToApplication() {
		userName.sendKeys("admin");
		password.sendKeys("manager");
		keepMeLoginCheckbox.click();
		login.click();
	}    
}
