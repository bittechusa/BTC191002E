package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.LoadableComponent;

import utils.Shared;

public class MenPage extends LoadableComponent<MenPage>{
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"content\"]/div/div[2]/div/div/div/div[1]/div/div[1]/div/div/div/div/div/div/div/a") List<WebElement> subCatagoryOptions;
	public MenPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public JeansPage clickSubCatagoryForJeans() {
		Shared.click(subCatagoryOptions, "JEANS");
		return new JeansPage(driver);
	}
	public SuitsPage clickSubCatagoryForSuits() {
		Shared.click(subCatagoryOptions, "SUITS");
		return new SuitsPage(driver);
	}

	@Override
	protected void load() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void isLoaded() throws Error {
		// TODO Auto-generated method stub
		
	}

}
