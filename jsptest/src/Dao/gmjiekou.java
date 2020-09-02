package Dao;

import java.util.ArrayList;

import Bean.dingdan;
import Bean.zhuji;

public interface gmjiekou {
	public boolean delete(String id);//管理员删除商品
	public boolean update(String pingpai,String cpu,String xianka,String neicun,String guangqu,String price,String id); 
	//管理员修改订单
	public boolean insert(String pingpai,String cpu,String xianka,String neicun,String guangqu,String price,String id);
	//管理员上架商品
	public boolean dingdan(String totalprice,String ip,String date,String name);
	//管理员查看出来的订单
	public ArrayList<dingdan> dingdan();//订单的显示
	public boolean dingdandel(String id);//删除订单
}
