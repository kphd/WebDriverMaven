package com.edusol.Git_Project_for_GitHub;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {

	public static WebDriver driver;
	
	@BeforeTest
	public void SetUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	@Test
	public void doLogin()
	{
		System.out.println("Executing Login Test");
		
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		
		driver.findElement(By.id("email")).sendKeys("harshda.kulkarni34@gamail.com");
		driver.findElement(By.id("pass")).sendKeys("123");
		driver.findElement(By.name("login")).click();
		
		System.out.println("Logging into facebook account");
	}
	
	@AfterTest
	public void QuitDriver()
	{
		if(driver!=null)
			driver.close();
	}
}
