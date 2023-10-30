package org.sample;



import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	static WebDriver driver;
	
public static void BrowserLaunch(String browser ) {
		
		switch (browser) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			
			 driver=new ChromeDriver();
			
			break;
		case "firefox":
			
			WebDriverManager.firefoxdriver().setup();
			
			driver=new FirefoxDriver();
			
			break;
			
		case "edge":
			
			WebDriverManager.edgedriver().setup();
			
			driver=new EdgeDriver();
			break;

		default:
			
			System.out.println("Unsupported Browser");
			WebDriverManager.chromedriver().setup();
			
			 driver=new ChromeDriver();
			
			break;
		}
		

			
	}
	
	public static void launchUrl(String url) {
		
		driver.get(url);
	}
	
	
	public static void enterValue(WebElement element,String value) {
		
		element.sendKeys(value);
		
		
		
	}
	public void maximize() {
		driver.manage().window().maximize();
	}
	
	public void setSize(int width,int height) {
		Dimension dimension=new Dimension(width, height);
		
		driver.manage().window().setSize(dimension);
	}
	
	public static void navigateto(String url) {
		
		driver.navigate().to(url);
	}
	
	public static void forward() {
		driver.navigate().forward();
	}
	
	public static WebElement findElement(String locator,String value) {
		
		WebElement element=null;
		
		if(locator.equalsIgnoreCase("id")) {
			
			element=driver.findElement(By.id(value));
		}
		
		else if(locator.equalsIgnoreCase("name")) {
			
			element=driver.findElement(By.name(value));
		}
		
		else if(locator.equalsIgnoreCase("classname")) {
			
			element=driver.findElement(By.className(value));
		}
		
		else if(locator.equalsIgnoreCase("tagname")) {
			
			element=driver.findElement(By.tagName(value));
		}
		
		else if(locator.equalsIgnoreCase("linktext")) {
			
			element=driver.findElement(By.linkText(value));
		}
		
		else if(locator.equalsIgnoreCase("partiallinktext")) {
			
			element=driver.findElement(By.partialLinkText(value));
		}
		
		else if(locator.equalsIgnoreCase("xpath")) {
			
			element=driver.findElement(By.xpath(value));
		}
		
		else if (locator.equalsIgnoreCase("cssselector")) {
			
			element=driver.findElement(By.cssSelector(value));
		}
		
		else {
			
			System.out.println("Enter correct locator");
		}
		
		return element;
	}
	
	public static void quit() {
		
		driver.quit();
	}
	
	public static void close() {
		
		driver.close();
	}
	
	public static void screenShot(String path) throws IOException {
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		File screenshot=ts.getScreenshotAs(OutputType.FILE);
		
		File file=new File(path);
		
		FileUtils.copyFile(screenshot, file);
	}
	

}
