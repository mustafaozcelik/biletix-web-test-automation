package tr.com.biletix.tests;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import tr.com.biletix.pages.HomePage;
import tr.com.biletix.test.api.dto.BtxTAInputDTO;
import tr.com.biletix.test.api.dto.BtxTAOutputDTO;
import tr.com.biletix.test.api.dto.TestResult;

public class LoginTest extends BaseTest {
	
	/**
	 * sucess login test
	 */
	@Test
	public void succesLoginTest() throws InterruptedException {
		BtxTAInputDTO inputDTO = new BtxTAInputDTO();
		inputDTO.setTestCaseName("succesLoginTest");
		inputDTO.setStartTestCase(new Date());

		HomePage homePage = new HomePage(driver);
		homePage.goToMainBiletix().goToLoginPage().loginToBiletix("cagri.kacar@bilgeadam.com", "Aktifol3423");
		
		try {
			String expectedText = "Hesabım";
			String actualText = By.id("logoutspan").findElement(driver).getText().trim();
			
			Assert.assertTrue(expectedText.equals(actualText));
			inputDTO.setResult(TestResult.SUCCESS.toString());
			inputDTO.setResultMessage("Başarılı şekilde oturum açıldı.");
			inputDTO.setFinishTestCase(new Date());
			restTemplate.postForEntity(url, inputDTO, BtxTAOutputDTO.class);
		} catch (AssertionError e) {
			inputDTO.setResult(TestResult.FAIL.toString());
			inputDTO.setResultMessage("Başarılı şekilde oturum açılamadı.");
			inputDTO.setFinishTestCase(new Date());
			restTemplate.postForEntity(url, inputDTO, BtxTAOutputDTO.class);
		}

	}
	
	/**
	 * fail login test
	 */
	@Test
	public void failLoginTest() throws InterruptedException {
		
		HomePage homePage = new HomePage(driver);
		homePage.goToMainBiletix().goToLoginPage().loginToBiletix("cagri.cagri@bilgeadam.com", "asdnm");
		BtxTAInputDTO inputDTO = new BtxTAInputDTO();
		inputDTO.setTestCaseName("failLoginTest");
		
		try {
			
			String actualErrorMessage = By.className("error_message").findElement(driver).getText().trim();
			String expectedErrorMessage = "Geçersiz e-posta veya şifre girdiniz.";
			
			Assert.assertTrue(expectedErrorMessage.equals(actualErrorMessage));
			
			inputDTO.setResult(TestResult.SUCCESS.toString());
			inputDTO.setResultMessage("Yanlış username veya password ile oturum açılma denendiğin zaman ilgili mesaj gösterildi.");
			restTemplate.postForEntity(url, inputDTO, BtxTAOutputDTO.class);
		} catch (AssertionError e) {
			inputDTO.setResult(TestResult.FAIL.toString());
			inputDTO.setResultMessage("Yanlış username veya password ile oturum açılma denendiğin zaman oturum açıldı veya ilgili mesaj gösterilmedi.");
			restTemplate.postForEntity(url, inputDTO, BtxTAOutputDTO.class);
		}
	}

}
