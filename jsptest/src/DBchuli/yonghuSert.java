package DBchuli;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Bean.gouwu;
import Bean.zhuji;
import Dao.yhjiekou;

public class yonghuSert implements yhjiekou {
	private String driverName = "com.mysql.jdbc.Driver"; 
	private String url="jdbc:mysql://localhost/gouwuche?user=root&password=&useUnicode=true&characterEncoding=gb2312";
	Connection con;
	Statement sta;
	PreparedStatement pst;
	ResultSet rs;
	boolean mark=false;
	
	public yonghuSert() {
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

	public ArrayList<zhuji> display() {
		ArrayList<zhuji> zhujis=new ArrayList<zhuji>();
		try {
			sta=con.createStatement();
			rs=sta.executeQuery("select * from zhuji");
			while(rs.next()){
				zhuji zhuji=new zhuji();
				zhuji.setId(rs.getString("id"));
				zhuji.setCpu(rs.getString("cpu"));
				zhuji.setPinpai(rs.getString("pingpai"));
				zhuji.setXianka(rs.getString("xianka"));
				zhuji.setNeicun(rs.getString("neicun"));
				zhuji.setPrice(rs.getString("price"));
				zhuji.setGuangqu(rs.getString("guangqu"));
				zhujis.add(zhuji);
			}
			sta.close();
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return zhujis;
	}
//查看购物车物品
  public ArrayList<gouwu> cha(){
		ArrayList<gouwu> gouwus=new ArrayList<gouwu>();
		try {
			sta=con.createStatement();
			rs=sta.executeQuery("select * from gouwu");
			while(rs.next()){
				gouwu gouwu=new gouwu();
				gouwu.setId(rs.getString("id"));
				gouwu.setPingpai(rs.getString("pinpai"));
				gouwu.setPrice(rs.getString("price"));
				gouwu.setBenshu(rs.getString("benshu"));
				gouwus.add(gouwu);
			}
			sta.close();
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return gouwus;
	}
  //加入购物车的方法
	public boolean insert(String pingpai,String price,String id) {		
		try {
			pst=con.prepareStatement("insert into gouwu values(?,?,?,?)");
			pst.setString(1, id);
			pst.setString(2, pingpai);
			pst.setString(3,price);
			pst.setString(4,"1");
			int temp=pst.executeUpdate();
			if(temp!=0){
				mark=true;	
			}
			pst.close();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		return mark;
	}
//用于用户修改购物篮
	public boolean update(String id,String price,String pinpai,String benshu) {
		
		try{
		pst=con.prepareStatement("update gouwu set pinpai=?,price=?,benshu=? where id=?");
		pst.setString(1, pinpai);
		pst.setString(2, price);
		pst.setString(3,benshu);
		pst.setString(4,id);
		int temp=pst.executeUpdate();
		if(temp!=0){
			mark=true;	
		}
		pst.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return mark;
	}
//用于用户删除购物篮
	public boolean delete(String id) {
	
		try {
			pst=con.prepareStatement("delete from gouwu where id=?");
			pst.setString(1, id);
			int temp=pst.executeUpdate();
			if(temp!=0){
				mark=true;	
			}
			pst.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mark;
	}
//用户查询，管理不用
	public ArrayList<zhuji> serch(String id) {	
		ArrayList<zhuji> zhujis=new ArrayList<zhuji>();
		try {
			pst=con.prepareStatement("select * from zhuji where id like ?");
			pst.setString(1, "%"+id+"%");
			rs=pst.executeQuery();
			while(rs.next()){
				zhuji zhuji=new zhuji();
				zhuji.setId(rs.getString("id"));
				zhuji.setPrice(rs.getString("price"));
				zhuji.setXianka(rs.getString("xianka"));
				zhuji.setNeicun(rs.getString("neicun"));
				zhuji.setPrice(rs.getString("guangqu"));
				zhuji.setId(rs.getString("pingpai"));
				zhuji.setPrice(rs.getString("cpu"));
				zhujis.add(zhuji);
			}
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return zhujis;
	}
	public ArrayList<zhuji> detail(String id){
		
		ArrayList<zhuji> zhujis=new ArrayList<zhuji>();
		try {
			pst=con.prepareStatement("select * from zhuji where id=?");
			pst.setString(1, id);
			rs=pst.executeQuery();
			while(rs.next()){
				zhuji zhuji=new zhuji();
				zhuji.setId(rs.getString("id"));
				zhuji.setPrice(rs.getString("price"));
				zhuji.setXianka(rs.getString("xianka"));
				zhuji.setNeicun(rs.getString("neicun"));
				zhuji.setPrice(rs.getString("guangqu"));
				zhuji.setId(rs.getString("pingpai"));
				zhuji.setPrice(rs.getString("cpu"));
				zhujis.add(zhuji);
			}
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return zhujis;
	}
}
