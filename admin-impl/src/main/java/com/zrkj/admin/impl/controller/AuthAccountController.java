package com.zrkj.admin.impl.controller;

import io.swagger.annotations.ApiOperation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zrkj.admin.api.AuthAccount;
import com.zrkj.admin.dao.UserDao;
import com.zrkj.admin.model.entity.UserEntity;
import com.zrkj.admin.service.AuthService;

@RestController
public class AuthAccountController implements AuthAccount{
	private final Logger logger = LoggerFactory.getLogger(this.getClass()); 
	
//	@Autowired
	AuthService authSrv;
	
//	@Autowired
	private UserDao userDao;
	
	@Value("${test.ttt}")
	private String test;
	
	@ApiOperation(value="获取项目组Sonar对应的Url信息", notes="根据id获取项目组Sonar对应的Url信息")// 使用该注解描述接口方法信息
	@Override
	public String authAccount(@RequestParam("id") String id) {
		String result = authSrv.info();
		UserEntity user = new UserEntity();
		user.setUserName("zhanghao");
		user.setPassWord("password");
		userDao.saveUser(user);
		logger.info(result);
		logger.info(test);
		logger.info(id);
		
		return "{auth:" + Math.random() + ",id:" + id + "}";
	}
}
