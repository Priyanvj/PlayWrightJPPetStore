package Pages;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import com.microsoft.playwright.*;


public class CommonStep {

	public Page page;
	public CommonStep(Page page) {
		this.page = page;
	}

	public void ClickTextBox(String textBoxValue) {
		page.locator("xpath=//*[@*='" + textBoxValue + "'] | //*[text()='"+textBoxValue+"']").click();
	}

	public void sendKeys(String textBoxValue, String value) {
		page.locator("xpath=//*[@*='"+textBoxValue+"']").fill(value);
	}
	
	public void textAssertions(String assertText) {
		page.locator("xpath=//*[contains(text(),'"+assertText+"')]").isVisible();
		
	}
	 private String replaceDynamicDatePlaceholder(String input) {
	        if (input.matches(".*\\{\\{\\d+-days-(after|before)-today}}.*")) {
	            String[] parts = input.split("-days-");
	            int days = Integer.parseInt(parts[0].split("\\{\\{")[1]);
	            String operator = parts[1].split("-today")[0].trim();
	            LocalDate currentDate = LocalDate.now();
	            LocalDate newDate;
	            if (operator.equalsIgnoreCase("after")) {
	                newDate = currentDate.plusDays(days);
	            } else if (operator.equalsIgnoreCase("before")) {
	                newDate = currentDate.minusDays(days);
	            } else {
	                newDate = currentDate;
	            }
	            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	            return newDate.format(formatter);
	        } else {
	            return input;
	        }
	    }

	 public void selectDates(String fieldLabel, String date) {
	        Locator dateInputField = page.locator("//*[@*='" + fieldLabel + "']");
	        dateInputField.type(replaceDynamicDatePlaceholder(date));
	    }


}

