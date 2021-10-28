package tr.com.biletix.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SalesDeliveryPage extends BasePage {

	public SalesDeliveryPage(WebDriver driver) {
		super(driver);
	}

	public SalesDeliveryPage selectTypeOfDelivery() {
		click(By.id("deliveryTypeRadio:63121467"));
		return this;
	}

	public SalesDeliveryPage selectAddress() {
		click(By.xpath("/html/body/div[5]/div/div[2]/div[4]/form/div/div[1]/div[2]/div/div[2]/div/div[1]/section/div[1]/article/div/div[3]/div[3]/div[2]/div[2]/div[3]/table/tbody/tr[1]/td/div/table/tbody/tr/td[1]/table/tbody/tr/td[1]/input[1]"));
//		click(By.id("deliveryForm:addresses:0:checkbox_usethis"));
		return this;
	}

	public SalesDeliveryPage selectInsurance() {
		click(By.id("insurance_no"));
		return this;
	}

	public SalesPaymentPage goToPaymentPage() {
		click(By.xpath("/html/body/div[5]/div/div[2]/div[4]/form/div/div[4]/div/div/input"));
		return new SalesPaymentPage(driver);
	}
	
	public SalesDeliveryPage scrollDownSalesDeliveryPage(String pixel) {
		scrollDownPage(pixel);
		return this;
	}

}
