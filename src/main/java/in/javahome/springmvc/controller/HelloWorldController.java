package in.javahome.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {
	@RequestMapping(value="/welcome", method=RequestMethod.GET)
	@ResponseBody
	public String hello(){
		return "welcome to spring mvc";
	}
}
