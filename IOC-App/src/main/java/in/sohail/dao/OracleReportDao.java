package in.sohail.dao;

import org.springframework.stereotype.Repository;

@Repository //("dao") //by name
//@Repository("xyz")// by name using qualifier annotation
public class OracleReportDao implements ReportDao {

	@Override
	public void getData() {
		System.out.println("Getting data from oracle db..");

	}

}
