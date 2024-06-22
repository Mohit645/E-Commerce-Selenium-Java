package stepDefinition;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import resources.Base;

public class Test_Steps extends Base{
	
	WebDriver driver;
	String googleUrl;
	
	public Test_Steps() throws IOException {
		// TODO Auto-generated constructor stub
		driver = initializeDriver();
		googleUrl = "https://www.google.com/";
	}
	
	@Given("Open google")
	public void open_google() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I can reach here");
	    driver.get(googleUrl);
	}


	@When("User will pass {string} to check currency exchange")
	public void user_will_pass_to_check_currency_exchange(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.name("q")).sendKeys(string);
	}
	@Then("Click Search button")
	public void click_search_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		System.out.println("I have clicked 1");
	 //   driver.findElement(By.name("btnK")).click();
	    System.out.println("I have clicked 2");
	}
	@Then("Validate the rate")
	public void validate_the_rate() {
	    // Write code here that turns the phrase above into concrete actions
	    float expectedRate = 90;
	    String rateIdentifier ="//div[@id='knowledge-currency__updatable-data-column']/div/div[2]/span";
	    String currentRate = driver.findElement(By.xpath(rateIdentifier)).getText();
	    float currentrate = Float.parseFloat(currentRate);
	    System.out.println(currentrate);
	    Assert.assertTrue(currentrate > expectedRate);
	    driver.close();
	}



}
