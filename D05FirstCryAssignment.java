package com.TestNGDemos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class D05FirstCryAssignment {
	WebDriver driver;
  @Test(priority =1)
  public void clickOnBoysfashion() {
	  driver.findElement(By.partialLinkText("BOY")).click();
	  
  }
  @Test(priority =2)
  public void clickOnGirlsfashion() {
	  driver.findElement(By.partialLinkText("GIRL")).click();
	  
  }
  @Test(priority =4, enabled=false)
  public void clickOnToys() {
	  driver.findElement(By.partialLinkText("TOY")).click();
	  
  }
  @Test(priority =3)
  public void clickOnFootWare() {
	  driver.findElement(By.partialLinkText("FOOT")).click();
	  
  }

  
  @BeforeMethod
  public void beforeMethod() {
	  driver.get("https://www.firstcry.com/");
	  System.out.println("Title:" + driver.getTitle());
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Title:"+driver.getTitle());
  }

  @BeforeTest
 public void beforeTest() {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));

  }

  @AfterTest
  public void afterTest() {
	  driver.close();
	  
  }

}
