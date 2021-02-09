package mypack;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test3 
{
	@Test
	@Parameters({"url","bn","url1"})
	public void method1(String x,String y,String z) throws Exception
	{
		URL u=new URL(x);
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setBrowserName(y);
		RemoteWebDriver driver=new RemoteWebDriver(u,dc);
		driver.get(z);
		driver.close();
	}

}
