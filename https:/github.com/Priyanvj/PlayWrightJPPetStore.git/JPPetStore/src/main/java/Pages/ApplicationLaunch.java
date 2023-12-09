package Pages;

import java.io.IOException;

import com.microsoft.playwright.*;

import Functional.WebActions;

public class ApplicationLaunch {
	
	public Page page;
	
	public ApplicationLaunch(Page page) {
		this.page = page;
	}
	
	
	public void browserLaunch() throws IOException
	{
		page.navigate(WebActions.getProperty("URL"));
	}
	
}
