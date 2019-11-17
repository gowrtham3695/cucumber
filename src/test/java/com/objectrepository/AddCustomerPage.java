package com.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.FunctionalLibrary;

public class AddCustomerPage extends FunctionalLibrary {
	
	public AddCustomerPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//label[@for='done']")
	private WebElement doneButton;
	
	@FindBy(id="fname")
	private WebElement fname;
	
	@FindBy(id="lname")
	private WebElement lname;
	
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(name="addr")
	private WebElement address;
	
	public WebElement getDoneButton() {
		return doneButton;
	}

	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getPhno() {
		return phno;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}

	@FindBy(id="telephoneno")
	private WebElement phno;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement submitButton;
	

}
