package singletonDesignPattern;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCSingleton {
	private static JDBCSingleton jdbcSingleton;

	private JDBCSingleton() {

	}

	public static synchronized JDBCSingleton getJDBCSingleton() {
		if (jdbcSingleton == null)
			jdbcSingleton = new JDBCSingleton();

		return jdbcSingleton;
	}

	private Connection getConnection() throws SQLException, ClassNotFoundException {
		Connection con = null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/roaster", "zeeshan", "infa@123");
		return con;
	}

	public int insert(String name, String pass) throws SQLException {
		Connection c = null;

		PreparedStatement ps = null;

		int recordCounter = 0;

		try {

			c = this.getConnection();
			ps = c.prepareStatement("insert into jdbc(name,pass)values(?,?)");
			ps.setString(1, name);
			ps.setString(2, pass);
			recordCounter = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			if (ps != null) {
				ps.close();
			}
			if (c != null) {
				c.close();
			}
		}

		return recordCounter;
	}

	public void view(String name) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {

			con = this.getConnection();
			ps = con.prepareStatement("select * from jdbc where name=?");
			ps.setString(1, name);
			rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println("Name= " + rs.getString(1) + "\t" + "Paasword= " + rs.getString(2));

			}

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			if (rs != null) {
				rs.close();
			}
			if (ps != null) {
				ps.close();
			}
			if (con != null) {
				con.close();
			}
		}
	}

	public int update(String name, String password) throws SQLException {
		Connection c = null;
		PreparedStatement ps = null;

		int recordCounter = 0;
		try {
			c = this.getConnection();
			ps = c.prepareStatement(" update jdbc set pass=? where name='" + name + "' ");
			ps.setString(1, password);
			recordCounter = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			if (ps != null) {
				ps.close();
			}
			if (c != null) {
				c.close();
			}
		}
		return recordCounter;
	}

	public int delete(String userid) throws SQLException {
		Connection c = null;
		PreparedStatement ps = null;
		int recordCounter = 0;
		try {
			c = this.getConnection();
			ps = c.prepareStatement(" delete from jdbc where name='" + userid + "' ");
			recordCounter = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (ps != null) {
				ps.close();
			}
			if (c != null) {
				c.close();
			}
		}
		return recordCounter;
	}

}
