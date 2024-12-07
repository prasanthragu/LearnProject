package Step;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksImplementation extends BaseClass{
	@Before
	public void preCondition() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Documents\\Learnings\\Selenium\\Selenium Maven Projects/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		driver.get("http://leaftaps.com/opentaps/control/main");
	}
	
	@After
	public void postCondition() {
		driver.close();
		
	}

}
