package co.grandcircus.mileage;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

public class MileageController {
	
	@RequestMapping("/")
	public ModelAndView showForm() {
		ModelAndView mav = new ModelAndView("mileage-form");
		return mav;
	}

}
