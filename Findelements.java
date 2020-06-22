package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Findelements {
	
	
	
	
	

	FirefoxDriver Driver;

@BeforeTest
	public void openURL()
	{

		String FirefoxPath = System.getProperty("user.dir")+"\\resources\\geckodriver.exe";
		System.out.println("line 1");
		
		System.setProperty("webdriver.gecko.driver",FirefoxPath);
		System.out.println("line 2");
		Driver =  new FirefoxDriver();
		System.out.println("line 3");
		Driver.navigate().to("https://the-internet.herokuapp.com/");

		System.out.println("the website is open here");
	}


@Test

	public void Findelements()


	{
	List<WebElement> links= Driver.findElements(By.tagName("a")) ;
	System.out.println(links.size());
	Assert.assertEquals(41,links.size());
	for(WebElement link : links) {
		System.out.println(link.getAttribute("href"));
		
	}
	}

         @AfterTest        	
	public void closeURL()
	{
		Driver.quit();
	}



}
