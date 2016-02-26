

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class tryCatch 
{
	FirefoxDriver dr=new FirefoxDriver();
	@Test
	public void m1()
	{
		try
	{
			dr.get("http://www.facebook.com");
			List<WebElement> elements=dr.findElements(By.tagName("a"));
			for(WebElement moga:elements)
			{
				System.out.println(moga.getText());
			}
//			System.out.println(10/0);
//			dr.findElement(By.id("shahid")).click();
			}
		catch(NoSuchElementException e)
		{
			System.out.println("element not present");
		}catch(ArithmeticException e1)
		{
			System.out.println("is not possible to divided by 0");
		}
		finally
		{
			System.out.println("always run");
		}
	}


}
