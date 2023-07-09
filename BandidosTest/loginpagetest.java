package BandidosTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import bandidos.loginpage;

public class loginpagetest {
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
@Test
public void Testing()
{
	loginpage ob=new loginpage(driver);
	ob.enteremail("sachinsanir1998@gmail.com");
	ob.enterpass("Password123");
}
}
