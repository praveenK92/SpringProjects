package a.b.c;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;

import a.b.c.model.Husband;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	@Autowired
	Husband h;
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public @ResponseBody String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		String formattedDate = dateFormat.format(date);
		model.addAttribute("serverTime", formattedDate );
		//Husband h=new Husband();
		Gson gs=new Gson();
		String json=gs.toJson(h, Husband.class);
		if(h==null)
			logger.debug("Husband is null");
		return json;
	}
	
	@RequestMapping(value = "/pikachu/{x:[a-zA-Z0-9]+\\.[a-zA-Z0-9]+}",
			method = RequestMethod.GET)
	public @ResponseBody String home12(@PathVariable String x) {
		return x;
	}
	
}
