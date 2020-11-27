package com.pk.emailsender.emailsender.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.pk.emailsender.emailsender.Model.Mail;

@Service
public class MailService {
	
	@Autowired
	private JavaMailSender javaMailSender;
	
	public String sendMail(Mail mail) {
		try {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo(mail.getTo());
		message.setSubject(mail.getSubject());
		message.setText(mail.getBody());
		javaMailSender.send(message);
		return "Success";
		}catch(Exception e) {
			return e.getMessage();
		}
	}
}
