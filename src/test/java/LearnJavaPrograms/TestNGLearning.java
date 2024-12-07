package LearnJavaPrograms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class TestNGLearning {
//    @BeforeMethod(alwaysRun = true)
//    public void setUp() {
//        System.out.println("This always runs before each test method.");
//    }
//
//    @Test
//    public void testMethod1() {
//        System.out.println("This is testMethod1.");
//        // Simulating a failure
//        throw new RuntimeException("Simulated failure");
//    }
//
//    @Test
//    public void testMethod2() {
//        System.out.println("This is testMethod2.");
//    }
//
//    @AfterMethod(alwaysRun = true)
//    public void tearDown() {
//        System.out.println("This always runs after each test method.");
//    }
	
	@SuppressWarnings("deprecation")
	@Test(invocationCount = 5, invocationTimeOut = 1000)
	public void testMethod() throws InterruptedException { 
		// Simulating a delay 
		//Thread.sleep(500);
		System.out.println("Test method execution count: " + Thread.currentThread().threadId());
		}
	}
