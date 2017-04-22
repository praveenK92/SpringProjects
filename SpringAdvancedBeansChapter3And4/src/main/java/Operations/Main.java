package Operations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Config.Config1;
import Config.KnightConfig;
import Models.Knight;
import Models.Impl.EatBoss;
import Models.Impl.Song;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ac=new AnnotationConfigApplicationContext(Config1.class);
		EatBoss e1=(EatBoss)ac.getBean(EatBoss.class);
		e1.eat();
		Song s=(Song)ac.getBean("Song");
		System.out.println(s);
		
		ApplicationContext ac2=new AnnotationConfigApplicationContext(KnightConfig.class);
		//BraveKnight b1=(BraveKnight)ac2.getBean("getKnight",BraveKnight.class);
		Knight b1=ac2.getBean("getKnight",Knight.class);
		b1.embarkOnQuest("Natsu Dragoneel");
		
		/*ApplicationContext ac3=new ClassPathXmlApplicationContext("KnightBean.xml");
		Knight b2=ac3.getBean("Brave",Knight.class);
		b2.embarkOnQuest("Sting Brothers");*/
	}
	
}
