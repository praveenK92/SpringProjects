package Operations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Configuration.BeanConfig;
import Configuration.Config1;
import Configuration.Config2;
import Configuration.Config3;
import Interfaces.Knight;
import Interfaces.Impl.BraveKnight;
import Interfaces.Impl.CDPlayer;
import Interfaces.Impl.CompactDisc;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("DI_Beans.xml");
		BraveKnight b1=(BraveKnight)ac.getBean(Knight.class);
		b1.embarkOnQuest("XML Guy");
		
		ApplicationContext ac2=new AnnotationConfigApplicationContext(BeanConfig.class);
		BraveKnight b2=(BraveKnight)ac2.getBean("kns");
		b2.embarkOnQuest("Annotation Guy");
		b2.k++;
		
		ApplicationContext ac3=new AnnotationConfigApplicationContext(Config1.class);
		BraveKnight b3=(BraveKnight)ac3.getBean("sasuke");
		b3.embarkOnQuest("Autowire Guy");
		System.out.println(b3.k);
		
		ApplicationContext ac4=new AnnotationConfigApplicationContext(Config2.class);
		BraveKnight b4=(BraveKnight)ac4.getBean(Knight.class);
		b4.embarkOnQuest("JavaConfig Guy");
		
		CDPlayer c1=(CDPlayer)ac.getBean(CDPlayer.class);
		CompactDisc cd1=(CompactDisc)ac.getBean(CompactDisc.class);
		cd1.setSong("PikaPika");
		System.out.println("1. "+c1);
		c1.setC(cd1);
		CDPlayer c2=(CDPlayer)ac2.getBean(CDPlayer.class);
		System.out.println("2. "+c2);
		
		ac4=new AnnotationConfigApplicationContext(Config3.class);
		CDPlayer c3=(CDPlayer)ac4.getBean(CDPlayer.class);
		System.out.println("3. "+c3);
	}

}
