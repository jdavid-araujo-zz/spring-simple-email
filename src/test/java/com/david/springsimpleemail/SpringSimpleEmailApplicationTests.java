package com.david.springsimpleemail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.david.springsimpleemail.email.EmailService;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringSimpleEmailApplicationTests {

	@Autowired
	EmailService emailService;
	
	@Test
	public void contextLoads() {
		this.emailService.sendSimpleEmail("j.davidsousaaraujo@gmail.com", "Test", "fdsfds");
	}
}
