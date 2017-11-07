package com.zrkj.admin.model.entity;

/**
 * 提供给扩展属性定义ExtendAttributeEntity使用
 * 提供了可选项的列表
 */
public class SelectableField {
	private String id;
	private String label;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	
	
}
