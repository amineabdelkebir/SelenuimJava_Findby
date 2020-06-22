package findelements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FindElementbyname {


	WebDriver Driver;
	@BeforeTest	
	public void openURL()
	{//String FirefoxPath = System.getProperty("user.dir")+"\\resources\\geckodriver.exe";
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Amine\\eclipse-workspace\\selenuiwebdriverdemo12\\resources\\chromedriver.exe");
		//Driver = new FirefoxDriver();
		Driver = new ChromeDriver();
		Driver.navigate().to("https://the-internet.herokuapp.com/login");
		System.out.println("the website is open here");
	}

	@Test
	public void getelementbyid()
	{
		WebElement usernametxt =  Driver.findElement(By.name ("username"));
		WebElement passwordtxt = 	Driver.findElement(By.name ("password"));
		System.out.println(usernametxt.getTagName());
		System.out.println(passwordtxt.getTagName());
	}


	@AfterTest

	public void closeURL()
	{
		Driver.close();
	}


}
