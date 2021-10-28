package tr.com.biletix.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	String baseURL = "https://www5.biletix.com/anasayfa/TURKIYE/tr";
	String eventUrl = "https://www5.biletix.com/etkinlik/SENA1/TURKIYE/tr?int_cmp_name=SENA1&int_cmp_id=TR-page-TURKIYE-tr&int_cmp_creative=page-hoevent_section-&btx_link=btx_page_hoevent_section_SENA1";
    
    public HomePage goToMainBiletix (){
        driver.get(baseURL);
        return this;
    }
    
    
    public LoginPage goToLoginPage () throws InterruptedException{
    	click(By.id("_evidon-accept-button"));
    	click(By.id("main-control-login"));
        return new LoginPage(driver);
    }
    
    public EventPage goToEventPage () throws InterruptedException{
    	driver.get(eventUrl);
    	return new EventPage(driver);
    }
 

}
