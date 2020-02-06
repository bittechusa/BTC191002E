package pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.LoadableComponent;

import utils.Shared;

public class JeansPage extends LoadableComponent<JeansPage>{

	WebDriver driver;
	@FindBy(xpath="//*[@id=\"content\"]/div/div[2]/div/div/div/div[1]/div/div[1]/div/div/div/div/div/div/div/a") WebElement jeanProduct;
	public JeansPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public ProductDetailsPage clickJeansProduct() {
		Shared.click(jeanProduct); 
		return new ProductDetailsPage();
	}

	@Override
	protected void load() {
		// TODO Auto-generated method stub
		driver.navigate().to("https://www.express.com/mens-clothing");
		Header h=new Header(driver);
	}

	@Override
	protected void isLoaded() throws Error {
		// TODO Auto-generated method stub
		Assert.assertTrue(driver.getCurrentUrl().equals("https://www.express.com/mens-clothing"));
		Header h=new Header(driver);
		
	}
}
