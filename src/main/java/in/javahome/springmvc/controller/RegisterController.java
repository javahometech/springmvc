package in.javahome.springmvc.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import in.javahome.springmvc.model.Register;
import in.javahome.springmvc.service.RegisterService;

@Controller
public class RegisterController {
	@Autowired
	private RegisterService regService;
	

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String getRegisterPage(ModelMap map) {
		map.addAttribute("reg", new Register());
		return "register";
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String register(@Valid @ModelAttribute("reg") Register reg, BindingResult result) {
		if (!result.hasErrors()) {
			System.out.println("No errors");
			regService.register(reg);
			// forward to success page
			return "register";
		} else {
			System.out.println("Has errors");
			return "register";
		}
	}
}
