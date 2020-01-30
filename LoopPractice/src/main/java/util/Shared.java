package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Shared {
	public static Properties readProp(String path) throws IOException
	{
		File fi=new File(path);
		FileInputStream f=new FileInputStream(fi);
		Properties prop=new Properties();
		prop.load(f);
		return prop;
	}

	public void loopPrac() {
	//loop--same task more than one time 
	//while loop,  do--while loop,  for loop
	//syntax
	int a=5;
	while(a>3)
	{
		System.out.println(1);
		a--;
	}
	
	//do while
	do {
		System.out.println(1);
	}while(5>3);
	
	//for loop
//	for(int i=1;i<=10;i++)
//	{	
//		System.out.println(i);
//			
//		
//	}
//		

	}
	
	public void loop2() {
		
		for(int i=1;i<3;i++)
		{
			System.out.println("the result of iis  "+i+" equals to 1");//1 2
			for(int j=i+1;j<4;j++)
			{
				System.out.println(j);//2 3 3
			}
		}
	}
	WebDriver dr;
	public void loopOnMenu() {
		
		int size=dr.findElements(By.xpath("//ul[@class='top-menu']/li")).size();
		
		
		
		for(int i=1;i<=size;i++)
		{
			dr.findElement(By.xpath("//ul[@class='top-menu']/li["+i+"]")).click();
			dr.findElement(By.xpath("/html/body/div[9]/div[4]/div/div[1]/span")).click();
		}
	
		for(int i=size;i>=1;i--)
		{
			dr.findElement(By.xpath("//nav[@class='global-navigation__flex-container']/ul/li["+i+"]")).click();
			dr.navigate().back();
		}
		
	}
	
	
	@Test
	public void test1() {
		List<WebElement> elements=dr.findElements(By.xpath("//nav[@class='global-navigation__flex-container']/ul/li"));
		loopOnMenu(elements);
	}
	
public void loopOnMenu(List<WebElement>  elements) {
		
		int size=elements.size();
		
		for(int i=1;i<=size;i++)
		{
			elements.get(i).click();
			dr.navigate().back();
		}
	
		for(int i=size;i>=1;i--)
		{
			dr.findElement(By.xpath("//nav[@class='global-navigation__flex-container']/ul/li["+i+"]")).click();
			dr.navigate().back();
		}
		
	}
	

public void loop3() {
		
	
//	while(dr.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[8]/div/span/div/div/ul/li[8]/a")).isEnabled())
//	{
//		dr.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[8]/div/span/div/div/ul/li[8]/a")).click();
//	}
//	do {
//		dr.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[8]/div/span/div/div/ul/li[8]/a")).click();
//	}while(dr.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[8]/div/span/div/div/ul/li[8]/a")).isEnabled())
//	
//	
	dr=new ChromeDriver();
	dr.get("");
	Actions a=new Actions(dr);
	a.moveToElement(dr.findElement(By.xpath("//*[@id=\"shopByDepartmentLabelText\"]"))).perform();
	int size=dr.findElements(By.xpath("//ul[@id='mainNavigationFobs']/li")).size();
	for(int i=1;i<=size;i++)
	{
		dr.findElement(By.xpath("//ul[@id='mainNavigationFobs']/li["+i+"]")).click();
		Actions a1=new Actions(dr);
		a1.moveToElement(dr.findElement(By.xpath("//*[@id=\"shopByDepartmentLabelText\"]"))).perform();
		
	}
	//*[@id="content"]/div/div[6]/div/div/div/div[1]/div/div[1]/div/div/div/div[1]/div/div/div/a
	//*[@id="content"]/div/div/div/div[3]/span/span[1]/a[3]/span/img
}	


@Test
public void nestedLoop() throws InterruptedException {
	//open blank browser
	dr=new ChromeDriver();
	//go to express.com
	dr.get("http://www.express.com");
	//click on women
	dr.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/nav/ol/li[1]/a")).click();
	int menuSize=dr.findElements(By.xpath("//*[@id=\"content\"]/div/div[6]/div/div/div/div[1]/div/div[1]/div/div/div/div/div/div/div/a")).size();
	
	for(int i=1;i<=menuSize;i++)
	{
		dr.findElement(By.xpath("//*[@id=\"content\"]/div/div[6]/div/div/div/div[1]/div/div[1]/div/div/div/div["+i+"]/div/div/div/a")).click();
		Thread.sleep(3000);
		int subMenu=dr.findElements(By.xpath("//div[@class='product-category-desktop  product-per-row-3']/div[3]/span")).size();
		for(int j=1;j<=subMenu;j++)
		{
			dr.findElement(By.xpath("//div[@class='product-category-desktop  product-per-row-3']/div[3]/span["+j+"]")).click();
			Thread.sleep(3000);
			dr.navigate().back();
			Thread.sleep(3000);
		}
	}
	
}
	

@Test
public void nestedLoopOnArong() throws InterruptedException {
	//open blank browser
	dr=new ChromeDriver();
	//go to express.com
	dr.get("http://www.aarong.com");
	//click on women
	dr.findElement(By.xpath("//*[@id=\"menu4\"]/div/a/span")).click();
	int menuSize=dr.findElements(By.xpath("/html/body/div[2]/div[2]/div[4]/ul")).size();
	
	for(int i=1;i<=menuSize;i++)
	{
		int subMenu=dr.findElements(By.xpath("/html/body/div[2]/div[2]/div[4]/ul["+i+"]/li/a/img")).size();
		for(int j=1;j<=subMenu;j++)
		{
			dr.findElement(By.xpath("/html/body/div[2]/div[2]/div[4]/ul["+i+"]/li["+j+"]/a/img")).click();
			dr.navigate().back();
		}
		
		
		
	}
	
}
	


///html/body/div[2]/div[2]/div[4]/ul[1]/li/a/img










	//enhanced loop
public void getAllLinkText(){
	List<WebElement> elements=dr.findElements(By.tagName("a"));
	for(WebElement ele:elements)
	{
		String text=ele.getText();
		System.out.println(text);
	}
	
}
	

public void clickOnAnyElement(List<WebElement> elements,String text)
{
	for(WebElement element:elements)
	{
		if(element.getText().equals(text))
		{
			element.click();
			break;
		}
	}
} 
public void clickOnAnyElementByIndex(List<WebElement> elements,int index)
{
	elements.get(index).click();
}

public void click(WebElement ele)
{
	ele.click();
}

@Test
public void verifyMenuText() {
	clickOnAnyElement(dr.findElements(By.xpath("xpath of all menu")),"COTTON SAREE");
	clickOnAnyElementByIndex(dr.findElements(By.xpath("/html/body/div[9]/div[4]/div[6]/div[1]/div/div[2]/div[1]/div[2]/div[1]/div/div[1]/div/a/img")),32);
}
@Test
public void productPage() {
	clickOnAnyElement(dr.findElements(By.xpath("xpath of productsu")),"name of product");
}




}
