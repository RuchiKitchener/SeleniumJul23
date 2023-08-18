package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage extends BasePage {
	
	public loginPage(WebDriver driver) {
		super(driver);
	}
	
	// 1. Page WebElements 
	@FindBy(id= "user-name")
	private WebElement username;
	
	@FindBy(name= "password")
	private WebElement pwd;
	
	@FindBy(name="login-button")
	private WebElement loginBtn;
	
	// 2. Page actions
	
	public void enterusername(String uname) {
		username.sendKeys(uname);
	}
	
	public void enterpassword(String passwd) {
		pwd.sendKeys(passwd);
	}
	
	public void clickLogin() {
		loginBtn.click();
	}
	
	
	
	
}
