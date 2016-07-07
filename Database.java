package day6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
	
	Connection conn =null;
	public Database() throws ClassNotFoundException
	{
		Class.forName("sun.jdbc.odbc.JdbcOdbcConnection");
		 try {
			conn = DriverManager.getConnection("Jdbc:Odbc:MY_DB");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (conn!= null)
		{
			System.out.println("Connection success");
		}
	}
	public void getdata(String query) throws ClassNotFoundException, SQLException
	{	
		
		Statement statement = conn.createStatement();
		
		ResultSet resultSet = statement.executeQuery(query);
		
		while(resultSet.next())
		{
			System.out.print(resultSet.getString("ID"));
			System.out.print("             ");
			System.out.print(resultSet.getString("Name"));
			System.out.print("             ");
			System.out.print(resultSet.getString("Location"));
			System.out.println();
		}		
		
		
	}
	
	public void updatedata(String update) throws SQLException
	{
		Statement statement = conn.createStatement();
		statement.executeUpdate(update);
	}

	public void disconnectDB() throws SQLException
	{
		conn.close();
	}
}







