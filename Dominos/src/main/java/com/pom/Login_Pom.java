package com.pom;

import org.openqa.selenium.By;

import com.bases.BaseClasses;

public class Login_Pom {
	
	public By pass=By.xpath("//button[text()='ORDER ONLINE NOW']");
	public By Dontallowbtn =   By.xpath("//button[@id='optInText']");
	public By enterorderonline = By.xpath("//input[@placeholder='Enter your delivery address']");
    public By pincode = By.xpath("//li[contains(@data-label,'location_[object Object]')]//div[@class='lst-wrpr']");
	public By enterarealocality = By.xpath("//input[@placeholder='Enter Area / Locality']");
	public By locateme = By.xpath("(//span[@class='lst-desc-main ellipsis'])[2]");
	

}
