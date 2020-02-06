package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Shared;

public class HomePage {

	WebDriver driver;

	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[2]/nav/ol/li[2]/a") WebElement menCatagory;
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[2]/nav/ol/li[2]/a") WebElement womenCatagory;
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public MenPage clickOnMenCatagory() {
		Shared.click(menCatagory);
		return new MenPage(driver);
	}
	public WomenPage clickOnWoMenCatagory() {
		Shared.click(womenCatagory);
		return new WomenPage(driver);
	}
	
	public void verifyHomePageLogo() {
		boolean b=driver.findElement(By.id("logo")).isDisplayed();
		System.out.println(b);
	}
}
