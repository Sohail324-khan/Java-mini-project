package in.sohail.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
//@Primary
public class MySQLReportDao implements ReportDao {

	@Override
	public void getData() {
		System.out.println("Getting data from Mysql Db...");

	}

}
