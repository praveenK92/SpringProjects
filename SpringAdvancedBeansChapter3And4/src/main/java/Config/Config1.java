package Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import Models.Dessert;
import Models.Impl.Song;

@Configuration
@ComponentScan(basePackageClasses=Dessert.class)
@PropertySource("classpath:app.properties")
public class Config1 {
	@Autowired
	private Environment env;
	@Bean
	public Song getSong(){
		Song t=new Song();
		//t=env.getProperty("x", Song.class,t);
		//Class<Song> tt=env.getPropertyAsClass("x.class", Song.class);
		
		System.out.println(env.getProperty("a.b",Integer.class,45));
		
		if(env.containsProperty("x.author"))t.setAuthor(env.getRequiredProperty("x.author"));
		if(env.containsProperty("x.title"))t.setTitle(env.getProperty("x.title"));
		
		return t;
	}/*
	@Bean
	public static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}*/
}
