package com.zrkj.admin.model.entity;

import java.io.Serializable;
import java.util.List;

import com.zrkj.admin.model.entity.base.AbstractBaseEntity;

public class ExtendAttributeEntity extends AbstractBaseEntity implements Serializable{

	private static final long serialVersionUID = -3595508524297796090L;
	
	private String code;
	private String name;
	//---扩展属性的类型(字符 数字 密码 时间 tag 可选项 邮件 电话)
	private String type;
	//---是否在列表中显示
	private boolean displayInList;
	//---是否索引
	private boolean indexed;
	//---是否是敏感信息
	private boolean sensitive;
	//---用户是否可以编辑
	private boolean editable;
	//---用户是否可以查看
	private boolean displayToUser;
	//---如果type是可选项，这里就保存可选项的具体数据
	private List<SelectableField> selectableFields;
	
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean isDisplayInList() {
		return displayInList;
	}
	public void setDisplayInList(boolean displayInList) {
		this.displayInList = displayInList;
	}
	public boolean isIndexed() {
		return indexed;
	}
	public void setIndexed(boolean indexed) {
		this.indexed = indexed;
	}
	public boolean isSensitive() {
		return sensitive;
	}
	public void setSensitive(boolean sensitive) {
		this.sensitive = sensitive;
	}
	public boolean isEditable() {
		return editable;
	}
	public void setEditable(boolean editable) {
		this.editable = editable;
	}
	public boolean isDisplayToUser() {
		return displayToUser;
	}
	public void setDisplayToUser(boolean displayToUser) {
		this.displayToUser = displayToUser;
	}
	public List<SelectableField> getSelectableFields() {
		return selectableFields;
	}
	public void setSelectableFields(List<SelectableField> selectableFields) {
		this.selectableFields = selectableFields;
	}
	
}
