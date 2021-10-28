package tr.com.biletix.tests;


import org.junit.Test;

import tr.com.biletix.pages.HomePage;

public class EventTests extends BaseTest {

	@Test
	public void selectMemberType() throws InterruptedException {
		HomePage homePage = new HomePage(driver);
		homePage.goToMainBiletix().goToLoginPage().loginToBiletix("cagri.kacar@bilgeadam.com", "Aktifol3423")
				.goToEventPage().selectMemberType();
	}

	@Test
	public void selectPerformance() throws InterruptedException {
		HomePage homePage = new HomePage(driver);
		homePage.goToMainBiletix().goToLoginPage().loginToBiletix("cagri.kacar@bilgeadam.com", "Aktifol3423")
				.goToEventPage().selectMemberType().selectPerformance();
	}

	@Test
	public void selectPrice() throws InterruptedException {
		HomePage homePage = new HomePage(driver);
		homePage.goToMainBiletix().goToLoginPage().loginToBiletix("cagri.kacar@bilgeadam.com", "Aktifol3423")
				.goToEventPage().selectMemberType().selectPerformance().scrollDownEventPage("400").selectPrice();
	}
	
	@Test
	public void selectNumberTicket() throws InterruptedException {
		HomePage homePage = new HomePage(driver);
		homePage.goToMainBiletix().goToLoginPage().loginToBiletix("cagri.kacar@bilgeadam.com", "Aktifol3423")
				.goToEventPage().selectMemberType().selectPerformance().scrollDownEventPage("400").selectPrice().selectNumberTicket();
	}
	
	@Test
	public void selectBlock() throws InterruptedException {
		HomePage homePage = new HomePage(driver);
		homePage.goToMainBiletix().goToLoginPage().loginToBiletix("cagri.kacar@bilgeadam.com", "Aktifol3423")
				.goToEventPage().selectMemberType().selectPerformance().scrollDownEventPage("400").selectPrice().selectNumberTicket().selectBlock();
	}
	
	@Test
	public void goToBeforeSalesPage() throws InterruptedException {
		HomePage homePage = new HomePage(driver);
		homePage.goToMainBiletix().goToLoginPage().loginToBiletix("cagri.kacar@bilgeadam.com", "Aktifol3423")
				.goToEventPage().selectMemberType().selectPerformance().scrollDownEventPage("400").selectPrice().selectNumberTicket().selectBlock()
				.selectSpaceInEvent().selectAutoSpaceInEvenet().scrollDownBeforeSalesPage("2000").goToSalesDeliveryPage().selectTypeOfDelivery()
				.scrollDownSalesDeliveryPage("150").selectAddress().scrollDownSalesDeliveryPage("250").selectInsurance().goToPaymentPage();
	}

}
