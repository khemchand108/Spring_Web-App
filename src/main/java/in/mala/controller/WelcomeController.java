package in.mala.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	@GetMapping("/welcome")
 public ModelAndView getWelcome() {
	 ModelAndView mav = new ModelAndView();
	 mav.addObject("msg","Welcome to ashokit");
	 mav.setViewName("index");
	 return mav;
 }
}
