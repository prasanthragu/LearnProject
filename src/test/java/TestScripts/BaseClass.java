package TestScripts;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;

import ApplicationSupportLibraries.ApplicationMethod;

public class BaseClass {
	
	public static WebDriver driver;

	

       @BeforeMethod	
       public void beforeMehod() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Documents\\Learnings\\Selenium\\Selenium Maven Projects/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		driver.get("https://redbus.in");
		 //ApplicationMethod.driver=BaseClass.driver;

	}

}
