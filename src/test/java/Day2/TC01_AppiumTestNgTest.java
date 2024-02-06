package Day2;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class TC01_AppiumTestNgTest {
	
	
	


	URL url =new URL("http://127.0.0.1:4723/wd/hub");
	
	AndroidDriver driver = new AndroidDriver(url, dc);
}
