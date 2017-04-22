package mybatis.spring.dummy.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import mybatis.spring.dummy.dao.DbDa;
import mybatis.spring.dummy.dao.RedisDao;
import mybatis.spring.dummy.models.A;

/**
 * Handles requests for the application home page.
 */
@RestController
public class HomeController {
	
	//private static final Logger logger = LoggerFactory.getLogger("DEBUG");
	@Autowired
	private DbDa db;
	@Autowired
	private RedisDao redis;
	@Autowired
	Gson gs;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		model.addAttribute("serverTime", formattedDate );
		return "home";
	}
	@RequestMapping(value="/a",method=RequestMethod.GET)
	public ResponseEntity<?> getAll(){
		String key="a";
		String json=redis.getData(key);
		json=null;
		if(json!=null){
			//List<A> aa=gs.fromJson(json, ArrayList<A>.class);
			return new ResponseEntity<>(json,HttpStatus.OK);
		}
		
		List<A> aa=db.getA();
		if(aa!=null)redis.setData("a", gs.toJson(aa));
		//logger.debug("HomeController:: 63:: Value of aa: "+aa.toString());
		return new ResponseEntity<>(gs.toJson(aa),HttpStatus.OK);
	}
}
