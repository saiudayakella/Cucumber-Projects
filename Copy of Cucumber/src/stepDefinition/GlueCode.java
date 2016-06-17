package stepDefinition;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GlueCode {
	public static WebDriver driver;
    String URL="http://demosite.center/wordpress/wp-admin";
    

@Given("^User invokes URL$")
public void user_invokes_URL() throws Throwable {
    driver=new FirefoxDriver();
    driver.get(URL);
    driver.manage().window().maximize();
}


@Given("^User enters \"([^\"]*)\" and \"([^\"]*)\" in the login page$")
public void user_enters_username_and_password_in_the_login_page(String arg1,String arg2) throws Throwable {
    
	driver.findElement(By.id("user_login")).sendKeys(arg1);
	
	
	driver.findElement(By.id("user_pass")).sendKeys(arg2);
	
	
	driver.findElement(By.id("wp-submit")).click();    
}


@When("^Login Credentials are authorized$")
public void login_Credentials_are_authorized() throws Throwable {
   
if(!driver.findElement(By.xpath("/*[@id='login_error']")).isDisplayed())
	{
	WebDriverWait wait=new WebDriverWait(driver,5);
	wait.until(ExpectedConditions.titleContains("Dashboard"));
	}
else
{
	System.out.println("Login Unsuccessful");
}
    
    
}


@Then("^Dashboard page is displayed$")
public void dashboard_page_is_displayed() throws Throwable {
    
    Assert.assertTrue(driver.getTitle().contains("Dashboard"));
    
}


@AfterMethod
public void close()
{
	driver.quit();
}





}
