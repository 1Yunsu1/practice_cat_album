package cat_album.com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatAlbumConnection {
	static final private String url = "jdbc:mysql://localhost:3306/cat_album";
	static final private String user = "ilovecat";
	static final private String pw = "ilovecat";
	static final private String driver = "com.mysql.cj.jdbc.Driver";
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url, user, pw);
		return conn;
	}
	
	public static void main (String[] args) {
		try {			
			System.out.println(CatAlbumConnection.getConnection());
		}
		catch(Exception e) {
			e.getStackTrace();
		}
	}
}
