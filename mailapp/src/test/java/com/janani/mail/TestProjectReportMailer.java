package com.janani.mail;

import java.util.logging.Logger;

import com.janani.util.MailUtil;

public class TestProjectReportMailer {
	
	private final static Logger LOGGER = Logger.getLogger(TestProjectReportMailer.class.getName());
	public static void main(String[] args) {

		String content = ProjectReportMailer.getContent();

		System.out.println(content.toString());
		//LOGGER.info(content.toString());

		String subject = "Reg - Order Status";
		//MailUtil.sendHtmlMail(subject, content);
	}

}
