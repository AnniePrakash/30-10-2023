package org.sample;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JUnitSample {
	
	public static WebDriver driver;
	
	
	@AfterClass
	public static void tc5() {
		
		driver.quit();
		
		System.out.println("Close the windows");
	}
	
	@Before
	
	public void tc03() {
		
		driver.get("https://www.facebook.com/");
		
		System.out.println("URL Launched");
	}
	
	@BeforeClass
	public static void tc01() {
		
		//Set property to launch the browser
		
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		System.out.println("Brower Launched");
		
		
	}
	
	@Test
	
	public void tc04() {
		
		driver.findElement(By.id("email")).sendKeys("Hanno");
		
		driver.findElement(By.id("pass")).sendKeys("Shawn");
		
		System.out.println("Test Case 1");
		
		
	}
	
	@Test
	
	public void tc07() {
		
		System.out.println("Test case  2");
	}
	
	@After
	
	public void tc10() throws IOException {
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		
		File file=new File("C:\\Users\\USER\\Desktop\\Prakash\\junitScreen.png");
		
		
		FileUtils.copyFile(screenshotAs, file);
		
		System.out.println("ScreenShot");
		
		
		
	}
	

	
	

}
