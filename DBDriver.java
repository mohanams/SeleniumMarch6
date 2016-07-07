package day6;

import java.sql.SQLException;

public class DBDriver {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String update = "update Selenium.[dbo].[Employee] set Location = 'Argentina' where Name = 'Kun'";
		String query = "select * from Selenium.[dbo].[Employee]";
		Database db = new Database();
		db.updatedata(update);
		db.getdata(query);
		db.disconnectDB();
	}
}
