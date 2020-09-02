package DBchuli;
import java.sql.*;

import Dao.jiekou;

public class totalSer implements jiekou {
	private String driverName = "com.mysql.jdbc.Driver"; 
	private String url="jdbc:mysql://localhost/gouwuche?user=root&password=&useUnicode=true&characterEncoding=gb2312";
	Connection con;
	Statement sta;
	PreparedStatement pst;
	ResultSet rs;
	boolean mark=false;	
	public totalSer() {
		try {
			Class.forName(driverName);
			con=DriverManager.getConnection(url);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public boolean reg(String name,String mima,String dizhi,String dianhua,String youxiang){
		try {
			pst=con.prepareStatement("insert into yonghu values(?,?,?,?,?)");
			pst.setString(1, name);
			pst.setString(2, mima);
			pst.setString(3, dizhi);
			pst.setString(4, dianhua);
			pst.setString(5, youxiang);
			int temp=pst.executeUpdate();
			if(temp!=0){
				mark=true;	
			}
			pst.close();
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			return mark;
	}
	public boolean login(String name,String mima){
		try {
			pst=con.prepareStatement("select * from yonghu where name=? and mima=?");
			pst.setString(1, name);
			pst.setString(2, mima);
			rs=pst.executeQuery();
			while(rs.next()){
				mark=true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mark;
	}
	public boolean guanli(String name,String mima){
		try {
			pst=con.prepareStatement("select * from admin where name=? and mima=?");
			pst.setString(1, name);
			pst.setString(2, mima);
			rs=pst.executeQuery();
			while(rs.next()){
				mark=true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mark;
	}
}