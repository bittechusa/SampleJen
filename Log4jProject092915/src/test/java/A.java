import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;
import org.junit.Test;


public class A 
{
	@Test
	public void m1() throws IOException
	{
		DOMConfigurator.configure("log4j.xml");
		 
		Logger log=Logger.getLogger(A.class.getName());
		 // PropertyConfigurator.configure("log.properties");
		/*log.info("hi");
		log.fatal("hi");
		log.debug("");
		log.trace("df");*/
		
		
		
		log.fatal("Fatal Message!");
		log.error("Error Message!");
		log.warn("Warn Message!");
		log.info("Info Message!");
        log.debug("Debug Message!");
        log.trace("Trace Message!");
        
        
        
       
		 
        
	}

}
