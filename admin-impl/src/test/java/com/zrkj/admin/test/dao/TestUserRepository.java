package com.zrkj.admin.test.dao;

import java.util.UUID;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.zrkj.admin.impl.Application;
import com.zrkj.admin.model.entity.UserEntity;
import com.zrkj.admin.mongo.UserRepository;
	
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@WebAppConfiguration
public class TestUserRepository {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private UserRepository userRepo;
	
	@Test
	public void test(){
		logger.info("hahaha");
		
		UserEntity entity = new UserEntity();
		entity.setId(UUID.randomUUID().toString());
		entity.setPassWord("xxx");
		entity.setUserName("userName");
		
		userRepo.save(entity);
		
	}
}
