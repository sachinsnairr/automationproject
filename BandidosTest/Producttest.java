package BandidosTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import bandidos.productpage;

public class Producttest {
WebDriver driver;
@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
	
}
@Test
public void Tetsing()
{
	productpage ob=new productpage(driver);
	ob.clickproduct();
}
}
