package mybatis.spring.dummy.context;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class ApplicationBeanHelper implements ApplicationContextAware{
	
	private ApplicationContext context;
	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		this.context=arg0;
	}
	
	public Object getBean(String name) throws BeansException{
		return this.context.getBean(name);
	}

}
