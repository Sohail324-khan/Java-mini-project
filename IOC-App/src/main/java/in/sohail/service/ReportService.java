package in.sohail.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import in.sohail.dao.ReportDao;

@Service
public class ReportService {

	// @Autowired
	// @Qualifier("xyz")
	private ReportDao dao;

// by using setter injection
	// @Autowired
	// public void setDao(ReportDao dao) {
	// this.dao = dao;
	// }

	// By using constructor injection

	@Autowired
	public ReportService(ReportDao dao) {
		this.dao = dao;
	}

	public void generateReport() {
		dao.getData();
		System.out.println("Report Generated");
	}
}
