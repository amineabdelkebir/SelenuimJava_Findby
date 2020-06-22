package findelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FindElementbytagname {

	FirefoxDriver Driver;
	@BeforeTest

	public void openURL()
	{

		String FirefoxPath = System.getProperty("user.dir")+"\\resources\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver",FirefoxPath);
		Driver.navigate().to("https://the-internet.herokuapp.com/login");
		Driver = new FirefoxDriver();
		System.out.println("the website is open here");
	}

	@Test
	public void Findelementbytagname()

	
	{
		WebElement loginbt = Driver.findElement(By.tagName("button"));
		loginbt.click();
		
	}
	
	@AfterTest

	public void closeURL()
	{
		Driver.quit();
	}

}
