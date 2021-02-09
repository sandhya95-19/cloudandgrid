package mypack;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Cloud 
{
	public static void main(String [] args) throws Exception
	{
	    String un="sandhyaPN1";
    	String ak="c0057f90-6d18-4f56-b5f3-e77a3921f85a";
	    String uri="http://"+un+":"+ak+"@ondemand.saucelabs.com:80/wd/hub";
	    DesiredCapabilities dc=new DesiredCapabilities();
	    dc.setCapability("browserName", "chrome");
	    dc.setCapability("version", "80");
	    dc.setCapability("platform", Platform.MAC);
	    URL u=new URL(uri);
	    RemoteWebDriver driver=new RemoteWebDriver(u,dc);
	    driver.get("http://www.google.co.in");
	    driver.manage().window().maximize();
	    String x= driver.getTitle();
	    if(x.equals("Google"))
	    {
	    	System.out.println("test passed for "+x);
	    }
	    else
	    {
	    	System.out.println("test failed for "+x);
	    }
	    WebDriverWait w=new WebDriverWait(driver,20);
	    WebElement e=w.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
	    e.sendKeys("abdulkalam",Keys.ENTER);
	    String y=driver.getTitle();
	    if(y.contains("abdulkalam"))
	    {
	    	System.out.println("test passed for "+y);
	    }
	    else
	    {
	    	System.out.println("test failed for "+y);
	    }
	    driver.close();
	    }
	
}
