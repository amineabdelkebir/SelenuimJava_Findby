package findelements;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FindElementbyclass {



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
	public void getelementbyid()
	{try
	{
		WebElement usernametxt =  Driver.findElement(By.id ("username"));
		WebElement passwordtxt = 	Driver.findElement(By.id ("password"));
		WebElement loginbtn = Driver.findElement(By.className("radius"));

		System.out.println(usernametxt.getTagName());
		System.out.println(passwordtxt.getTagName());
		System.out.println(loginbtn.getTagName());
	}
	catch (NoSuchElementException e)
	
	{System.out.println(" the element do not use");}
	
	}
	
	@AfterTest

	public void closeURL()
	{
		Driver.quit();
	}
}
