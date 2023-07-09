package bandidos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpage {
	WebDriver driver;
	
	By enteremail=By.id("CustomerEmail");
	By enterpass=By.id("CustomerPassword");


public loginpage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
	this.driver=driver2;
	}
public void enteremail (String email) {
	driver.findElement(enteremail).sendKeys(email);
}
public void enterpass(String pass) {
	driver.findElement(enterpass).sendKeys(pass);
}
}