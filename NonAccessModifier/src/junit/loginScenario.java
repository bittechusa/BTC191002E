package junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginScenario extends baseTest{
	
	
	public void login() {

		driver.findElement(By.id("")).sendKeys("");
		driver.findElement(By.id("")).sendKeys("");
		driver.findElement(By.id("")).click();
	}
	@Test
	public void loginTest() {
		login();
		
	}
	@Ignore
	@Test
	public void logoutTest() {
		
		//login();
		driver.findElement(By.id("logout")).click();
		
		
	}

}
