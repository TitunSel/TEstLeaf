package MySeleniumClasses.MySeleniumClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class TestNGtEST {

	public RemoteWebDriver driver;
	@Test
		public void login() {
	        System.setProperty("webdriver.chrome.driver", "./Chromedriver/chromedriver.exe");
			driver= new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			driver.get("http://leaftaps.com/opentaps");
			driver.manage().window().maximize();
			
			driver.findElementById("username").sendKeys("demoSalesManager");
			driver.findElementById("password").sendKeys("crmsfa");
			driver.findElementByClassName("decorativeSubmit").click();
		}
		

	}


