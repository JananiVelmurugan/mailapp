package com.janani.mail;

import com.janani.util.MailUtil;

public class TestProjectReportMailer {
	public static void main(String[] args) {

		String content = ProjectReportMailer.getContent();

		System.out.println(content.toString());

		String subject = "Reg - Order Status";
		MailUtil.sendHtmlMail(subject, content);
	}

}
