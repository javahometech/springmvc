package in.javahome.springmvc.controller;

import java.sql.SQLException;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MyAppExceptionHandler {
	
	@ExceptionHandler(value=RuntimeException.class)
	public String handelException(Exception e){
		//log4j and log error into the log file
		return "runtimeError";
	}
	
	@ExceptionHandler(value=SQLException.class)
	public String handelSQLException(Exception e){
		//log4j and log error int the log file
		return "sqlError";
	}
}
