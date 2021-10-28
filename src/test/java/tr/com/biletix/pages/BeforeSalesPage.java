package tr.com.biletix.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BeforeSalesPage extends BasePage{

	public BeforeSalesPage(WebDriver driver) {
		super(driver);
	}
	
	public SalesDeliveryPage goToSalesDeliveryPage() {
		click(By.id("upsell_form:ButtonID"));
		return new SalesDeliveryPage(driver);
	}
	
	public BeforeSalesPage scrollDownBeforeSalesPage(String pixel) {
		scrollDownPage(pixel);
		return this;
	}

}
