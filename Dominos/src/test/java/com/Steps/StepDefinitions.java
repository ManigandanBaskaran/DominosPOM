package com.Steps;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.junit.runner.Runner;
import org.openqa.selenium.WebDriver;

import com.bases.BaseClasses;
import com.pom.Beverages;
import com.pom.Login_Pom;
import com.pom.VegPizza;
import com.pom.checkout;
import com.pom.removeproducts;
import com.runners.RunnerClasses;

import dev.failsafe.internal.util.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Duration;

public class StepDefinitions extends BaseClasses {
public static WebDriver driver = RunnerClasses.driver;
	Login_Pom sp= new Login_Pom();
	VegPizza veg= new VegPizza();
	Beverages bev= new Beverages();
	removeproducts rem =new removeproducts();
	checkout chk= new checkout();
	
	
	
	@Given("Url")
	public void Url() throws InterruptedException  {
		//url(driver, "https://www.dominos.co.in/");
		driver.get("https://www.dominos.co.in/");
	  driver.manage().window().maximize();
	Thread.sleep(5000);
//	   
	}

	@When("User clicks order online now button")
	public void user_clicks_order_online_now_button() {
	    // Write code here that turns the phrase above into concrete actions
		  driver.findElement(sp.pass).click();
	}

	@When("User enter the address and click first suggestion")
	public void user_enter_the_address_and_click_first_suggestion() throws InterruptedException {
		Thread.sleep(3000);
	
        driver.findElement(sp.Dontallowbtn).click();
    
        driver.findElement(sp.enterorderonline).click();
    
        driver.findElement(sp.enterarealocality).sendKeys("600032");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(sp.locateme).click();

	   
	}

	@When("User clicks the VEG PIZZA MENU")
	public void user_clicks_the_veg_pizza_menu() throws InterruptedException {
		
		  driver.findElement(veg.VegPizza).click();
	        Thread.sleep(2000);
	        
	        // scroll(driver,driver.findElement(vegpizza.MargaritaAddtocart));

	        driver.findElement(veg.MargaritaAddtocart).click();

	        
	        driver.findElement(veg.NOthanks).click();

	        Thread.sleep(3000);
	        driver.findElement(veg.peppypaneerAddtocart).click();
	       

	        Thread.sleep(5000);

	        driver.findElement(veg.MargaritaIncreaseButton).click();

	        driver.findElement(veg.peppypaneerIncreaseButton).click();
		
	   
	}

	@When("User clicks the BEVERAGES MENU")
	public void user_clicks_the_beverages_menu() {
		

        driver.findElement(bev.Beverages).click();

        driver.findElement(bev.pepsi).click();

//scroll(driver,driver.findElement(bev.ScrollPepsi));

//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        for(int i=0;i<11;i++){
            driver.findElement(bev.pepsiAddButton).click();
        }
	}

	@When("User removes some products from the addtocart")
	public void user_removes_some_products_from_the_addtocart() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
Thread.sleep(3000);
	      //  driver.findElement(pr.ScrollPaneer).click();
	        driver.findElement(rem.margaritaRemove).click();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        for(int i=0;i<6;i--) {
	            driver.findElement(rem.pepsiRemove).click();
	 
	}}

	@Then("User clicks check out button")
	public void user_clicks_check_out_button() {
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
		driver.findElement(chk.check1).click();
        
        driver.findElement(chk.check2).click();

//
//        String subtotal=driver.findElement(chk.Subtotal).getText();
//        System.out.println(subtotal);
//        Double Subtotalvalue=Double.parseDouble(subtotal);
//        System.out.println("SubTotalValue"+Subtotalvalue);
//
//
//        String Taxandcharges=driver.findElement(chk.Taxandcharges).getText();
//        System.out.println(Taxandcharges);
//        Double TaxAndCharges=Double.parseDouble(Taxandcharges);
//        System.out.println("TaxAndCharges"+TaxAndCharges);
//
//        String GrandTotal=driver.findElement(chk.Grandtotal).getText();
//        Double Grangtotal=Double.parseDouble(GrandTotal);
//        System.out.println("GrandTotal"+GrandTotal);
//
//        Double TotalValue=Double.parseDouble(String.valueOf(Subtotalvalue+TaxAndCharges));
//        System.out.println("Total value: "+TotalValue);
//
//        Assert.assertEquals(TotalValue,Grangtotal);
//
//        driver.close();


		
	  
	}
	
	
	
	
}
