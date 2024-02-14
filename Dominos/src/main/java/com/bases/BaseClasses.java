package com.bases;

import java.io.File;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BaseClasses {
	
//	public static WebDriver driver;
	public static void url(WebDriver Driver, String value) {
		
		Driver.get(value);
	//
	}
		
		public static void input(WebElement ele, String value) {
			
	ele.sendKeys(value);
		}
	
		public static void  tab(WebElement ele) {
			
			ele.click();
			
	
	}
	//	
		public static void indexselect(WebElement ele, int num) {
			
			Select s= new Select(ele);
			s.selectByIndex(num);
			
		}
	//	
//		
public static void valueselect(WebElement ele,String value) {
			
			Select s= new Select(ele);
		s.selectByValue(value);
			
		}
	public static void Visibleselect(WebElement ele,String value) {
		
		Select s= new Select(ele);
		s.selectByValue(value);
		
	}

	public static void snap(WebDriver driver, String value) {
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File des= new File("C:\\Users\\rajka\\eclipse-workspace\\Adactin\\screenshots\\"+value+".png");
	}
	

	
	 public static void scroll(WebDriver driver, WebElement element) {

	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].scrollIntoView()", element);
	    }
	public static void jclick (WebDriver driver,WebElement ele){
	            JavascriptExecutor jse = (JavascriptExecutor) driver;
	            jse.executeScript("arguments[0].click;", ele);
	        }

  
}


