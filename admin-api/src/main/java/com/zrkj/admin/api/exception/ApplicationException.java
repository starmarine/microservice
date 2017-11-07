package com.zrkj.admin.api.exception;

public class ApplicationException extends RuntimeException{

	private static final long serialVersionUID = -6560303252990148711L;
	private String code;
	
	public ApplicationException(String code){
		this.code = code;
	}
	
	public ApplicationException(String code,String msg){
		super(msg);
		this.code = code;
	}
	
	public ApplicationException(String code,String msg,Throwable t){
		super(msg,t);
		this.code = code;
	}

	public String getCode() {
		return code;
	}
	
	
}
