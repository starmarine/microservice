package com.zrkj.admin.test.dao;

import org.apache.commons.lang.StringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.zrkj.admin.dao.UserDao;
import com.zrkj.admin.impl.Application;
import com.zrkj.admin.model.entity.UserEntity;
	
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@WebAppConfiguration
public class TestUserDao {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private UserDao userDao;
	
	@Autowired
    private StringRedisTemplate stringRedisTemplate;
	
	@Autowired
	private RedisTemplate redisTemplate;
	
	@Test
	public void test(){
		String key = "haha";
		String value = stringRedisTemplate.opsForValue().get(key);
		System.out.println(value);
		if(StringUtils.isEmpty(value)){
			stringRedisTemplate.opsForValue().set(key, "huhu");
		}
		
		value = stringRedisTemplate.opsForValue().get(key);
		System.out.println(value);
		
		UserEntity user = new UserEntity();
		user.setUserName("haha");
		userDao.saveUser(user);
		
		redisTemplate.opsForValue().set("gg", user);
		UserEntity user1 = (UserEntity) redisTemplate.opsForValue().get("gg");
		
		logger.info("xxx:"+user1);
		
	}
}
