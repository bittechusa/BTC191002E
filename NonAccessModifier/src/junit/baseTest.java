package junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseTest {
	int a=8;
	static int b=8;
	
	
	
	static WebDriver driver;
//	@Before
//	public void start() {
//		driver=new ChromeDriver();
//		driver.get("http://www.facebook.com");
//	}
//	@After
//	public void end() {
//		driver.quit();
//	}
	
	
	@BeforeClass
	public static void start() {
		driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
	}
	@AfterClass
	public static void end() {
		driver.quit();
	}
	

}
