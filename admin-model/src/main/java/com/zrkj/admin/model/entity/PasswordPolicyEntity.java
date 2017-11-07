package com.zrkj.admin.model.entity;

import java.io.Serializable;

import org.springframework.data.mongodb.core.mapping.Document;

import com.zrkj.admin.model.entity.base.AbstractBaseEntity;
import com.zrkj.admin.model.enums.password.PasswordExpireNotifyEnum;
import com.zrkj.admin.model.enums.password.PasswordRangeEnum;
import com.zrkj.admin.model.enums.password.WrongPasswordPolicyEnum;

@Document
public class PasswordPolicyEntity extends AbstractBaseEntity implements Serializable{

	private static final long serialVersionUID = -8717936792177523580L;
	private String name;
	private PasswordConstrain constrain;
	private WrongPasswordPolicy wrongPasswordPolicy;
	//---密码过期配置
	private ExpireConfig expireConfig;
	//---策略适用范围
	private PasswordRangeEnum range;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PasswordConstrain getConstrain() {
		return constrain;
	}

	public void setConstrain(PasswordConstrain constrain) {
		this.constrain = constrain;
	}

	public WrongPasswordPolicy getWrongPasswordPolicy() {
		return wrongPasswordPolicy;
	}

	public void setWrongPasswordPolicy(WrongPasswordPolicy wrongPasswordPolicy) {
		this.wrongPasswordPolicy = wrongPasswordPolicy;
	}

	public ExpireConfig getExpireConfig() {
		return expireConfig;
	}

	public void setExpireConfig(ExpireConfig expireConfig) {
		this.expireConfig = expireConfig;
	}

	public PasswordRangeEnum getRange() {
		return range;
	}

	public void setRange(PasswordRangeEnum range) {
		this.range = range;
	}

	class ExpireConfig{
		//---过期时间
		private long expireTime;
		//---提醒时间
		private String notifyConfig;
		//---警告模式
		private PasswordExpireNotifyEnum notifyType;
		//---警告模板标题
		private String templateTitle;
		//---警告模板正文
		private String templateBody;
		public long getExpireTime() {
			return expireTime;
		}
		public void setExpireTime(long expireTime) {
			this.expireTime = expireTime;
		}
		public String getNotifyConfig() {
			return notifyConfig;
		}
		public void setNotifyConfig(String notifyConfig) {
			this.notifyConfig = notifyConfig;
		}
		public PasswordExpireNotifyEnum getNotifyType() {
			return notifyType;
		}
		public void setNotifyType(PasswordExpireNotifyEnum notifyType) {
			this.notifyType = notifyType;
		}
		public String getTemplateTitle() {
			return templateTitle;
		}
		public void setTemplateTitle(String templateTitle) {
			this.templateTitle = templateTitle;
		}
		public String getTemplateBody() {
			return templateBody;
		}
		public void setTemplateBody(String templateBody) {
			this.templateBody = templateBody;
		}
		
		
	}
	
	
	class WrongPasswordPolicy{
		private WrongPasswordPolicyEnum policyEnum;
		//---输错数目
		private short number;
		//---锁定多长时间
		private int lockTime;
		public WrongPasswordPolicyEnum getPolicyEnum() {
			return policyEnum;
		}
		public void setPolicyEnum(WrongPasswordPolicyEnum policyEnum) {
			this.policyEnum = policyEnum;
		}
		public short getNumber() {
			return number;
		}
		public void setNumber(short number) {
			this.number = number;
		}
		public int getLockTime() {
			return lockTime;
		}
		public void setLockTime(int lockTime) {
			this.lockTime = lockTime;
		}
		
		
	}
	
	class PasswordConstrain {
		private short minLength;
		private short maxLength;
		//---最大重复字符数
		private short maxDuplicated;
		private String blackList;
		//---是否禁止空格
		private boolean forbidBlank;
		//---是否强制特殊字符
		private boolean forceSpecialLetter;
		//---是否强制大写
		private boolean forceCapital;
		//---是否强制小写
		private boolean forceLowerCase;
		
		public short getMinLength() {
			return minLength;
		}
		public void setMinLength(short minLength) {
			this.minLength = minLength;
		}
		public short getMaxLength() {
			return maxLength;
		}
		public void setMaxLength(short maxLength) {
			this.maxLength = maxLength;
		}
		public short getMaxDuplicated() {
			return maxDuplicated;
		}
		public void setMaxDuplicated(short maxDuplicated) {
			this.maxDuplicated = maxDuplicated;
		}
		public String getBlackList() {
			return blackList;
		}
		public void setBlackList(String blackList) {
			this.blackList = blackList;
		}
		public boolean isForbidBlank() {
			return forbidBlank;
		}
		public void setForbidBlank(boolean forbidBlank) {
			this.forbidBlank = forbidBlank;
		}
		public boolean isForceSpecialLetter() {
			return forceSpecialLetter;
		}
		public void setForceSpecialLetter(boolean forceSpecialLetter) {
			this.forceSpecialLetter = forceSpecialLetter;
		}
		public boolean isForceCapital() {
			return forceCapital;
		}
		public void setForceCapital(boolean forceCapital) {
			this.forceCapital = forceCapital;
		}
		public boolean isForceLowerCase() {
			return forceLowerCase;
		}
		public void setForceLowerCase(boolean forceLowerCase) {
			this.forceLowerCase = forceLowerCase;
		}
		
		
	}
	
}
