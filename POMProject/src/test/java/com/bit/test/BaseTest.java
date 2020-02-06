package com.bit.test;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

	WebDriver driver;
@Before
public void openBrowser() {
	driver=new ChromeDriver();
	driver.get("http://www.express.com");
}

@After
public void close() {
	driver.quit();
}
}
