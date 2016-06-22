package com.actions.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHover {
	WebDriver driver;
	String URL="http://www.irctc.co.in";
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "D:\\Technical Software\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get(URL);
	  WebElement ele1=driver.findElement(By.xpath("//a[@id='hotelsAndLounges']"));
	  WebElement ele2=driver.findElement(By.xpath("//*[@id='bluemenu']/ul/li[7]/ul/li[2]/a"));
	  Actions a=new Actions(driver);
	  a.moveToElement(ele1).perform();
	  a.click(ele2).perform();
	  //driver.findElement(By.linkText("Retiring Room"));
	  System.out.println("Clicked");
	  
  }
}
