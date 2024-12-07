package Step;

import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class TC02_CreateLead extends BaseClass{
	
	@When("Click on {string} Link")
	public void clickOnLinkText(String linkText) {
		driver.findElement(By.linkText(linkText)).click();
	}
	
	@Then("My Home page should be displayed")
	public void verifyMyHomePageDisplayed() {
		String title = driver.getTitle();
		if (title.contains("My Home")) {
			System.out.println("My Home page is displayed");
		}
		else {
			System.out.println("My Home page is not displayed");
		}
	}
	
	@Then("MyLeads page should be displayed")
	public void verifyMyLeadsPageDisplayed() {
		String title = driver.getTitle();
		if (title.contains("My Leads")) {
			System.out.println("My Leads page is displayed");
		}
		else {
			System.out.println("My Leads page is not displayed");
		}
	}
	
	@Then("Create Lead page should be displayed")
	public void verifyCreateLeadPageDisplayed() {
		String title = driver.getTitle();
		if (title.contains("Create Lead")) {
			System.out.println("Create Lead page is displayed");
		}
		else {
			System.out.println("Create Lead page is not displayed");
		}
	}
	
	@Given("Enter the Company Name as {string}")
	public void enterCompanyName(String companyName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
		
	}
	
	@Given("Enter the FirstName as {string}")
	public void enterFirstName(String firstName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
		
	}
	@Given("Enter the LastName as {string}")
	public void enterLastName(String lastName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
		
	}
	
	@When ("Click on Create Lead button")
	public void clickButton() {
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
	}
	
	@Then("New Lead should be created")
	public void verifyNewLeadCreated() {
		System.out.println("New Lead is Created");
	}
}
