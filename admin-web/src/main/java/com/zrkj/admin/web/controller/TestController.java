package com.zrkj.admin.web.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.zrkj.admin.api.AuthAccount;
import com.zrkj.admin.api.UserAccount;
import com.zrkj.admin.api.dto.RestResult;
import com.zrkj.admin.api.dto.UserDto;
import com.zrkj.admin.api.exception.ApplicationException;
import com.zrkj.admin.api.vo.UserVO;
import com.zrkj.admin.web.annotation.SysOperation;

@RestController
public class TestController {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private AuthAccount authAccount;

	@Autowired
	private UserAccount userAccount;

	@Autowired
	RestTemplate restTemplate;
	
	@RequestMapping(value = "/userAdd", method = RequestMethod.GET)
	public void userAdd(@Valid UserDto userDto){
		System.out.println(userDto);
	}

	@SysOperation("测试方法")
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test(@RequestParam("id") String id) {
		logger.info("testtest");
		String result = authAccount.authAccount("gaogaogao");

		// ResponseEntity<String> r =
		// restTemplate.getForEntity("http://AUTH-SERVER/auth?id=xxx", String.class);
		// result = r.getBody();

		return result;
	}

	// @SysOperation("新增用户方法")
	@RequestMapping(value = "add", method = RequestMethod.GET)
	RestResult add(@RequestParam("userName") String userName, @RequestParam("passWord") String passWord)
			throws Exception {
		// throw new ApplicationException("258", "人为抛出异常！");
		UserVO userVO = userAccount.add(userName, passWord);
		return RestResult.getInstance(userVO);
	}
	
	@RequestMapping(value = "add_", method = RequestMethod.GET)
	RestResult add_(@RequestParam("userName") String userName, @RequestParam("passWord") String passWord)
			throws Exception {
		 throw new ApplicationException("258", "人为抛出异常！");
//		UserVO userVO = userAccount.add(userName, passWord);
//		return RestResult.getInstance(userVO);
	}
}
