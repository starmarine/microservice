package com.zrkj.admin.test.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.zrkj.admin.impl.Application;
import com.zrkj.admin.impl.controller.AuthAccountController;
	
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@WebAppConfiguration
public class TestAuthAccountController {
	
	@Autowired
	AuthAccountController controller;
	
	@Test
	public void test(){
		String result = controller.authAccount("test");
		System.out.println("yes");
		System.out.println(result);
	}
}
