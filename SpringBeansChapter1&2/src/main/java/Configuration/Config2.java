package Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import Interfaces.Knight;
import Interfaces.Quest;
import Interfaces.Impl.BraveKnight;
import Interfaces.Impl.SlayDragon;

@Configuration
public class Config2 {
	@Bean
	public Knight getKnight(Quest q){
		return new BraveKnight(q);
	}
	@Bean
	public Quest getQuest(){
		return new SlayDragon();
	}
}
