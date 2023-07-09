package bandidos;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

public class productpage {
WebDriver driver;

By clickproduct= By.xpath("//a[@href='/products/yamaha-mt-15-metal-visor']");

public productpage(WebDriver driver2) {
	// TODO Auto-generated constructor stub
	this.driver=driver2;
}

public void clickproduct () {
	driver.findElement(clickproduct).click();
}
}
