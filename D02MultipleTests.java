package com.TestNGDemos;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class D02MultipleTests {
	@Test(priority =1)
	public void openMessho() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		driver.get("https://www.meesho.com/");
		
		System.out.println("Title:"+ driver.getTitle());
		driver.close();
	}
	@Test(priority =2)
	public void openMyntra() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		driver.get("https://www.myntra.com/");
		
		System.out.println("Title:"+ driver.getTitle());
		driver.close();
	}
	@Test(priority =3)
	public void openAmazon() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		driver.get("https://www.amazon.com/");
		
		System.out.println("Title:"+ driver.getTitle());
		driver.close();
	}
	@Test(priority = 0)
	public void openFlipKart() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		driver.get("https://www.flipkart.com/");
		
		System.out.println("Title:"+ driver.getTitle());
		driver.close();
	}
	@Test(priority =4)
	public void openFirstCry() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		driver.get("https://www.firstcry.com/");
		
		System.out.println("Title:"+ driver.getTitle());
		driver.close();
	}


}
