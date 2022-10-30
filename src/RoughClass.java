import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class RoughClass {
@Test
public void doLogin() throws MalformedURLException

{
	DesiredCapabilities data =new DesiredCapabilities();
	data.setBrowserName("chrome");
	//data.setVersion("107.0");
	data.setPlatform(Platform.WINDOWS);
	//System.setProperty("webdriver.chrome.driver","D:\\workspace\\naga\\git\\AutomationPackUsingDataDrivenApproach\\Driver\\chromedriver_105.exe");
	URL urldata = new URL("http://localhost:4444/wd/hub");
	WebDriver driver =new RemoteWebDriver(urldata,data );
	driver.get("http://www.google.com");
	 System.out.println(driver.getTitle());
    
}
}
