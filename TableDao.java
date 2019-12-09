package dao;

import java.sql.*;

public class TableDao implements Table_DAO{
	int columnNumber;
	String tableName,sql;
	String[]col;//列名
	String[]colType;//列类型名
	Connection ct;
	Statement st;
	ResultSet rs;
	public TableDao(String tableName) {
		this.tableName=tableName;
		col=null;
		colType=null;
	}
	public String [] getCol() {
		ResultSetMetaData data;
		String[] co=null;
		try {
			data = rs.getMetaData();
			co=new String[data.getColumnCount()];
			if(col==null) {
				col=new String[data.getColumnCount()];
				colType=new String[data.getColumnCount()];
				for (int i = 1; i <= data.getColumnCount(); i++) {
					String Name=data.getColumnName(i);
					col[i-1]=Name;
					co[i-1]=Name;
					colType[i-1]=data.getColumnTypeName(i);
				}
			}
			else {
				for (int i = 1; i <= data.getColumnCount(); i++) {
					String Name=data.getColumnName(i);
					co[i-1]=Name;
				}
			}
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		return co;
	}
	public int getPoint(String name) {
		int i=0;
		while(!col[i].equals(name)) {
			i++;
		}
		return i;
	}
	//将连接给表中ct
	public void setConnection(Connection ct) {
		this.ct=ct;
		try {
			st=ct.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			rs=st.executeQuery("select * from "+tableName);
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		col=this.getCol();
	}
	//输出结果集
	public void rsPrint() {
		try {
			String [] coName=getCol();
			while(rs.next()) {
				for(int i=0;i<coName.length;++i)
					System.out.print(coName[i]+": "+rs.getString(coName[i])+"  ");
				System.out.println();
				
			}
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
	
	@Override
	public ResultSet select_all() {
		// TODO 自动生成的方法存根
		sql="select * from "+tableName;
		try {
			st=ct.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			rs=st.executeQuery(sql);
			rsPrint();
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		return rs;
	}

	@Override
	public ResultSet select_part(String... msgs) {
		// TODO 自动生成的方法存根
		String column=msgs[0];
		for(int i=1;i<msgs.length;++i) {
			column=column+","+msgs[i];
		}
		sql="SELECT "+column+" FROM "+tableName;
		try {
			rs=st.executeQuery(sql);
			rsPrint();
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		return rs;
	}

	@Override
	public ResultSet select_distinct(String msgs) {
		// TODO 自动生成的方法存根
		sql="SELECT DISTINCT "+msgs+" FROM "+tableName;
		try {
			rs=st.executeQuery(sql);
			rsPrint();
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		return rs;
	}

	@Override
	public ResultSet select_where(String columnName, String expression) {
		// TODO 自动生成的方法存根
		sql="SELECT "+columnName+" FROM "+tableName+" where "+expression;
		try {
			rs=st.executeQuery(sql);
			rsPrint();
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		return rs;
	}

	@Override
	public ResultSet select_where_in(String... msgs) {
		// TODO 自动生成的方法存根
		sql="SELECT * FROM "+tableName +" WHERE "+msgs[0]+" IN ";
		try {
			ResultSetMetaData data = rs.getMetaData();
			for (int i = 1; i <= data.getColumnCount(); i++) {
				int x=data.getColumnCount();
				String Name=data.getColumnName(x);
				if(Name.equals(msgs[0])) {
					String columnTypeName = data.getColumnTypeName(i);
					if(!columnTypeName.equals("int")&&!columnTypeName.equals("float")) {
						for(int ii=1;ii<msgs.length;++ii) {
							msgs[ii]="'"+msgs[ii]+"'";
						}
					}
					sql=sql+"("+msgs[1];
					for(int ii=2;ii<msgs.length;++ii) {
						sql=sql+","+msgs[ii];
					}
					sql=sql+");";
					i=data.getColumnCount();
				}
			}
			rs=st.executeQuery(sql);
			rsPrint();
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		return rs;
	}

	@Override
	public ResultSet select_between(String name,String msgs1, String msgs2) {
		// TODO 自动生成的方法存根
		int point=getPoint(name);
		if(!colType[point].equals("int")&&!colType[point].equals("float")) {
			msgs1="'"+msgs1+"'";
			msgs2="'"+msgs2+"'";
		}
		sql="SELECT * FROM "+tableName+" WHERE "+name +" BETWEEN "+msgs1+" AND "+msgs2;
		try {
			rs=st.executeQuery(sql);
			rsPrint();
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void alter_add(String name, String type) {
		// TODO 自动生成的方法存根
		sql="ALTER TABLE "+tableName+" ADD "+name+" "+type;
		try {
			st.executeUpdate(sql);
			rs=st.executeQuery("select * from "+tableName);
			col=null;
			colType=null;
			this.getCol();
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}

	@Override
	public void alter_alter(String name, String type) {
		// TODO 自动生成的方法存根
		sql="ALTER TABLE "+tableName+" ALTER COLUMN "+name+" "+type;
		try {
			st.executeUpdate(sql);
			rs=st.executeQuery("select * from "+tableName);
			col=null;
			colType=null;
			this.getCol();
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}

	@Override
	public void  alter_drop(String name) {
		// TODO 自动生成的方法存根
		sql="ALTER TABLE "+tableName+" DROP COLUMN "+name;
		try {
			st.executeUpdate(sql);
			rs=st.executeQuery("select * from "+tableName);
			col=null;
			colType=null;
			this.getCol();
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}

	@Override
	public ResultSet order_by(String name) {
		// TODO 自动生成的方法存根
		sql="SELECT * FROM "+tableName+" ORDER BY "+name;
		try {
			rs=st.executeQuery(sql);
			rsPrint();
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		return rs;
	}

	@Override
	public ResultSet order_by_desc(String name) {
		// TODO 自动生成的方法存根
		sql="SELECT * FROM "+tableName+" ORDER BY "+name+" DESC";
		try {
			rs=st.executeQuery(sql);
			rsPrint();
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		return rs;
	}

	@Override
	public void insert_into(String... msgs) {
		// TODO 自动生成的方法存根
		sql="INSERT INTO "+tableName+" VALUES (*)";
		String ms="";
		for(int i=0;i<msgs.length;++i) {
			if(!colType[getPoint(col[i])].equals("int")&&!colType[getPoint(col[i])].equals("float"))
				msgs[i]="'"+msgs[i]+"'";
			ms=ms+msgs[i]+",";
		}
		ms=ms.substring(0, ms.lastIndexOf(","));
		sql="SET NOCOUNT OFF "+sql.replace("*", ms);
		try {
			st.executeQuery(sql);
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
		//	e.printStackTrace();
		}
	}

	@Override
	public void insert_into_appoint(int n, String... msgs) {
		// TODO 自动生成的方法存根
		sql="INSERT INTO "+tableName+" (-) VALUES (*)";
		String ms1="",ms2="";
		ms1=msgs[0];
		for(int i=1;i<n;++i)
			ms1=ms1+","+msgs[i];
		sql=sql.replace("-", ms1);
		for(int i=n;i<msgs.length;++i) {
			if(!colType[getPoint(msgs[i-n])].equals("int")&&!colType[getPoint(msgs[i-n])].equals("float"))
				msgs[i]="'"+msgs[i]+"'";
			ms2=ms2+msgs[i]+",";
		}
		ms2=ms2.substring(0, ms2.lastIndexOf(","));
		sql=sql.replace("*", ms2);
		System.out.println(sql);
		try {
			rs=st.executeQuery(sql);
			rsPrint();
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
	//		e.printStackTrace();
		}
	}

	@Override
	public void updata(String name1,String name2, String oldValue, String newValue) {
		// TODO 自动生成的方法存根
		if(!colType[getPoint(name1)].equals("int")&&!colType[getPoint(name1)].equals("float"))
			oldValue="'"+oldValue+"'";
		if(!colType[getPoint(name2)].equals("int")&&!colType[getPoint(name2)].equals("float"))
			newValue="'"+newValue+"'";
		sql="UPDATE "+tableName+" SET "+name2+" = "+newValue+" WHERE "+name1+" = "+oldValue;
		try {
			st.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}

	@Override
	public void delete(String name, String value) {
		// TODO 自动生成的方法存根
		if(!colType[getPoint(name)].equals("int")&&!colType[getPoint(name)].equals("float"))
			value="'"+value+"'";
		sql="DELETE FROM "+tableName+" WHERE "+name+" = "+value;
		try {
			st.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}

	@Override
	public void top(int n) {
		// TODO 自动生成的方法存根
		int p=1;
		try {
			p=rs.getRow();
			rs.first();
			do {
				--n;
				for(int i=0;i<col.length;++i)
					System.out.print(col[i]+": "+rs.getString(col[i])+"  ");
				System.out.println();
			}while(rs.next()&&n>0);
			rs.absolute(p);
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
	}

	@Override
	public void drop() {
		// TODO 自动生成的方法存根
		sql="DROP DATABASE" +tableName;
		try {
			st.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}

	@Override
	public void close() {
		// TODO 自动生成的方法存根
		try {
			ct.close();
			st.close();
			rs.close();
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}



}
