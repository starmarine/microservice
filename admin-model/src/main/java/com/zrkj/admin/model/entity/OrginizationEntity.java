package com.zrkj.admin.model.entity;

import java.io.Serializable;

import org.springframework.data.mongodb.core.mapping.Document;

import com.zrkj.admin.model.entity.base.AbstractBaseEntity;

@Document
public class OrginizationEntity extends AbstractBaseEntity implements Serializable{

	private static final long serialVersionUID = -1751368456161058678L;
	//---企业内部的组织机构code
	private String code;
	private String name;
	private String parentId;
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getParentId() {
		return parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	
	
}
