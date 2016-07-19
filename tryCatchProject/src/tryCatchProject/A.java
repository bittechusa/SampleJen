package tryCatchProject;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A
{
	@Test
	public void m1()
	{
		FirefoxDriver dr=new FirefoxDriver();
		dr.get("http://www.facebook.com");
		try
		{
			dr.findElement(By.id("email")).sendKeys("ghsd");
			System.out.println(10/0);
		}catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
			System.out.println("email text box not found");
		}
		catch(NoSuchElementException e1)
		{
			
		}
		catch(Exception e3)
		{
			
		}
		finally
		{
			System.out.println("always run");
		}
		System.out.println("after try catch blok");
	}
	


}
