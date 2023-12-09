package StepDefinition;

import Pages.AddtoCart;
import Utilis.DriverFactory;
import io.cucumber.java.en.When;

public class addtoCart {
	
	AddtoCart cart = new AddtoCart(DriverFactory.getPage());
	
	
	@When("user clicks on {string} button with respect to itemID {string}")
	public void cartButton(String value, String itemID) {
		cart.toCart(itemID, value);
	}
	
	@When("user selects {string} from {string} dropdown")
	public void dropdownSelect(String dropdown, String value) {
		cart.dropDown(dropdown, value);
	}

}
