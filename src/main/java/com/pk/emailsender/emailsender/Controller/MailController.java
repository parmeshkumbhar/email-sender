package com.pk.emailsender.emailsender.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pk.emailsender.emailsender.Model.Mail;
import com.pk.emailsender.emailsender.service.MailService;

@RestController
public class MailController {
	
	@Autowired
	private MailService mailService;
	
	@PostMapping("/send-email")
	public String SendEmail(@RequestBody Mail mail) {
		return mailService.sendMail(mail);
	}
}
