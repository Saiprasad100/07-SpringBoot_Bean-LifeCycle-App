package in.sai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
	UserDao dao =context.getBean(UserDao.class);
	dao.getData();
	
	ConfigurableApplicationContext cContext =
			    (ConfigurableApplicationContext)context;
	
	cContext.close();
	
	}
}
 