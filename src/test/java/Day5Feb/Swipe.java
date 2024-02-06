package Day5Feb;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.deser.Deserializers.Base;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class Swipe extends Base{
	@Test
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("platforName", "Android");
		dc.setCapability("deviceName", "Medium Phone API 32");
		dc.setCapability("appium:skipServerInstallation", "true");
		  dc.setCapability("appium:noReset", "true");
		  dc.setCapability("appium:platformVersion", "12.0");
		dc.setCapability("app", "D:\\ShubhamGaikwad\\Appium\\com.mobeta.android.demodslv_2013-01-11.apk");
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		AndroidDriver driver = new AndroidDriver(url, dc);
		
		
		public void swipeDemoTest() {
			driver.findElement(AppiumBy.accessibilityId("Views")).click();
	driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
			driver.findElement(By.xpath("//android.widget.TextView[@content-desc='1. Photos']")).click();
			
			WebElement firstImage=driver.findElement(By.xpath("(//android.widget.ImageView)[1]"));
		// Before perform the swipe	
			String firstTimeValue=firstImage.getAttribute("focusable");
			Assert.assertEquals("true", firstTimeValue);
			
		//perform swipe action
			swipeAction(firstImage, "left");
			
			
		// After perform the swipe	
			String secondTimeValue=firstImage.getAttribute("focusable");
			Assert.assertEquals("false", secondTimeValue);

	}

}

	private static void swipeAction(WebElement firstImage, String string) {
		// TODO Auto-generated method stub
		
	}

	private static void swipeDemoTest() {
		// TODO Auto-generated method stub
		
	}
}
