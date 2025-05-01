package com.TestNGDemos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class D07AssertionDemo {
	WebDriver driver;
	
	String expUrl="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index", actUrl;
	
	@Test(dataProvider = "getLoginData")
	public void logioToOHRM(String un, String ps) {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(un);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(ps);
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		
		actUrl=driver.getCurrentUrl();
		//Assert.assertEquals(actUrl, expUrl, "Invalid credentials");
		Assert.assertTrue(actUrl.contains("dashboard"),"Invalid credentials");
	}
	@DataProvider
	public Object[][] getLoginData() {
		return new Object[][] {
			new Object[] { "admin", "admin123" },
			new Object[] { "amit", "amit123" },
			new Object[] { "ranjan", "ranjan123" },
			new Object[] { "aditya", "aditya123" },
			new Object[] { "admin", "admin123" },
		};
	}
	@AfterMethod
	public void afterMethod() {
		if(driver.getCurrentUrl().contains("dashboard")) {
			System.out.println("Login sucessful!!!");
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/span/i")).click();
			driver.findElement(By.partialLinkText("Log")).click();
		}
		else
			System.out.println(driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]")).getText());
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}

}
