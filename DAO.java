package dao;

import java.sql.*;

public interface DAO {
	public Connection connection();
	public ResultSet resultSet();
	public ResultSet upData();
//	public ResultSet insertValues();
//	public ResultSet insertValue();
	public void topN(int n);
	public ResultSet delete();
	public void dropDatabase();
	public void dropTable(String table);
	public void close();
}
