package tr.com.biletix.tests;

import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import tr.com.biletix.pages.HomePage;
import tr.com.biletix.test.api.dto.BtxTAInputDTO;
import tr.com.biletix.test.api.dto.BtxTAOutputDTO;
import tr.com.biletix.test.api.dto.TestResult;

public class TicketSaleTest extends BaseTest {

	@Test
	public void ticketSalesTest() throws InterruptedException {
		BtxTAInputDTO inputDTO = new BtxTAInputDTO();
		inputDTO.setStartTestCase(new Date());
		inputDTO.setTestCaseName("ticketSaleTest");

		HomePage homePage = new HomePage(driver);
		homePage.goToMainBiletix().goToLoginPage().loginToBiletix("cagri.kacar@bilgeadam.com", "Aktifol3423")
				.goToEventPage().selectMemberType().selectPerformance().scrollDownEventPage("400").selectPrice()
				.selectNumberTicket().selectBlock().selectSpaceInEvent().selectAutoSpaceInEvenet()
				.scrollDownBeforeSalesPage("2000").goToSalesDeliveryPage().selectTypeOfDelivery()
				.scrollDownSalesDeliveryPage("150").selectAddress().scrollDownSalesDeliveryPage("250")
				.goToPaymentPage().filCreditCartInfos().scrollDownPaymentPage("600").acceptCondition()
				.goToSalesConfirmationPage();

		try {
			String expectedText = "Teşekkürler,";
			boolean assertionResult = false;

			List<WebElement> ticketSalesInfoList = By.className("newblue").findElements(driver);
			for (WebElement info : ticketSalesInfoList) {
				if (info.getText().trim().equals(expectedText)) {
					assertionResult = true;
					break;
				}
			}

			Assert.assertTrue(assertionResult);
			inputDTO.setResult(TestResult.SUCCESS.toString());
			inputDTO.setResultMessage("Bilet başarılı şekilde satın alındı.");
			inputDTO.setFinishTestCase(new Date());
			restTemplate.postForEntity(url, inputDTO, BtxTAOutputDTO.class);

		} catch (AssertionError e) {
			inputDTO.setResult(TestResult.FAIL.toString());
			inputDTO.setResultMessage("Bilet satın alam işlemi başarısız.");
			inputDTO.setFinishTestCase(new Date());
			restTemplate.postForEntity(url, inputDTO, BtxTAOutputDTO.class);
		}

	}

}
