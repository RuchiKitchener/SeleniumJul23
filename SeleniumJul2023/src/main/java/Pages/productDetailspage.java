package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productDetailspage extends BasePage {
	
	public productDetailspage(WebDriver driver) {
	super(driver);	
	}
	
	@FindBy(className= "shopping_cart_link")
	private WebElement shoppingCart;
	
	@FindBy(id="add-to-cart-sauce-labs-backpack")
	private WebElement addToCart;
	
	public void clickCart() {
		shoppingCart.click();
	}
	
	public void clickAddtoCart() {
		addToCart.click();
	}
}
