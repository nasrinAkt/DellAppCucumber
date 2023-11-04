package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepClass {
	WebDriver driver;
	
	@Given("^Open dell application$")
	public void open_dell_application() throws Throwable {
	  System.setProperty("Webdriver.chrome.driver", "C:\\chrome driver\\chrome-win64\\chrome.exe");
		ChromeOptions run = new ChromeOptions();
		run.addArguments("--remote-allow-origins=*");
		
		driver = new ChromeDriver();
		driver.get("https://www.dell.com/en-us");
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		
	}

	@Then("^mouse hover on signin$")
	public void mouse_hover_on_signin() throws Throwable {
	   Actions ac = new Actions(driver);
	   ac.moveToElement(driver.findElement(By.id("um-si-label"))).build().perform();
	   Thread.sleep(2000);
	}

	@Then("^click create an account$")
	public void click_create_an_account() throws Throwable {
		WebElement ele = driver.findElement(By.xpath("//a[text()=' Create an Account ']"));
		ele.click();
		Thread.sleep(1000);
	    
	}

	@Then("^enter first name$")
	public void enter_first_name() throws Throwable {
	 WebElement first = driver.findElement(By.id("FirstName"));
	 first.sendKeys("nasrinn");
	 
		Thread.sleep(2000);
		
	first.sendKeys(Keys.BACK_SPACE);
	first.sendKeys(Keys.CONTROL+"a");
	first.sendKeys(Keys.CONTROL+"c");
	Thread.sleep(2000);
		
	}

	@Then("^enter last name$")
	public void enter_last_name() throws Throwable {
		
	 WebElement last  = driver.findElement(By.id("LastName"));
	 last.sendKeys(Keys.CONTROL+"v");
	 Thread.sleep(2000);
	 driver.close();
	 
	}


}
