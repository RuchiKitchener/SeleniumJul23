package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class completePage extends BasePage {

	public completePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id= "back-to-products")
	private WebElement backtoProducts;
	
	@FindBy(xpath= "//h2")
	private WebElement thanksMsg;
	
	public void clickBacktoProducts() {
		backtoProducts.click();
	}

	public String checkThanksMsg() {
		return thanksMsg.getText();
	}

}
