package TestScripts;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import ApplicationSupportLibraries.ApplicationMethod;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnClass extends BaseClass{
	@Test
	public void main() {
		boolean expected;
		
		expected=ApplicationMethod.selectFromPlace("Chennai", "Perungalathur");
		System.out.println(expected);
		expected=ApplicationMethod.selectDestinationPlace("karur", "Ajantha Theatre");
		System.out.println(expected);
		expected=ApplicationMethod.selectTravelDate("Aug 2024", "15");
		System.out.println(expected);
		

	driver.close();
	}
	
}
