package testNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNG {
	
@Test
public void kahaani() {
	System.setProperty("webdriver.chrome.driver", "./Chromedriver/chromedriver.exe");
	
	ChromeDriver driver=new ChromeDriver();
	
	driver.get("https://google.co.in");
	
	driver.manage().window().maximize();
	
	driver.close();
}

}
