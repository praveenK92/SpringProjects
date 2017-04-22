package Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import Models.Knight;
import Models.Quest;
import Models.Impl.BraveKnight;
import Models.Impl.SlayDragon;

@Configuration
@EnableAspectJAutoProxy
public class KnightConfig {
	@Bean
	public Knight getKnight(){
		return new BraveKnight(getQuest());
	}
	@Bean
	public Quest getQuest() {
		return new SlayDragon();
	}
	@Bean
	public KnightAspect getKnightAspect(){
		return new KnightAspect();
	}
	@Bean
	public KnightIntro getKnightIntro(){
		return new KnightIntro();
	}
}
