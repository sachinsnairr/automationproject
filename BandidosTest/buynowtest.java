package BandidosTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import bandidos.Buynowpage;

public class buynowtest {
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		
	}
	@Test
	public void Testing()
	{
		Buynowpage ob=new Buynowpage(driver);
		ob.buynow();
	}

}
