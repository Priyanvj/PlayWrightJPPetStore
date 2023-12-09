package StepDefinition;

import Pages.CommonStep;
import Utilis.DriverFactory;
import io.cucumber.java.en.*;

public class Commonstep {
	
	public CommonStep common = new CommonStep(DriverFactory.page);
	
	
	@When("user enters {string} in to textbox {string}")
	public void enterTextBox(String textBoxValue, String value) {
		common.sendKeys(value,textBoxValue);
	}

	@When("user clicks on {string} button/text/link/title/product")
	public void clickTextBox(String textBoxValue) {
		common.ClickTextBox(textBoxValue);
	}
	
	@Then("assert that {string} is displayed")
	public void assertText(String value) {
		common.textAssertions(value);
	}
	
	@When("user enters {string} in to the field {string}")
	public void datepicker(String datevalue, String field) {
		common.selectDates(field, datevalue);
	}
	
}
