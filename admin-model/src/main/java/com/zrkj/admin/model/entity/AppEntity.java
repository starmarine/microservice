package com.zrkj.admin.model.entity;

import java.io.Serializable;

import org.springframework.data.mongodb.core.mapping.Document;

import com.zrkj.admin.model.entity.base.AbstractBaseEntity;
import com.zrkj.admin.model.enums.app.AppTypeEnum;

@Document
public class AppEntity extends AbstractBaseEntity implements Serializable{

	private static final long serialVersionUID = 7325219310383465310L;
	
	private String name;
	//---应用图标
	private String icon;
	private AppTypeEnum appTypeEnum;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public AppTypeEnum getAppTypeEnum() {
		return appTypeEnum;
	}
	public void setAppTypeEnum(AppTypeEnum appTypeEnum) {
		this.appTypeEnum = appTypeEnum;
	}

	
}
