package in.javahome.springmvc.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes(value={"currentTime","empList","countryList"})
public class CurrentTimeController {
	@RequestMapping("/time")
	public String time(ModelMap map){
		Date now = new Date();
		map.addAttribute("currentTime", now);
		return "redirect:index.jsp";
	}
}
