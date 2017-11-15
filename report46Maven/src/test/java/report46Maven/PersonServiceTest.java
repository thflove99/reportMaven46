package report46Maven;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.report.service.impl.IPersonService;

public class PersonServiceTest {
	
	private ApplicationContext ctx = null;
    @Before  
    public void before() {  
    	ctx = new ClassPathXmlApplicationContext("applicationContext.xml");  
    }  
      
    @Test  
    public void testSpring() {  
        IPersonService personService = (IPersonService) ctx.getBean("personService");  
        personService.processSave();  
    }  
}
