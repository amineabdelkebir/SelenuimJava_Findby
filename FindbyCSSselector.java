package findelements;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

public class FindbyCSSselector {




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
		Driver.navigate().to("https://the-internet.herokuapp.com/tables");

		System.out.println("the website is open here");
	}




	public void FindelementbyCSSselector()


	{
		WebElement headlbl = Driver.findElement(By.cssSelector("h2"));
		System.out.println(headlbl.getText());	
		WebElement loginbtn = Driver.findElement(By.cssSelector("button.radius"));
		System.out.println(loginbtn.getText());	
		WebElement username = Driver.findElement(By.cssSelector("inmput#username"));
		System.out.println(loginbtn.getTagName());	
		WebElement password = Driver.findElement(By.cssSelector("imput#password"));
		System.out.println(password.getTagName());	


	}


	public void closeURL()
	{
		Driver.quit();
	}


}
