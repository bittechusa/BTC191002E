package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Header {
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[2]/nav/ol/li[2]/a") WebElement logo;
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[2]/nav/ol/li[2]/a") WebElement details;

	public Header(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
}
