package com.pom;

import org.openqa.selenium.By;

public class VegPizza {

	 public By VegPizza = By.xpath("//div[@data-label='Veg Pizza']//span[.='VEG PIZZA']");
	    public By MargaritaAddtocart=By.xpath(("(//div[contains(@data-label,'Margherita')])[2]//span[.='ADD TO CART']"));

	    public By NOthanks=By.xpath("//button[@data-label='Add button']//span[text()='NO THANKS']");


	    public By peppypaneerAddtocart=By.xpath("(//div[contains(@data-label,'Peppy Paneer')])[2]//span[.='ADD TO CART']");

	    public By MargaritaIncreaseButton=By.xpath("(//div[@data-label='increase'])[5]");
	     // public By FarmhouseAddtocart=By.xpath("(//div[@data-label='Farmhouse'])[1]//button[@data-label='addTocart']");
	     public By peppypaneerIncreaseButton=By.xpath("(//div[@data-label='increase'])[6]");	
	
	
}
