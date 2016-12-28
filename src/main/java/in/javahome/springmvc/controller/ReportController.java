package in.javahome.springmvc.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.View;

import in.javahome.springmvc.view.ExcelReportView;

@Controller
public class ReportController {
	@RequestMapping(value = "/excel", method = RequestMethod.GET)
	public View generateExcelReport(Map<String,List<String>> map) {
		// call to service get data from DB
		// pass this data to the excel view
		List<String> names = new ArrayList<String>();
		for (int i = 1; i <= 10; i++) {
			names.add("Name-"+i);
		}
		map.put("namesList", names);
		return new ExcelReportView();
	}
}
