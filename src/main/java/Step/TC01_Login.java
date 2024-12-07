package Step;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TC01_Login extends BaseClass{
	
	
//	@Given("Launch the Browser")
//	public void launchBroswer() {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Documents\\Learnings\\Selenium\\Selenium Maven Projects/chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
//		
//	}
//	
//	@Given("Open the application URL")
//	public void loadURL() {
//		driver.get("http://leaftaps.com/opentaps/control/main");
//	}
	
	@Given("Enter the Username as {string}")
	public void enterUserName(String userName) {
		driver.findElement(By.id("username")).sendKeys(userName);
	}
	
	@Given("Enter the Password as {string}")
	public void enterPassword(String passWord) {
		driver.findElement(By.id("password")).sendKeys(passWord);
	}
	
	@When("Click on Login button")
	public void clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	
	@Then("Homepage should be displayed")
	public void verifyHomePageDisplayed() {
		boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		if(displayed) {
			System.out.println("Homepage is displayed");
		}
		else {
			System.out.println("Homepage is not displayed");
		}
	}
	
	@But("Incorrect Username or Password error messgae should be displayed")
	public void errorMessgaeforInvalidUsernamePassword() {
		boolean displayed = driver.findElement(By.xpath("//div[@id='errorDiv']")).isDisplayed();
		if(displayed) {
			System.out.println("Error message is displayed");
		}
		else {
			System.out.println("Error Message is not displayed");
		}
	}

}
