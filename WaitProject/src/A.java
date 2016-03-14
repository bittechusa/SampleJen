import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.function.Predicate;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class A
{
	@Test
	public void waitforElement()
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
		FluentWait<WebDriver> f=new FluentWait<WebDriver>(driver);
		f.withTimeout(40, TimeUnit.SECONDS);
		f.pollingEvery(5, TimeUnit.SECONDS);
		f.ignoring(NoSuchElementException.class);
		Function<WebDriver,WebElement> fun=new Function<WebDriver,WebElement>(){

			public WebElement apply(WebDriver t) {
				return t.findElement(By.id("u_0_y"));
			}
			
			
		};
		fun.apply(driver);
		
		System.out.println("wait");
		driver.quit();
	}
	
	@Test
	public void waitforElementByElement()
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
		FluentWait<WebDriver> f=new FluentWait<WebDriver>(driver);
		f.withTimeout(40, TimeUnit.SECONDS);
		f.pollingEvery(5, TimeUnit.SECONDS);
		f.ignoring(NoSuchElementException.class);
		Function<WebElement,Boolean> fun=new Function<WebElement,Boolean>(){

			@Override
			public Boolean apply(WebElement t) {
				if(t.isDisplayed())
				{
					System.out.println(t +" element present");
					return true;
				}else
					System.out.println(t +" element not present");
				return false;
			}


		};
		fun.apply(driver.findElement(By.id("u_0_y")));
	
		System.out.println("wait");
		driver.quit();
	}
	
	@Test
	public void waitforElementByPrediction()
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
		FluentWait<WebDriver> f=new FluentWait<WebDriver>(driver);
		f.withTimeout(40, TimeUnit.SECONDS);
		f.pollingEvery(5, TimeUnit.SECONDS);
		f.ignoring(NoSuchElementException.class);
		Predicate<WebDriver> fun=new Predicate<WebDriver>(){

		
			@Override
			public boolean test(WebDriver t) {
				if(t.findElement(By.xpath("")).isDisplayed())
				{
					System.out.println("true");
					return true;
				}else
					System.out.println("false");
				return false;
			}

		
		};
		
		
		
		Predicate<WebElement> fun1=new Predicate<WebElement>(){

			@Override
			public boolean test(WebElement t) {
				if(t.isEnabled())
				{
					return true;
				}else
					
				return false;
			}
			
		};
	
	
		System.out.println("wait");
		driver.quit();
	}
	
	@Test
	public void expectedConditionTest()
	{
		expectedCondition(By.id("u_0_y"));
	}
		
		public void expectedCondition(By by)
		{

		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(by)).click();
		
		}
		@Test
		public void functionsWait()
		{

			FirefoxDriver driver=new FirefoxDriver();
			driver.get("http://www.facebook.com");
			WebDriverWait wait=new WebDriverWait(driver,30);
			wait.pollingEvery(30, TimeUnit.SECONDS);
			wait.pollingEvery(5, TimeUnit.SECONDS);
			Function<WebElement,Boolean> fun=new Function<WebElement,Boolean>(){

				@Override
				public Boolean apply(WebElement t) {
					if(wait.until(ExpectedConditions.textToBePresentInElement(t, "asad")))
					{
						System.out.println("ok");
					}else
						System.out.println("not");
					return null;
				}

				
			
			
			};
			fun.apply(driver.findElement(By.id("email")));
			System.out.println("wait");
			
			
			
			//wait.until(ExpectedConditions.elementToBeClickable(by)).click();
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


