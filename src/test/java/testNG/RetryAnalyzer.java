package testNG;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {

	int count = 0;
	int max_count = 1;

	public boolean retry(ITestResult Result) {
		if (count < max_count) {
			System.out.println("Retrying with the retry method " + Result.getName() + " (Attempt " + (count + 1) + ")");
			count++;
			return true;
		}
		return false;
	}

}
