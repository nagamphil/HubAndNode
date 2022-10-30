import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SmartBearTestNg {
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
	driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fProcess.aspx");
	 System.out.println(driver.getTitle());
    WebElement username= driver.findElement(By.xpath("//*[@id='ctl00_MainContent_username']"));
    username.sendKeys("Tester");
    WebElement password = driver.findElement(By.xpath("//*[@id='ctl00_MainContent_password']"));
    password.sendKeys("test");
    WebElement login = driver.findElement(By.xpath("//*[@id='ctl00_MainContent_login_button']"));
    login.click();
}
}
