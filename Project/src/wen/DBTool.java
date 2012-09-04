package wen;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class DBTool {
	private final String driverName = "com.mysql.jdbc.Driver";
	private final String url = "jdbc://localhost:3306/test"; 
	private final String userName = "root";
	private final String password = "root";
	
	private Connection conn;
	private PreparedStatement preStat;
	
	public DBTool() {
		try {
			Class.forName(driverName);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("加载数据库驱动失败");
		}
	}
	
	@SuppressWarnings("finally")
	private Connection getConnection() {
		try {
			conn = DriverManager.getConnection(url, userName, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("获取数据库连接失败");
			conn = null;
		} finally {
			return conn;
		}
	}
	
	public void close() {
		if (preStat != null) {
			try {
				preStat.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
 }
