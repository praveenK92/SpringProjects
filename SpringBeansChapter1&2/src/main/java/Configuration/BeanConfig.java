package Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import Interfaces.Knight;
import Interfaces.Quest;
import Interfaces.Impl.BraveKnight;
import Interfaces.Impl.SlayDragon;

@Configuration
@ImportResource("classpath:DI_Beans.xml")
public class BeanConfig {
	@Bean(name="kns")
	public Knight getKnight(){
		return new BraveKnight(getQuest());
	}
	@Bean
	public Quest getQuest() {
		return new SlayDragon(System.out);
	}

}
