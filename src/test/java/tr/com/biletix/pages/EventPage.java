package tr.com.biletix.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EventPage extends BasePage {

	public EventPage(WebDriver driver) {
		super(driver);
	}

	public EventPage selectMemberType() {
		click(By.id("member_type"));
		List<WebElement> selectMemberTypes = By.className("values").findElements(driver);
		for (WebElement selectMemberType : selectMemberTypes) {
			if (selectMemberType.getText().equals("GENEL SATIŞ")) {
				selectMemberType.click();
				break;
			}
		}
		return this;
	}

	public EventPage selectPerformance() {
		click(By.id("performance"));
		List<WebElement> selectPerformances = By.className("values").findElements(driver);
		for (WebElement selectPerf : selectPerformances) {
			if (selectPerf.getText().equals("12 Aralık 2021 22:00")) {
				selectPerf.click();
				break;
			}
		}
		return this;
	}

	public EventPage selectPrice() {
		click(By.id("event-price"));
		List<WebElement> selectPrices = By.className("values").findElements(driver);
		for (WebElement selectPrice : selectPrices) {
			if (selectPrice.getText().equals("3. Kategori 110,00 TL")) {
				selectPrice.click();
				break;
			}
		}
		return this;
	}
	
	public EventPage selectNumberTicket() {
		click(By.id("adet"));
		List<WebElement> selectNumberTickets = By.tagName("option").findElements(driver);
		for (WebElement selectNumberTicket : selectNumberTickets) {
			if (selectNumberTicket.getText().equals("2")) {
				selectNumberTicket.click();
				break;
			}
		}
		return this;
	}
	
	public EventPage selectBlock() {
		String expectedBlockName = "SLNC-ORKESTRA ÇİFT";
		click(By.id("block"));
		List<WebElement> selectBlocks = By.className("values").findElements(driver);
		for (WebElement selectBlock : selectBlocks) {
			if (selectBlock.getText().trim().equals(expectedBlockName)) {
				selectBlock.click();
				break;
			}
		}
		return this;
	}
	
	public EventPage scrollDownEventPage(String pixel) {
		scrollDownPage(pixel);
		return this;
	}
	
	public EventPage selectSpaceInEvent () throws InterruptedException{
		click(By.xpath("/html/body/div[12]/div[5]/div/div[3]/div[8]/div[1]/div/div[2]/div[1]/div[4]/span/input"));
//    	click(By.id("ButtonID"));
    	return this;
    }
	
	public BeforeSalesPage selectAutoSpaceInEvenet () throws InterruptedException{
    	click(By.id("autoSelect"));
    	return new BeforeSalesPage(driver);
    }

}
