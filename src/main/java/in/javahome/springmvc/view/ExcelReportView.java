package in.javahome.springmvc.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.servlet.view.document.AbstractXlsView;

public class ExcelReportView extends AbstractXlsView {

	@Override
	protected void buildExcelDocument(Map<String, Object> map, Workbook book, 
			HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		List<String> name = (List<String>) map.get("namesList");
		Sheet sheet = book.createSheet("Students");
		sheet.createRow(0).createCell(0).setCellValue("Student Names");
		for (int i = 0; i < name.size(); i++) {
			sheet.createRow(i+1).createCell(0).setCellValue(name.get(i));
		}
	}
}
