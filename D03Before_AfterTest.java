package com.TestNGDemos;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D03Before_AfterTest {
	WebDriver driver;
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
	@Test(priority =1)
	public void openMessho() {
		driver.get("https://www.meesho.com/");
		
		System.out.println("Title:"+ driver.getTitle());
		
	}
	@Test(priority =2)
	public void openMyntra() {
		driver.get("https://www.myntra.com/");
		
		System.out.println("Title:"+ driver.getTitle());
	}
	@Test(priority =3)
	public void openAmazon() {
		driver.get("https://www.amazon.in/");
		
		System.out.println("Title:"+ driver.getTitle());
	}
	@Test(priority = 0)
	public void openFlipKart() {
		driver.get("https://www.flipkart.com/");
		
		System.out.println("Title:"+ driver.getTitle());
	}
	@Test(priority =4)
	public void openFirstCry() {
		driver.get("https://www.firstcry.com/");
		
		System.out.println("Title:"+ driver.getTitle());
	}
	}
