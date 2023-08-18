package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class infoPage extends BasePage {
	
	public infoPage(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(name= "firstName")
	private WebElement fName;
	
	@FindBy(name= "lastName")
	private WebElement lName;
	
	@FindBy(name= "postalCode")
	private WebElement zipCode;
	
	@FindBy(name= "continue")
	private WebElement cont;
	
	public void enterDetails(String firstName, String lastName, String Code) {
		fName.sendKeys(firstName);
		lName.sendKeys(lastName);
		zipCode.sendKeys(Code);
		cont.click();
	}

	

}
