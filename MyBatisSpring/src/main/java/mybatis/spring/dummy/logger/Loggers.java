package mybatis.spring.dummy.logger;

import java.util.List;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import mybatis.spring.dummy.models.A;

@Aspect
public class Loggers {
	private static final Logger logger = LoggerFactory.getLogger("DEBUG");
	
	@Pointcut("execution(* mybatis.spring.dummy.dao.DbDao.getA(..))")
	public void DbGetA(){}
	@Pointcut("execution(* mybatis.spring.dummy.controller.HomeController.getAll(..))")
	public void getAlll(){}
	
	@Around("DbGetA()")
	public List<A> Db(ProceedingJoinPoint jp){
		try {
			logger.debug("Starting the DbDao call");
			List<A> aa=(List)jp.proceed();
			if(aa!=null)logger.debug(""+aa.toString());
			else logger.debug("No Data Found");
			return aa;
		} catch (Throwable e) {
			e.printStackTrace();
			return null;
		}
	}
	@Around("getAlll()")
	public String ControllerGetA(ProceedingJoinPoint jp){
		try {
			logger.debug("Starting the API Call");
			String json=(String)jp.proceed();
			if(json!=null)logger.debug(json);
			else logger.debug("data is null");
			return json;
		} catch (Throwable e) {
			e.printStackTrace();
			return "Nothing";
		} 
	}
}