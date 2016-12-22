package in.javahome.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import in.javahome.springmvc.model.Register;
import in.javahome.springmvc.service.RegisterService;

@Controller
public class RegisterController {
	@Autowired
	private RegisterService regService;
	@RequestMapping(value="/register",method=RequestMethod.GET)
	public String getRegisterPage(ModelMap map) {
		map.addAttribute("reg", new Register());
		return "register";
	}
	
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public String register(Register reg, ModelMap map) {
		try {
			regService.register(reg);
		} catch (Exception e) {
			map.addAttribute("error", e.getMessage());
		}
		map.addAttribute("reg", reg);
		return "register";
	}
}
