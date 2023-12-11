package in.sohail.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.sohail.AppConfig;
import in.sohail.service.ReportService;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctxt = new AnnotationConfigApplicationContext(AppConfig.class);
		ReportService r = ctxt.getBean(ReportService.class);
		r.generateReport();
	}

}
