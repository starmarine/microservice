package com.zrkj.admin.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zrkj.admin.api.dto.RestResult;
import com.zrkj.admin.api.error.ErrorCode;
import com.zrkj.admin.api.exception.ApplicationException;
import com.zrkj.admin.api.utils.Pair;

@ResponseBody
@ControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(value = Exception.class)
	public Object throwApplicationException(Exception exception) throws Exception {
		RestResult restResult = null;
		if (exception instanceof ApplicationException) {
			ApplicationException e = (ApplicationException) exception;
			restResult = RestResult.getInstance(e.getCode(), e.getMessage());
		}else if(exception instanceof BindException){
			BindException ex = (BindException)exception;
			List<ObjectError> errors = ex.getBindingResult().getAllErrors();
			restResult = RestResult.getInstance(ErrorCode.VALIDATION_FAIL, "验证失败");
//			restResult.setData(errors);
			List<Pair<String,String>> errorList = new ArrayList<Pair<String,String>>();
			for(ObjectError error : errors){
				String code = error.getObjectName();
				if(error instanceof FieldError){
					code += "." + ((FieldError)error).getField();
				}
				String msg = error.getDefaultMessage();
				errorList.add(new Pair<String,String>(code, msg));
			}
			
			restResult.setData(errorList);
		} else {
			restResult = RestResult.getInstance("", exception.getMessage());
		}

		return restResult;
	}
}
