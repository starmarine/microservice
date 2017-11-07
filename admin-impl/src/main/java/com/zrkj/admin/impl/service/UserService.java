package com.zrkj.admin.impl.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zrkj.admin.api.dto.UserDto;
import com.zrkj.admin.api.error.ErrorCode;
import com.zrkj.admin.model.entity.UserEntity;
import com.zrkj.admin.mongo.UserRepository;
import com.zrkj.admin.api.exception.ApplicationException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepo;
	
	public UserDto save(UserDto userDto){
		UserEntity user = new UserEntity();
		BeanUtils.copyProperties(userDto, user);
		UserEntity u = userRepo.findByUserNameOrEmail(user.getUserName(),user.getEmail());
		if(u != null){
			throw new ApplicationException(ErrorCode.USER_EXITS,"用户已存在");
		}
		
		userRepo.save(user);
		userDto.setId(user.getId());
		return userDto;
	}
	
	public void delete(String uid){
		userRepo.delete(uid);
	}
	
}
