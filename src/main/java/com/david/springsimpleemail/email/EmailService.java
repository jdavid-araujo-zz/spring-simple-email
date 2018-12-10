package com.david.springsimpleemail.email;

import org.springframework.mail.SimpleMailMessage;

public interface EmailService {

	void sendSimpleEmail(String to, String subject, String text);

	void sendSimpleEmailUsingTemplate(String to, String subject, SimpleMailMessage template, String... templateArgs);

	void sendEmailWithAttachment(String to, String subject, String text, String pathToAttachment);
}