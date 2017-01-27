package com.janani.mail;

import java.io.StringWriter;
import java.util.List;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;

import com.janani.dao.OrderDAO;
import com.janani.model.Order;

public class ProjectReportMailer {

	public static String getContent() {
		String templateName = "templates/report_table.vm";

		VelocityEngine ve = new VelocityEngine();
		ve.init();

		Template t = ve.getTemplate(templateName);

		VelocityContext context = new VelocityContext();

		OrderDAO dao = new OrderDAO();
		List<Order> list = dao.list();

		for (Order order : list) {
			System.out.println(order);
		}
		// context.put("NAME", "Janai");
		context.put("ORDER_DETAILS", list);

		StringWriter writer = new StringWriter();

		t.merge(context, writer);
		return writer.toString();
	}

}
