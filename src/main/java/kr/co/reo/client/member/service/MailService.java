package kr.co.reo.client.member.service;

public interface MailService {

	public boolean send(String subject, String text, String from, String to, String filePath);
	
	}


