package com.TestNGDemos;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D04Before_AfterMethod {
	WebDriver driver;
	int i=1;
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("\tBefore Method");
	}
	@AfterMethod
	public void printTitle() throws IOException {
		System.out.println("\t\tTitle:" + driver.getTitle());
		System.out.println("\tAfterMethod");
		File file= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileHandler.copy(file, new File("D:\\MyFile\\ss.jpeg"));
		FileHandler.copy(file, new File("ss"+i+".jpeg"));
		i++;
	}
	@Test(priority =1)
	public void openMessho() {
		driver.get("https://www.meesho.com/");
		
	}
	@Test(priority =2)
	public void openMyntra() {
		driver.get("https://www.myntra.com/");
	}
	@Test(priority =3)
	public void openAmazon() {
		driver.get("https://www.amazon.in/");
	}
	@Test(priority = 0)
	public void openFlipKart() {
		driver.get("https://www.flipkart.com/");
	}
	@Test(priority =4)
	public void openFirstCry() {
		driver.get("https://www.firstcry.com/");
	}
	@BeforeTest
	public void openBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		driver.get("https://google.com");
		System.out.println("Before Test");
	}
	@AfterTest
	public void closedBrowser() {
		driver.close();
		System.out.println("After Test");
	}

	}
