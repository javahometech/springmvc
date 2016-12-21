package in.javahome.springmvc.tags;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class AddTag extends SimpleTagSupport {
	private int one;
	private int two;
	public void setOne(int one) {
		this.one = one;
	}
	public void setTwo(int two) {
		this.two = two;
	}
	
	@Override
	public void doTag() throws JspException, IOException {
		int result = one+two;
		getJspContext().getOut().write("Addition of "+one+" and "+two+"Result is "+result);;
	}
	
}
