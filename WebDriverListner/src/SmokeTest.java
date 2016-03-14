import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class SmokeTest 
{
	WebDriver driver=new FirefoxDriver();
	@Test
	public void m1() throws InterruptedException
	{
		//WebDriver driver=new FirefoxDriver();
		 
		EventFiringWebDriver listner=new EventFiringWebDriver(driver);
		 
		BaseListner handle=new BaseListner();
		 
		listner.register(handle);
		 
		listner.navigate().to("http://www.facebook.com");
		 Thread.sleep(3000);
		listner.findElement(By.id("email")).sendKeys("asdsadsa");
		Thread.sleep(3000);
		listner.findElement(By.id("u_0_y")).click();
		Thread.sleep(3000);
		driver.quit();
		Thread.sleep(3000);
	
		 
		System.out.println("End");
		}
	

}
