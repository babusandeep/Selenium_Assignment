package assignment;

import org.testng.ITestResult;

public class utilities {
	private int retryCount=0;
	private static final int maxRetryCount=3;
	
	  public boolean retry(ITestResult result) {
	        if (retryCount < maxRetryCount) {
	          retryCount++;
	          return true;
	        }
	        return false;


}
	  
}


