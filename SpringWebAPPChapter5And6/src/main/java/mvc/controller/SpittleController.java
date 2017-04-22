package mvc.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import mvc.interfaces.SpittleRepository;
import mvc.models.Spitter;
import mvc.models.Spittle;

@Controller
@RequestMapping("/spittles")
public class SpittleController {
	private static final Logger logger = LoggerFactory.getLogger(SpittleController.class);
	private SpittleRepository spittleRepository;

	@Autowired
	@Qualifier("samWise")
	public void setSpittleRepository(SpittleRepository spittleRepository) {
		this.spittleRepository = spittleRepository;
	}

	public SpittleController() {
	}

	public SpittleController(SpittleRepository spittleRepository) {
		this.spittleRepository = spittleRepository;
	}

	@RequestMapping(method = RequestMethod.GET)
	public String spittles(Model model) {
		model.addAttribute(spittleRepository.findSpittles(Long.MAX_VALUE, 20));
		logger.debug("The Models:" + model.toString());
		return "spitter";
	}

	@RequestMapping(value = "see", method = RequestMethod.GET)
	public @ResponseBody List<Spittle> spittles1(Model model) {
		model.addAttribute(spittleRepository.findSpittles(Long.MAX_VALUE, 20));
		logger.debug("The Models:" + model.toString());
		return spittleRepository.findSpittles(Long.MAX_VALUE, 20);
	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String showRegistrationForm() {
		logger.debug("registerForm.jsp called");
		return "registerForm";
	}
	/*@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String processRegistration(Spitter spitter) {
		spittleRepository.save(spitter);
		return "redirect:/spittles/" + spitter.getUsername();
	}*/
	@RequestMapping(value = "/{spittleId}", method = RequestMethod.GET)
	public String spittle(@PathVariable("spittleId") int spittleId, Model model) {
		model.addAttribute(spittleRepository.findOne(spittleId));
		return "spittle";
	}
}
