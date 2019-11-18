package com.cap.pagefactor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class PageFactor {
	
	
	static WebDriver driver;
	public static void openbrowser(String url)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sgudala\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		System.out.println("Browser opened");
		driver.manage().window().maximize();
	}
	public static void Sendvalue(By locator,String val) {
		WebElement e= driver.findElement(locator);
		System.out.println("The text" + val + "is entered");
		e.sendKeys(val);
		}
	public static void clickmethod(By locatorforclick) throws InterruptedException {
		driver.findElement(locatorforclick).click();
		System.out.println(locatorforclick +"is called");
		Thread.sleep(3000);
	}
	
	public static void select(By locator,String val) {
		WebElement e1= driver.findElement(locator);
		Select dd=new Select(e1);
		dd.selectByVisibleText(val);
		System.out.println("The value" + val+ "is selected from the dropdown");
		
		System.out.println("The text" + val + "is entered");
	}
	
   public static void alertHandler() {
	    driver.switchTo().alert().accept();
}
    public static void close()
	{
		System.out.println("closing the browser");
		driver.close();
	}
}
