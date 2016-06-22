package com.actions.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SelActions {
	WebDriver driver;
	// String URL="http://jqueryui.com/droppable/";
	String URL = "http://dhtmlx.com/docs/products/dhtmlxTree/";
	WebElement element, element1, element2;

	@Test
	public void myActions() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Technical Software\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);

		// WebDriverWait wait = new WebDriverWait(driver, 5);
		// wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector(".demo-frame")));
		// driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		// element1=driver.findElement(By.cssSelector("#draggable"));
		// element2=driver.findElement(By.cssSelector("#droppable"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("arguments[0].scrollIntoView(true)",element1);
		js.executeScript("scroll(0,1000)");
		Thread.sleep(2000);
		element1 = driver.findElement(By.xpath(
				"//*[@id='treebox1']/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[4]/span"));
		element2 = driver.findElement(By.xpath(
				"//*[@id='treebox2']/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[4]/span"));
		Actions a = new Actions(driver);

		a.clickAndHold(element1).perform();
		Thread.sleep(2000);
		a.moveToElement(element2).perform();
		a.release(element2).perform();

		By el2 = By.xpath(
				"//*[@id='treebox2']/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[3]/td[2]/table/tbody/tr[1]/td[4]/span");
		WebDriverWait wait = new WebDriverWait(driver, 2);
		wait.until(ExpectedConditions.visibilityOfNestedElementsLocatedBy(element2, el2));

		// System.out.println(driver.findElement(By.cssSelector("#droppable>p")).getText());
		// Assert.assertTrue(driver.findElement(By.cssSelector("#droppable>p")).getText().equalsIgnoreCase("Dropped!"));
		driver.quit();
	}

}
