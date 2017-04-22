package Config;

import org.aspectj.lang.ProceedingJoinPoint;

public class KnightAspectForXML {
	//@Before("performance(ss)")
	public void silenceCellPhones(String ss) {
		System.out.println("Silencing cell phones");
	}
	//@Before("performance(ss)")
	public void takeSeats(String ss) {
		System.out.println("Taking seats");
	}
	//@AfterReturning("performance(ss)")
	public void applause(String ss) {
		System.out.println("CLAP CLAP CLAP!!!");
	}
	//@AfterThrowing("performance(ss)")
	public void demandRefund(String ss) {
		System.out.println("Demanding a refund");
	}
	//@Around("performance(ss)")
	public void watchPerformance(ProceedingJoinPoint jp,String ss) {
		try {
			System.out.println(ss+": Silencing cell phones");
			System.out.println(ss+": Taking seats");
			jp.proceed();
			System.out.println(ss+": CLAP CLAP CLAP!!!");
		}catch (Throwable e) {
			System.out.println(ss+": Demanding a refund");
		}
	}
}
