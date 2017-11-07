package com.zrkj.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zrkj.admin.mongo.UserRepository;

@Service
public class AuthService {
	
//	@Autowired
	private UserRepository userRepo;
	public String info(){
		return "hello";
	}
}
