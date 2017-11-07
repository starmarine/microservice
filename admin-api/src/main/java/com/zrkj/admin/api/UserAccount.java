package com.zrkj.admin.api;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.zrkj.admin.api.vo.UserVO;

/**
 * 用户操作api
 * 
 * @author zx 2017年11月6日13:22:43
 *
 */
@FeignClient(value = "AUTH-SERVER")
public interface UserAccount {

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	UserVO add(@RequestParam("userName") String userName, @RequestParam("passWord") String passWord);

	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	String delete(@RequestParam("id") String id);

	@RequestMapping(value = "/update", method = RequestMethod.GET)
	UserVO update(@RequestParam("id") String id, @RequestParam("userName") String userName,
			@RequestParam("passWord") String passWord);

	@RequestMapping(value = "/search", method = RequestMethod.GET)
	UserVO search(@RequestParam("id") String id);
}
