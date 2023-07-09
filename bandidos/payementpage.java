package bandidos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class payementpage {
	WebDriver driver;
	By savedaddress=By.id("Select0");
	By country=By.id("Select1");
	By firstname=By.id("TextField1");
	By lastname=By.id("TextField2");
	By address=By.id("TextField3");
	By suite=By.id("TextField4");
	By city=By.name("city");
	By state=By.name("zone");
	By pincode=By.name("postalcode");
	By phno=By.id("phone");
	By shippingbtn=By.xpath("//Button([@type='submit']");
	

public payementpage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
	this.driver=driver2;
	}
public void savedaddress(String add) {
	driver.findElement(address).sendKeys(add);
	WebElement ddown =driver.findElement(By.id("Select0"));
	Select select =new Select(ddown);
	select.deselectByValue("0");
	
}
public void country(String countryname) {
	driver.findElement(country).sendKeys(countryname);
	WebElement ddown=driver.findElement(By.id("Select1"));
	Select select=new Select(ddown);
	select.deselectByValue("IN");
}

public void lastname(String lastname) {
	driver.findElement(address).sendKeys(lastname);
}
public void firstname(String first) {
	driver.findElement(firstname).sendKeys(first);
}
public void Suitename(String entersuite) {
    driver.findElement(suite).sendKeys(entersuite);
}
public void address(String city) {
	  driver.findElement(address).sendKeys(city);
}
public void state(String statename) {
	driver.findElement(state).sendKeys(statename);
	WebElement ddown= driver.findElement(By.id("Select2"));
	Select select =new Select(ddown);
	select.deselectByValue("kl");
	
}
public void pincode(String code) {
	driver.findElement(pincode).sendKeys(code);
}
public void entercity(String cityname ) {
	driver.findElement(city).sendKeys(cityname);
	
}
public void userphno(String enterphno) {
	driver.findElement(phno).sendKeys(enterphno);
}
public void shippingbtn(){
	driver.findElement(shippingbtn).click();
}
}

	