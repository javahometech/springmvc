package in.javahome.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CalculatorController {
	@RequestMapping("/add")
	@ResponseBody
	public String addNumbers(@RequestParam("one") Integer i, 
			                       @RequestParam(value="two", required=false) Integer j) {
		int result = i + j;
		String resp = "Addition of " + i + " and " + j + " is " + result;
		return resp;
	}
	
	@RequestMapping("/multiply/{one}/{two}")
	@ResponseBody
	public String multiplication(@PathVariable("one") int i, 
			                                   @PathVariable("two") int j) {
		int result = i * j;
		String resp = "Multiplication of " + i + " and " + j + " is " + result;
		return resp;
	}
	
}
