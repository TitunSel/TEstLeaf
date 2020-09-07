package feature;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class Steps {

	public WebDriver driver;
	@Given("The User has landed on LeafTaps Page")
	public void log() {
		System.setProperty("webdriver.chrome.driver", "./Chromedriver/chromedriver.exe");
		
		driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
	}
	
	@And("the User inputs FirstName")
	public void log1() {
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
	}
	
	@And("The User inputs LastName")
	public void log2() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
	}
	
	
}
