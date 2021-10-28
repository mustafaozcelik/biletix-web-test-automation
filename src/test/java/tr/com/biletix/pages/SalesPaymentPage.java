package tr.com.biletix.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SalesPaymentPage extends BasePage{

	public SalesPaymentPage(WebDriver driver) {
		super(driver);
	}
	
	public SalesPaymentPage filCreditCartInfos() {
		writeText(By.id("paymentForm:cardOwnerName:cardOwnerNameField"), "jokerCagri");
		writeText(By.id("paymentForm:creditCardNo:creditCardNoField"), "2323232323232323");
		List<WebElement> yearsElements = driver.findElements(By.id("paymentForm:cardExpireDate:cardExpireDateFieldYear"));
		for (WebElement yearElement : yearsElements) {
			if(yearElement.getText().equals("2022")) {
				yearElement.click();
				break;
			}
		}
		writeText(By.id("paymentForm:cvvArea:cvvField"), "123");
		return this;
	}
	
	public SalesPaymentPage scrollDownPaymentPage(String pixel) {
		scrollDownPage(pixel);
		return this;
	}
	
	public SalesPaymentPage acceptCondition() {
		click(By.xpath("/html/body/div[5]/div/div[3]/form/div[2]/div/div[5]/div/div[2]/div/label"));
		return this;
	}
	
	public SalesConfirmationPage goToSalesConfirmationPage() {
		click(By.xpath("/html/body/div[5]/div/div[3]/form/div[2]/div/div[5]/div/div[3]/div[3]/div/input[1]"));
		return new SalesConfirmationPage(driver);
	}
	

}
