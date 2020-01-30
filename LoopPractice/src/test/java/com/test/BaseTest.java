package com.test;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import browserOption.BrowserConfig;

public class BaseTest {
	BrowserConfig b;
	WebDriver driver;
	@Before
	public void openBrowser() throws IOException {
		 b=new BrowserConfig();
		driver=b.openBrowser1();
	}
	@After
	public void end() {
		b.end();
	}

}
