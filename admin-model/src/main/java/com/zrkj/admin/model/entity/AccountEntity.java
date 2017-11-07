package com.zrkj.admin.model.entity;

import java.io.Serializable;
import java.util.Map;

import org.springframework.data.mongodb.core.mapping.Document;

import com.zrkj.admin.model.entity.base.AbstractBaseEntity;

@Document
public class AccountEntity extends AbstractBaseEntity implements Serializable {
    
	private static final long serialVersionUID = 7933052437829993225L;
	
    private String accountName;
    private String appId;
    private String userId;
    //---是否启用
    private boolean enbale;
    //---扩展属性
    private Map<String, Object> extendAttributes;
    
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getAppId() {
		return appId;
	}
	public void setAppId(String appId) {
		this.appId = appId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Map<String, Object> getExtendAttributes() {
		return extendAttributes;
	}
	public void setExtendAttributes(Map<String, Object> extendAttributes) {
		this.extendAttributes = extendAttributes;
	}
	public boolean isEnbale() {
		return enbale;
	}
	public void setEnbale(boolean enbale) {
		this.enbale = enbale;
	}
    
    
}