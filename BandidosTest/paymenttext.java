package BandidosTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import bandidos.payementpage;

public class paymenttext {
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
@Test
public void Testing()
{
	payementpage ob=new payementpage(driver);
	ob.savedaddress("Thrissur");
	ob.address("Thrrissur kerala");
	ob.country("india");
	ob.entercity("Guruavyoor");
	ob.firstname("Sachin");
	ob.lastname("s");
	ob.pincode("680103");
	ob.state("Kerala");
	ob.userphno("9497654154");
	ob.Suitename("mra54");
	ob.shippingbtn();
}
}
