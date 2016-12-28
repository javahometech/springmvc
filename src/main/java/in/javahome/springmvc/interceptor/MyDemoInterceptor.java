package in.javahome.springmvc.interceptor;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class MyDemoInterceptor implements HandlerInterceptor {

	public void afterCompletion(HttpServletRequest request, 
			HttpServletResponse response, Object obj, Exception ex)
			throws Exception {
		System.out.println("afterCompletion"+obj.getClass());
	}

	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, 
			Object obj, ModelAndView mv)
			throws Exception {
		mv.addObject("now", new Date());
		System.out.println("postHandle"+obj.getClass());
	}

	public boolean preHandle(HttpServletRequest request, 
			HttpServletResponse response, Object obj) throws Exception {
		System.out.println("preHandle "+obj.getClass());
		return true;
	}

}
