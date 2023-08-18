package TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.cartPage;
import Pages.checkOutPage;
import Pages.completePage;
import Pages.infoPage;
import Pages.loginPage;
import Pages.productDetailspage;
import Pages.productsPage;

public class Tests {
	WebDriver driver;
	@BeforeMethod
	public void setup() {
		driver = new EdgeDriver();
		driver.get("https://saucedemo.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
	}
	
	@Test
	public void Shopping() throws InterruptedException {
	new loginPage(driver).enterusername("standard_user");
	new loginPage(driver).enterpassword("secret_sauce");
	new loginPage(driver).clickLogin();
	new productsPage(driver).clickBackPack();
	new productDetailspage(driver).clickAddtoCart();
	new productDetailspage(driver).clickCart();
	new cartPage(driver).clickCheckOut();
	new infoPage(driver).enterDetails("Sidharth", "arora", "31313131132");
	new checkOutPage(driver).clickFinish();
	String actual = new completePage(driver).checkThanksMsg();
	Assert.assertEquals(actual, "Thank you for your order!");      //Expected result = actual result = Pass
	Assert.assertEquals(true, true);
	new completePage(driver).clickBacktoProducts();
	}
	
	@Test
	public void test2() {
		Assert.assertTrue(true);
	}

	@AfterMethod
	public void Done() {
		driver.quit();
	}
	

}
