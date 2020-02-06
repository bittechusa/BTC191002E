package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SuitsPage  {

	WebDriver driver;
	@FindBy(xpath="//*[@id=\"content\"]/div/div[2]/div/div/div/div[1]/div/div[1]/div/div/div/div/div/div/div/a") List<WebElement> subCatagoryOptions;
	public SuitsPage(WebDriver driver) {
		this.driver=driver;
	}
}
