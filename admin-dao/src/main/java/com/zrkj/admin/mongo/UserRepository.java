package com.zrkj.admin.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.zrkj.admin.model.entity.UserEntity;

/**
 * 用户仓库
 * 
 * @author zx 2017年11月6日13:25:11
 *
 */
public interface UserRepository extends MongoRepository<UserEntity, String> {
	UserEntity findByUserNameOrEmail(String userName,String email);
}
