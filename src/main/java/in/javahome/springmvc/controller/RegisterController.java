package in.javahome.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import in.javahome.springmvc.model.Register;

@Controller
public class RegisterController {
	
	@RequestMapping(value="/register",method=RequestMethod.GET)
	public String getRegisterPage(ModelMap map) {
		map.addAttribute("reg", new Register());
		return "register";
	}
	
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public String register(Register reg, ModelMap map) {
		
		System.out.println(reg.getFullName());
		System.out.println(reg.getMail());
		System.out.println(reg.getPassword());
		System.out.println(reg.getAddr().getPin());
		System.out.println(reg.getAddr().getCity());
		
		map.addAttribute("reg", reg);
		return "register";
	}
}
