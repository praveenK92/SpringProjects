package mvc.config;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import mvc.controller.HomeController;
import mvc.interfaces.SpittleRepository;
import mvc.interfaces.impl.SpittleRepositoryImpl;
import mvc.models.Spittle;

@Configuration
@EnableWebMvc
@ComponentScan(basePackageClasses={HomeController.class,SpittleRepository.class})
public class WebConfig extends WebMvcConfigurerAdapter {
	private static final Logger logger = LoggerFactory.getLogger(WebConfig.class);
	private Date date=new Date();
	@Bean
	public ViewResolver viewResolver() {
	//public InternalResourceViewResolver configureInternalResourceViewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		logger.debug(""+resolver.toString());
		resolver.setPrefix("WEB-INF/views/");
		resolver.setSuffix(".jsp");
		resolver.setExposeContextBeansAsAttributes(true);
		logger.debug(""+resolver.toString());
		resolver.setViewClass(JstlView.class);
		return resolver;
	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}
}