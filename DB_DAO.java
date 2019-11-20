package dao;

import java.sql.*;

public interface DB_DAO {
	public Connection connection();
	public void drop();
	public void close();
}
