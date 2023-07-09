package bandidos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {
WebDriver driver;

By enterproductname=By.name("q");
By clicksearch=By.xpath("//button[@type='submit']");

public Homepage(WebDriver driver2) {
	// TODO Auto-generated constructor stub
	this.driver=driver2;
}
public void enterproductname (String name) {
	driver.findElement(enterproductname).sendKeys(name);
}
public void clicksearch() {
	driver.findElement(clicksearch).click();
}


}
