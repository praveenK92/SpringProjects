package Config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class KnightAspect {
	
	@Pointcut("execution(* Models.Impl.BraveKnight.embarkOnQuest(String))"+"&& args(ss)")
	public void performance(String ss) {}
	
	@Before("performance(ss)")
	public void silenceCellPhones(String ss) {
		System.out.println("Silencing cell phones");
	}
	@Before("performance(ss)")
	public void takeSeats(String ss) {
		System.out.println("Taking seats");
	}
	@AfterReturning("performance(ss)")
	public void applause(String ss) {
		System.out.println("CLAP CLAP CLAP!!!");
	}
	@AfterThrowing("performance(ss)")
	public void demandRefund(String ss) {
		System.out.println("Demanding a refund");
	}
	@Around("performance(ss)")
	public Object watchPerformance(ProceedingJoinPoint jp,String ss) {
		try {
			System.out.println(ss+": Silencing cell phones");
			System.out.println(ss+": Taking seats");
			jp.proceed();
			System.out.println(ss+": CLAP CLAP CLAP!!!");
			return "Something";
		}catch (Throwable e) {
			System.out.println(ss+": Demanding a refund");
			return "null Baby!";
		}
	}
}
