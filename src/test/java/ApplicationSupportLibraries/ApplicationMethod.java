package ApplicationSupportLibraries;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import TestScripts.BaseClass;

public abstract class ApplicationMethod {
	
	public static WebDriver driver=BaseClass.driver;
	public static WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
	
	public static boolean selectFromPlace(String city, String stop) {
		boolean returnValue = false;
		WebElement from = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='src']")));
		from.sendKeys(city);
		List<WebElement> autoSuggestionFromValues=wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//ul/li/div/text[@class='placeHolderMainText']")));
		int i=0;
		while(true) {
			String fromPlace=autoSuggestionFromValues.get(i).getText();
			if(fromPlace.equalsIgnoreCase(stop)) {
				autoSuggestionFromValues.get(i).click();
				returnValue = true;
				break;
			}
			i++;
		}
		return returnValue;
		}
	
	public static boolean selectDestinationPlace(String city, String stop) {
		boolean returnValue = false;
		WebElement to = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='dest']")));
		to.sendKeys(city);
		List<WebElement> autoSuggestionToValues=wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//ul/li/div/text[@class='placeHolderMainText']")));
		int i=0;
		while(true) {
			String fromPlace=autoSuggestionToValues.get(i).getText();
			if(fromPlace.equalsIgnoreCase(stop)) {
				autoSuggestionToValues.get(i).click();
				returnValue = true;
				break;
			}
			i++;
		}
		return returnValue;
	}
   public static boolean selectTravelDate(String month, String travelDate) {
	  boolean returnValue = false;
	while(true) {
		WebElement selectMonthYear=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'DayNavigator__CalendarHeader')]/div[2]")));
		String monthYear = selectMonthYear.getText();
		System.out.println("MonthYear :"+monthYear);
		if(monthYear.contains(month)) {
			//System.out.println("True");
			List<WebElement> findHolidaysDate=wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[contains(@class,'DatePicker__MainBlock')]/div[3]//div//div/span")));
			System.out.println("List of Holiday dates:");
			for (int j=0;j<findHolidaysDate.size();j++) {
				String cssValue = findHolidaysDate.get(j).getCssValue("color");
				String colorValue=Color.fromString(cssValue).asHex();
				//System.out.println(colorValue);
				if(colorValue.equalsIgnoreCase("#D84E55")) {
					System.out.println(findHolidaysDate.get(j).getText());
				}
			}
			WebElement selectDate=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'DatePicker__MainBlock')]/div[3]//div//div/span[text()='"+travelDate+"']")));
			selectDate.click();
			//div[contains(@class,'DatePicker__MainBlock')]/div[3]//div//div/span[text()='13']
			returnValue=true;
			break;	
		}
		else {
		    WebElement monthSelector =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'DayNavigator__CalendarHeader')]/div[3]")));
		    monthSelector.click();
		}
	}
	return returnValue;
}
   
}
