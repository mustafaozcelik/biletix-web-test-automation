package tr.com.biletix.tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.web.client.RestTemplate;

public class BaseTest {
	
	public WebDriver driver;
	public RestTemplate restTemplate;
	public String url;
	 
    @Before
    public void setup () {
        System.setProperty("webdriver.chrome.driver", "/home/ubuntu/dev/wsDevOps/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        cofigureRestTemplate();
        
    }
 
	private void cofigureRestTemplate() {
		url = "http://localhost:8080/api/v1/testAutomation/insertTestResultDetail";
		restTemplate = new RestTemplate();
	}

	@After
    public void teardown () {
        driver.quit();
    }

}
