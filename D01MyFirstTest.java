package com.TestNGDemos;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class D01MyFirstTest {
  @Test
  public void openSelenium() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		driver.get("https://www.selenium.dev/");
		
		System.out.println("Title:"+ driver.getTitle());
		
		driver.close();
  }
  
 
  }

