package com.david.springsimpleemail.email.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.david.springsimpleemail.email.EmailService;

@Service
public class EmailServiceImpl implements EmailService {

	@Autowired
	public JavaMailSender emailSender;

	@Override
	public void sendSimpleEmail(String to, String subject, String text) {
		SimpleMailMessage email = new SimpleMailMessage();
		email.setTo(to);
		email.setSubject(subject);
		email.setText(text);

		emailSender.send(email);
	}

	@Override
	public void sendSimpleEmailUsingTemplate(String to, String subject, SimpleMailMessage template,
			String... templateArgs) {
		String text = String.format(template.getText(), templateArgs);
		sendSimpleEmail(to, subject, text);
	}

	@Override
	public void sendEmailWithAttachment(String to, String subject, String text, String pathToAttachment) {
		/*
		 * MimeMessage message = emailSender.createMimeMessage();
		 * 
		 * MimeMessageHelper helper = new MimeMessageHelper(message, true);
		 * 
		 * helper.setTo(to); helper.setSubject(subject); helper.setText(text);
		 * 
		 * FileSystemResource file = new FileSystemResource(new File(pathToAttachment));
		 * helper.addAttachment("Invoice", file);
		 */
	}
}
