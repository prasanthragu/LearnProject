package LearnJavaPrograms;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class LearnDependsOnGroups {
	
	@Test(groups="smoke")
	public void createLead() {
		System.out.println("Create Lead");
		throw new NoSuchElementException();
	}
	
	@Test(groups="functional")
	public void login() {
		System.out.println("Login");
		throw new NoSuchElementException();
	}
	
	@Test(groups="regression")
	public void editLead() {
		System.out.println("Edit Lead");
	}
	
	@Test(groups="functional")
	public void deleteLead() {
		System.out.println("Delete Lead");
	}
	
	@Test(groups="regression")
	public void duplicateLead() {
		System.out.println("Duplicate Lead");
	}
	
	@Test(groups="smoke")
	public void mergeLead() {
		System.out.println("Merge Lead");
	}

}
