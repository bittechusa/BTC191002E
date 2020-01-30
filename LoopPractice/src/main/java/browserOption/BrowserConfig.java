package browserOption;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import util.Shared;

public class BrowserConfig {
	//from properties file
	Properties prop;
	WebDriver driver;
	public WebDriver openBrowser() throws IOException {
		prop=Shared.readProp("/Users/bittechconsulting/eclipse-workspace/BTC191002E/LoopPractice/src/main/resources/data/config.properties");
		String browser=prop.getProperty("browser");
		if(browser.equals("chrome"))
		{
			//System.setProperty("webdriver.chrome.driver", "path of chromedriver exe")
			driver=new ChromeDriver();
		}else if(browser.equals("firefox"))
		{
			//System.setProperty("webdriver.gecko.driver", "path of geckodriver exe");
			driver=new FirefoxDriver();
		}
	else if(browser.equals("safari"))
	{
		driver=new SafariDriver();
	}
		return driver;
	}
	
	//from command line

		
		
		public WebDriver openBrowser1() throws IOException {
			
			String browser=System.getProperty("browser");
			if(browser.equals("chrome"))
			{
				//System.setProperty("webdriver.chrome.driver", "path of chromedriver exe")
				driver=new ChromeDriver();
			}else if(browser.equals("firefox"))
			{
				//System.setProperty("webdriver.gecko.driver", "path of geckodriver exe");
				driver=new FirefoxDriver();
			}
		else if(browser.equals("safari"))
		{
			driver=new SafariDriver();
		}
			return driver;
		}
	
	
	
	
	
	public void end() {
		driver.quit();
	}

}
