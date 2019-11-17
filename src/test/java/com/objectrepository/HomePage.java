package com.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.FunctionalLibrary;

public class HomePage extends FunctionalLibrary {
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="(//a[text()='Add Customer'])[1]")
	private WebElement addCusButton;
	
	public WebElement getAddCusButton() {
		return addCusButton;
	}

	public WebElement getAddTarButton() {
		return addTarButton;
	}


	@FindBy(xpath="//a[text()='Add Tariff Plan']")
	private WebElement addTarButton;
	
	

}
