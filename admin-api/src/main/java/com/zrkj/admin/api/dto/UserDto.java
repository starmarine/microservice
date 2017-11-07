package com.zrkj.admin.api.dto;

import org.hibernate.validator.constraints.NotBlank;

public class UserDto {
	private String id;
	@NotBlank(message = "用户名不能为空")
	private String userName;
	@NotBlank(message = "用户昵称不能为空")
    private String displayName;
    private String passWord;
    private String email;
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
    
    
}
