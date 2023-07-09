package BandidosTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import bandidos.Homepage;

public class Homepagetest {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://bandidospitstop.com");
	}
	@Test
	public void Testing()
	{
		Homepage ob=new Homepage(driver);
		ob.enterproductname("visor");
		ob.clicksearch();
	}
	

}
