package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productsPage extends BasePage {
	
	public productsPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="item_4_title_link")
	private WebElement backPack;
	
	@FindBy(className= "shopping_cart_link")
	private WebElement shoppingCart;
	
	public void clickBackPack() {
		backPack.click();
	}
	
	public void clickshopping() {
		shoppingCart.click();
	}
	

}
