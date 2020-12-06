package com.sedesoft.payroll.web;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyErrorController implements ErrorController {

	@RequestMapping("/myerror")
	public String handleError(HttpServletRequest request) {
		Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
		//System.out.println(">>>> STATUS "+status);
		if (status != null) {
			Integer statusCode = Integer.valueOf(status.toString());

			if (statusCode == HttpStatus.NOT_FOUND.value()) 
				return "/error/error-404";
			else if(statusCode == HttpStatus.INTERNAL_SERVER_ERROR.value()) 
				return "/error/error-500";
			else if (statusCode == HttpStatus.FORBIDDEN.value()) 
				return "/error/error-403";
			
		}
			return "error";
	}

	@Override
	public String getErrorPath() {
		// TODO Auto-generated method stub
		return null;
	}

}
