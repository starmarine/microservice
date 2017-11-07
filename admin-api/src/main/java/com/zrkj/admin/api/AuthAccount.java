package com.zrkj.admin.api;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "AUTH-SERVER")
public interface AuthAccount {
	
	@RequestMapping(value = "/auth",method=RequestMethod.GET)
	public String authAccount(@RequestParam("id") String id);
}
