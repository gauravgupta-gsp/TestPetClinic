package stepdefs;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;

import drivers.SingletonWebdriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FindOwner {
	
	By txt_firstName = By.id("firstName");
	By txt_lastName = By.id("lastName");
	By txt_address = By.id("address");
	By txt_city = By.id("city");
	By txt_telephone = By.id("telephone");
	
	
	
	
	@Given("I am on Find owners page")
	public void i_am_on_find_owners_page() {
		SingletonWebdriver.getDriver().navigate().to("http://localhost:8080/petclinic/owners/find.html"); 
	    
	}

	@Given("I Click on Add Owner HyperLink")
	public void i_click_on_add_owner_hyper_link() {
	    SingletonWebdriver.getDriver().findElement(By.xpath("/html/body/div/a")).click();
	}

	@When("I enter New Owner details {string} {string} {string} {string} {string}")
	public void i_enter_new_owner_details(String firstName, String lastName, String address, String city, String telephone) {
	    SingletonWebdriver.getDriver().findElement(txt_firstName).sendKeys("Nagamanni");
	    SingletonWebdriver.getDriver().findElement(txt_lastName).sendKeys("Madi");
	    SingletonWebdriver.getDriver().findElement(txt_address).sendKeys("Some Good colony");
	    SingletonWebdriver.getDriver().findElement(txt_city).sendKeys("Hyderabad");
	    SingletonWebdriver.getDriver().findElement(txt_telephone).sendKeys("0183257");
	}

	@When("I click on Add Owner Button")
	public void i_click_on_add_owner_button() {
	    SingletonWebdriver.getDriver().findElement(By.xpath("//*[@id=\"add-owner-form\"]/div[6]/button")).click();
	}

	@Then("I should see newly added Pet owner")
	public void i_should_see_newly_added_pet_owner() {
	    assertTrue(SingletonWebdriver.getDriver().findElement(By.xpath("/html/body/div/table[1]/tbody/tr[1]/td/b")).getText().equalsIgnoreCase("Nagamani Maddi"));
	}

}
