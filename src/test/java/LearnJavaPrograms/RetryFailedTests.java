package LearnJavaPrograms;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailedTests implements IRetryAnalyzer{

	int maxRetry=0;
	
	public boolean retry(ITestResult result) {
		
	if(!result.isSuccess() && maxRetry<2) {
		maxRetry++;
		return true;
	}
		return false;
	}

}
