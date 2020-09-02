package DBchuli;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Bean.dingdan;
import Bean.zhuji;
import Dao.gmjiekou;

public class gmSert implements gmjiekou {
	private String driverName = "com.mysql.jdbc.Driver"; 
	private String url="jdbc:mysql://localhost/gouwuche?user=root&password=&useUnicode=true&characterEncoding=gb2312";
	Connection con;
	Statement sta;
	PreparedStatement pst;
	ResultSet rs;
	boolean mark=false;
	int i=1;
	int size=5;
	public gmSert() {
		try {
			Class.forName(driverName);
			con=DriverManager.getConnection(url);
			i++;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public int countPage(){
		int countPage=0;   //存储总页数
		try {
			pst = con.prepareStatement("SELECT COUNT(*) total FROM zhuji ");
			rs=pst.executeQuery();
			if(rs.next()){
				//表达式 ? 值 :值
				int total=rs.getInt("total");
				countPage=total%size==0?total/5:total/5+1;
				System.out.println("+++++"+countPage);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
		return countPage;
	}
public ArrayList<zhuji> dis( int currentPage){
		ArrayList<zhuji> zhujis=new ArrayList<zhuji>();
		try {
			sta=con.createStatement();
			rs=sta.executeQuery("select * from zhuji limit "+(currentPage-1)*size+","+size);
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
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return zhujis;
	}
public ArrayList<zhuji> dis1( int currentPage){
	ArrayList<zhuji> zhujis=new ArrayList<zhuji>();
	try {
		sta=con.createStatement();
		rs=sta.executeQuery("select * from zhuji limit "+(currentPage-1)*size+","+size);
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
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return zhujis;
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
   public ArrayList<dingdan> dingdan() {
		
		ArrayList<dingdan> dingdans=new ArrayList<dingdan>();
		try {
			sta=con.createStatement();
			rs=sta.executeQuery("select * from dingdan");
			while(rs.next()){
				dingdan dingdan=new dingdan();
				dingdan.setId(rs.getString("id"));
				dingdan.setName(rs.getString("name"));
				dingdan.setTotalprice(rs.getString("totalprice"));
				dingdan.setDate(rs.getString("date"));
				dingdan.setIp(rs.getString("ip"));
				dingdan.setDingdan(rs.getString("status"));
				dingdans.add(dingdan);
			}
			sta.close();
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dingdans;
	}
   public  boolean dingdanudp(String id){
	   try{
		   pst=con.prepareStatement("update dingdan set status=? where id=?");
		   pst.setString(1,"已发货");
		   pst.setString(2, id);
		   int temp=pst.executeUpdate();
		   if(temp!=0){
			   mark=true;
		   }
		   
	   }
	   catch (SQLException e) {
			e.printStackTrace();
		}
	   return mark;
   }
	public boolean insert(String pingpai,String cpu,String xianka,String neicun,String guangqu,String price,String id) {
		
		
		try {
			pst=con.prepareStatement("insert into zhuji values(?,?,?,?,?,?,?)");
			pst.setString(1, pingpai);
			pst.setString(2, cpu);
			pst.setString(3,xianka);
			pst.setString(4,neicun);
			pst.setString(5,guangqu);
			pst.setString(6,price);
			pst.setString(7,id);
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

	public boolean update(String pingpai,String cpu,String xianka,String neicun,String guangqu,String price,String id) {
		
		try{
		pst=con.prepareStatement("update zhuji set pingpai=?,cpu=?,xianka=?,neicun=?,guangqu=?,price=? where id=?");
		pst.setString(1, pingpai);
		pst.setString(2, cpu);
		pst.setString(3,xianka);
		pst.setString(4,neicun);
		pst.setString(5,guangqu);
		pst.setString(6,price);
		pst.setString(7,id);
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

	public boolean delete(String id) {
	
		try {
			pst=con.prepareStatement("delete from zhuji where id=?");
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
public boolean dingdan(String totalprice,String ip,String date,String name){
	try {
		pst=con.prepareStatement("insert into dingdan values(?,?,?,?,?,?)");
		pst.setInt(1,i);
		pst.setString(2, name);
		pst.setString(3,totalprice);
		pst.setString(4,date);
		pst.setString(5,ip);
		pst.setString(6,"未交货");
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
public boolean dingdandel(String ip) {
	try {
		pst=con.prepareStatement("delete from dingdan where ip=?");
		pst.setString(1, ip);
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
}
