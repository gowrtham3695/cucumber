package com.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.objectrepository.AddCustomerPage;
import com.objectrepository.HomePage;
import com.resources.FunctionalLibrary;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;


public class AddCustomerSteps extends FunctionalLibrary {
	


	@Given("user click on add customer button")
	public void user_click_on_add_customer_button() {
	
		HomePage page=new HomePage();
		button(page.getAddCusButton());
	
	}

	@When("user enters all the feilds")
	public void user_enters_all_the_feilds() {
		
	AddCustomerPage page=new AddCustomerPage();
	button(page.getDoneButton());
	insertValue(page.getFname(), "karthi");
	insertValue(page.getLname(), "rajan");
	insertValue(page.getEmail(), "rajan@gmail.com");
	insertValue(page.getAddress(), "thanjavore");
	insertValue(page.getPhno(), "12334556677");
	  
	}
	
	@When("user enters all the feilds by OneD list")
	public void user_enters_all_the_feilds_by_OneD_list(DataTable datas) {
		
		List<String> cusData = datas.asList(String.class);
		
		driver.findElement(By.xpath("//label[@for='done']")).click();
		
		driver.findElement(By.id("fname")).sendKeys(cusData.get(0));
		driver.findElement(By.id("lname")).sendKeys(cusData.get(1));
		driver.findElement(By.id("email")).sendKeys(cusData.get(2));
		driver.findElement(By.name("addr")).sendKeys(cusData.get(3));
		driver.findElement(By.id("telephoneno")).sendKeys(cusData.get(4));
		
		

	}
	
	@When("user enters all the feilds by OneM list")
	public void user_enters_all_the_feilds_by_OneM_list(DataTable datas) {
		
		Map<String, String> cusData = datas.asMap(String.class, String.class);
		
		driver.findElement(By.xpath("//label[@for='done']")).click();
		
		driver.findElement(By.id("fname")).sendKeys(cusData.get("fname"));
		driver.findElement(By.id("lname")).sendKeys(cusData.get("lname"));
		driver.findElement(By.id("email")).sendKeys(cusData.get("email"));
		driver.findElement(By.name("addr")).sendKeys(cusData.get("address"));
		driver.findElement(By.id("telephoneno")).sendKeys(cusData.get("phno"));
		
		

	}

	@When("user click on submit button")
	public void user_click_on_submit_button() {
		
		AddCustomerPage page=new AddCustomerPage();
		button(page.getSubmitButton());
		
	}

	@Then("user should be displayed customer id is generated")
	public void user_should_be_displayed_customer_id_is_generated() {

             Assert.assertTrue(driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());
		
	}



}
