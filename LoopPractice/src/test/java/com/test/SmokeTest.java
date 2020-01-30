package com.test;

import java.io.IOException;
import java.util.Properties;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import util.Shared;


public class SmokeTest{
	WebDriver driver;
	Properties prop;
	@Test
	public void test1() {
		System.out.println("git");
	}
	
	
	
	@Test
	public void test11() throws IOException {
		prop=Shared.readProp("/Users/bittechconsulting/eclipse-workspace/BTC191002E/LoopPractice/src/test/resources/com/data/data.properties");
		//Assert.assertTrue(driver.getTitle().contains(prop.getProperty("title")));
		//or
		if(driver.getTitle().contains(prop.getProperty("title")))
		{
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}
	
	
	//given an string array from where find which word is polindrom
	
	@Test
	public void test12()
	{
		String [] words={"men","hellow","noon"};
		isplindrom(words);
	}
	

	
	
	
	public void isplindrom(String words[])
	{	
		StringBuffer ab=new StringBuffer();
		for(String word:words)
		
		{
			
			int j=word.length()-1;
			for(int i=0;i<word.length();i++,j--)
			{
				if(word.charAt(i)!=word.charAt(j))
					{
					System.out.println("not polindrom");
					break;
					}
				else if(word.charAt(i)==word.charAt(j))
				{
					ab.append(word.charAt(j));
					System.out.println(ab);
				}
			}
			if(word.equals(ab.toString()))
			{
				System.out.println(word+" is polindrom");
			}
			
		
			
	}
	//write a code which will help to run any browser like ie,chrome etc
}
	
	//let say there is number from 1 to 100
//	if number visible by 3 print shahid
//	if number visible by 5 print asad
//	if number visible by 3 and 5 print shahidasad
//	else print number
	
	
	
	
	
	
	
	//swap two number without declare third variable
	int a=8;
	int b=15;
	
	//highest hitting number

	
	@Test
	public void doubleArray() {
		Object [][] o=new Object[2][3];
		
		o[0][0]=7;
		o[0][1]="hu";
		int s;
		
		int [][] a=new int[2][3];
		
		a[0][0]=7;
		a[0][1]=74;
		a[0][2]=73;
		a[1][0]=73;
		a[1][1]=57;
		a[1][2]=27;
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a.length);
			for(int j=0;j<a[i].length;j++)
			{
				System.out.println(a[i].length);
				System.out.println(a[i][j]);
			}
		}
	}
	
	
	
	
	
	
	
	
}
