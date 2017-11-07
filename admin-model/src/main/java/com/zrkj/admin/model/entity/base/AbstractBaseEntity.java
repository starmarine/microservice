package com.zrkj.admin.model.entity.base;

import org.springframework.data.annotation.Id;

public class AbstractBaseEntity {
	@Id
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}	
}
