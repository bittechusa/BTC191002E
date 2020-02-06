package com.bit.test;

import org.junit.Test;

import pages.HomePage;
import pages.JeansPage;
import pages.MenPage;
import pages.ProductDetailsPage;
import pages.SuitsPage;
import pages.WomenPage;

public class SmokeTest extends BaseTest{
	
	HomePage homePage;
	MenPage menPage;
	JeansPage jeansPage;
	SuitsPage suitsPage;
	ProductDetailsPage pd;
	WomenPage womenPage;
	@Test
	public void buyJeanProduct() {
		homePage=new HomePage(driver);
		homePage.verifyHomePageLogo();
		menPage=homePage.clickOnMenCatagory().get();//new MenPage();
		jeansPage=menPage.clickSubCatagoryForJeans().get();
		pd=jeansPage.clickJeansProduct();
	}
	@Test
	public void buySuitProduct1() {
		homePage=new HomePage(driver);
		homePage.verifyHomePageLogo();
		menPage=homePage.clickOnMenCatagory();//new MenPage();
		suitsPage=menPage.clickSubCatagoryForSuits();
	}
	@Test
	public void buySuitProduct() {
		homePage=new HomePage(driver);
		homePage.verifyHomePageLogo();
		womenPage=homePage.clickOnWoMenCatagory();
	}

}
