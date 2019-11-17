package com.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.resources.FunctionalLibrary;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class AddTariffPlanSteps extends FunctionalLibrary {


	@Given("user click on AddTariffbutton")
	public void user_click_on_AddTariffbutton() {
	   
		driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();
		
	}

	@When("user enters all the fields")
	public void user_enters_all_the_fields() {
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("1500");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("15");
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("150");
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("15");
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("2");
		driver.findElement(By.xpath("(//input[@type='text'])[6]")).sendKeys("1");
		driver.findElement(By.xpath("(//input[@type='text'])[7]")).sendKeys("2");
	   
	}
	
	@When("user enters all the fields by TwoDim list")
	public void user_enters_all_the_fields_by_TwoDim_list(DataTable datas) {
		
		List<List<String>> plans = datas.asLists(String.class);
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys(plans.get(2).get(0));
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys(plans.get(2).get(0));
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys(plans.get(2).get(0));
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys(plans.get(2).get(0));
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys(plans.get(3).get(4));
		driver.findElement(By.xpath("(//input[@type='text'])[6]")).sendKeys(plans.get(2).get(5));
		driver.findElement(By.xpath("(//input[@type='text'])[7]")).sendKeys(plans.get(0).get(6));
	   
	}
	
	@When("user enters all the fields by TwoDim map")
	public void user_enters_all_the_fields_by_TwoDim_map(DataTable datas) {
		
		List<Map<String, String>> plans = datas.asMaps(String.class, String.class);
		
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys(plans.get(2).get("A"));
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys(plans.get(0).get("B"));
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys(plans.get(1).get("C"));
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys(plans.get(3).get("D"));
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys(plans.get(0).get("E"));
		driver.findElement(By.xpath("(//input[@type='text'])[6]")).sendKeys(plans.get(2).get("F"));
		driver.findElement(By.xpath("(//input[@type='text'])[7]")).sendKeys(plans.get(3).get("G"));
	   
	}
	
	@When("user enters all the fields {string},{string},{string},{string},{string},{string},{string}")
	public void user_enters_all_the_fields(String a, String b, String c, String d, String e, String f, String g) {
		
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys(a);
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys(b);
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys(c);
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys(d);
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys(e);
		driver.findElement(By.xpath("(//input[@type='text'])[6]")).sendKeys(f);
		driver.findElement(By.xpath("(//input[@type='text'])[7]")).sendKeys(g);
	   
	}

	@When("Click on submit Button")
	public void click_on_submit_Button() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("It should display congratualtion you add tariffplan")
	public void it_should_display_congratualtion_you_add_tariffplan() {
	    Assert.assertTrue(driver.findElement(By.xpath("//h2[contains(text(),'Congratulation you add Tariff Plan')]")).isDisplayed());
	}


}
