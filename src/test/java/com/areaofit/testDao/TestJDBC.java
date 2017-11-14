package com.areaofit.testDao;

import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.areaofit.testweb.service.UserService;

/**
 * multiDataSource1 application
 * @author Administrator
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-multiDataSource1.xml"})
public class TestJDBC {
	
	@Autowired
	private UserService userService;
	
	@Test
	public void test1(){
		Map<String, Object> re = userService.getUserById("1");
		System.out.println(re.get("name"));
		System.out.println(re.get("id"));
		Map<String, Object> re1 = userService.getUserById("1");
		System.out.println(re1.get("name"));
		System.out.println(re1.get("id"));
	}

}
