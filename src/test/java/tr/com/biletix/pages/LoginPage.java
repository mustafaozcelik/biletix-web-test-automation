package tr.com.biletix.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	public HomePage loginToBiletix (String username, String password){
        //Enter Username(Email)
        writeText(By.id("ifmember_login:uname_area:email_ifmember"),username);
        //Enter Password
        writeText(By.id("ifmember_login:pass_area:pass_ifmember"), password);
        //Click Login Button
        click(By.id("ifmember_login:signin_area"));
        return new HomePage(driver);
    }

}
