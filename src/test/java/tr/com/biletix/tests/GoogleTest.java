package tr.com.biletix.tests;

import org.junit.Test;

public class GoogleTest extends BaseTest {

	@Test
	public void navigateToAUrl() {
		// navigate to the web site
		driver.get("http://www.google.com");
		// Validate page title
//		Assert.assertEquals(driver.getTitle(), "Madison Island");
	}

}
