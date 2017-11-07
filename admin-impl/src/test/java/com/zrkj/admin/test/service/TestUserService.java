package com.zrkj.admin.test.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.zrkj.admin.api.dto.UserDto;
import com.zrkj.admin.impl.Application;
import com.zrkj.admin.impl.service.UserService;
import com.zrkj.admin.mongo.UserRepository;
	
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@WebAppConfiguration
public class TestUserService {
	
	@Autowired
	private UserService userSrv;
	
	@Autowired
	private UserRepository userRepo;
	
	@Test
	public void testSave(){
		UserDto dto = new UserDto();
		dto.setUserName("zhanghao");
		dto.setEmail("zhanghao@id.link");
		userSrv.save(dto);
	}
	
	@Test
	public void testDelete(){
		UserDto dto = new UserDto();
		dto.setUserName("zhanghao"+Math.round(Math.random() * 1000));
		dto.setEmail("zhanghao@id.link"+Math.round(Math.random() * 1000));
		dto = userSrv.save(dto);
		
		Assert.assertNotNull(dto.getId());
		System.out.println(dto.getId());
		userSrv.delete(dto.getId());
		
		Assert.assertNull(userRepo.findOne(dto.getId()));
	}
}
