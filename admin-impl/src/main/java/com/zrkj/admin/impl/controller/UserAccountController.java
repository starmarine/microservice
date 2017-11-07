package com.zrkj.admin.impl.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zrkj.admin.api.UserAccount;
import com.zrkj.admin.api.vo.UserVO;
import com.zrkj.admin.model.entity.UserEntity;
import com.zrkj.admin.mongo.UserRepository;

/**
 * 用户控制器
 * 
 * @author zx 2017年11月6日13:25:50
 *
 */
@RestController
public class UserAccountController implements UserAccount {

	@Autowired
	UserRepository repository;

	public UserVO add(@RequestParam("userName") String userName, @RequestParam("passWord") String passWord) {
		UserEntity entity = new UserEntity();
		entity.setId(UUID.randomUUID().toString());
		entity.setPassWord(passWord);
		entity.setUserName(userName);
		repository.save(entity);

		UserVO userVO = new UserVO();
		userVO.setId(entity.getId());
		userVO.setPassWord(entity.getPassWord());
		userVO.setUserName(entity.getUserName());

		return userVO;
	}

	public String delete(@RequestParam("id") String id) {
		repository.delete(id);
		return "删除成功";
	}

	public UserVO update(@RequestParam("id") String id, @RequestParam("userName") String userName,
			@RequestParam("passWord") String passWord) {
		UserEntity entity = new UserEntity();
		entity.setId(id);
		entity.setPassWord(passWord);
		entity.setUserName(userName);
		repository.save(entity);

		UserVO userVO = new UserVO();
		userVO.setId(entity.getId());
		userVO.setPassWord(entity.getPassWord());
		userVO.setUserName(entity.getUserName());

		return userVO;
	}

	public UserVO search(@RequestParam("id") String id) {
		UserEntity entity = repository.findOne(id);

		UserVO userVO = new UserVO();
		userVO.setId(entity.getId());
		userVO.setPassWord(entity.getPassWord());
		userVO.setUserName(entity.getUserName());

		return userVO;
	}

}
