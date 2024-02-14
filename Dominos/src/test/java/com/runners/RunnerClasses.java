package com.runners;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.bases.BaseClasses;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\DominosFeature\\Front.feature"
, glue="com.Steps")

public class RunnerClasses extends BaseClasses {

	

		public static WebDriver driver;
		
		
		@BeforeClass
		public static void start() {
			
			driver=new ChromeDriver();

		}

		}	
