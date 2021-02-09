package mypack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 
{

	@Test
	public void method1() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in");
		Thread.sleep(5000);
		String x=driver.getTitle();
		if(x.equals("Google"))
		{
			System.out.println("test passed for "+x);
		}
		else
		{
			System.out.println("test passed for "+x);
		}
		WebDriverWait w=new WebDriverWait(driver,20);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.name("q"))).sendKeys("kalam",Keys.ENTER);
		String y=driver.getTitle();
		if(y.equalsIgnoreCase("Kalam"))
		{
			System.out.println("test passed for "+y);
		}
		else
		{
			System.out.println("test passed for "+y);
		}
	    //close site
	    driver.close();
	}
		
		

	

}
