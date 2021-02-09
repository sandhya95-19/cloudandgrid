package mypack;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Test2 
{
	public static void main(String [] args) throws Exception
	{
		URL u1=new URL("http://localhost:5556/wd/hub");
		DesiredCapabilities dc1=new DesiredCapabilities();
		dc1.setCapability("browserName", "chrome");
		RemoteWebDriver driver1=new RemoteWebDriver(u1,dc1);
		driver1.get("http://www.google.co.in");
		driver1.close();
		
		URL u2=new URL("http://localhost:5557/wd/hub");
		DesiredCapabilities dc2=new DesiredCapabilities();
		dc2.setBrowserName("firefox");
		RemoteWebDriver driver2=new RemoteWebDriver(u2,dc2);
		driver2.get("http://www.google.co.in");
		driver2.close();
	
		
		
	}

}
