import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;



public class A 
{
	@Test
	public void m1() throws FindFailed
	{
		WebDriver dr=new FirefoxDriver();
		dr.get("http://www.facebook.com");
		Pattern p=new Pattern("\\Users\\shahidulislam\\Desktop\\shot1.png");
		Screen s=new Screen();
		s.doubleClick("\\Users\\shahidulislam\\Desktop\\shot1");
	}

}
