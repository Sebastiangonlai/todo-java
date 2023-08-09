package conexionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conectar_Mysql {
	private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";

	private static final String DB_NAME = "bd";
	private static final String DB_HOST = "127.0.0.1"; // 'localhost'
	private static final String DB_USER = "root";
	private static final String DB_PASSWORD = "123456";

	private static final String DB_URL = "jdbc:mysql://" + DB_HOST + "/" + DB_NAME;

	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName(JDBC_DRIVER);
		String sql = "SELECT * FROM persona";

		try (
				Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
				Statement statement = connection.createStatement();) {

			try (ResultSet result = statement.executeQuery(sql)) {
				System.out.print("[id]\t[name]\n");

				while (result.next()) {
					int id = result.getInt("id");
					String name = result.getString("name");

					System.out.print(id + "\t" + name + "\n");
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}