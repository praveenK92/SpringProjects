package mvc.config;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import mvc.interfaces.SpittleRepository;
import mvc.interfaces.impl.SpittleRepositoryImpl;
import mvc.models.Spittle;

//@Configuration
public class MainMVCConfig {
	/*Date date=new Date();
	@Bean
	public SpittleRepository getSpittleRepository(){
		SpittleRepositoryImpl s=new SpittleRepositoryImpl();
		Map<Integer,Spittle> spittleRepo=new HashMap<Integer, Spittle>();
		date.setYear(1960);
		for(int i=0;i<40;i++){
			date.setYear(date.getYear()+i);
			Spittle s1=new Spittle("I am Praveen!"+i,date,28.6139,77.2090);
			spittleRepo.put(i, s1);
		}
		s.setSpittleRepo(spittleRepo);
		s.setCount(40);
		return s;
	}*/
	
}
