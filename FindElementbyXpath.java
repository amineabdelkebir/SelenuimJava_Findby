package findelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class FindElementbyXpath {

	
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
			Driver.navigate().to("https://the-internet.herokuapp.com/login");

			System.out.println("the website is open here");
		}

	@Test
	public void FindElementByxpath()
	{
		WebElement username = Driver.findElement(By.xpath("//*[@id=\"username\"]"));
		WebElement password = Driver.findElement(By.xpath("//*[@id=\"password\"]"));
		WebElement loginbtn = Driver.findElement(By.xpath("//*[@id=\"login\"]/button"));
		System.out.println(username.getTagName());
		System.out.println(password.getTagName());
		System.out.println(loginbtn.getText());
		
	}

	@AfterTest
	 	public void closedriver()
	 	{
		
		Driver.close();
	 	}

}



