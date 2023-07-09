package bandidos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Buynowpage {
	WebDriver driver;
	
	
	By buynow= By.xpath("//div[@class='shopify-cleanslate']");


public Buynowpage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
	this.driver=driver2;
	}


public void buynow() {
	driver.findElement(buynow).click();
}
}