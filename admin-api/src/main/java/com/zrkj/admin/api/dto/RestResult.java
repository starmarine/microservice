package com.zrkj.admin.api.dto;

public class RestResult {

	private boolean success;
	private String errorCode;
	private String errorMessage;
	private Object data;

	private RestResult() {
	}

	public static RestResult getInstance(Object data) {
		RestResult result = new RestResult();
		result.success = true;
		result.setData(data);
		return result;
	}

	public static RestResult getInstance(String code, String message) {
		RestResult result = new RestResult();
		result.success = false;
		result.setErrorCode(code);
		result.setErrorMessage(message);
		return result;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}
