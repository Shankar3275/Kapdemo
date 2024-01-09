package KapDemo;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
//To re run class if test cases failed
public class MyRetry implements IRetryAnalyzer {

    private int retryCount = 0;
    private static final int maxRetryCount =1;

    @Override
    public boolean retry(ITestResult result) {
        if (retryCount < maxRetryCount) {
            retryCount++;
            return true;
        }
        return false;
    }
}
