package Dao;

import java.util.ArrayList;

import Bean.zhuji;

public interface yhjiekou {
	public ArrayList<zhuji> display();//用户挑选商品
	public boolean insert(String pingpai,String price,String id);  //用户进行挑选购物的东西
	public boolean delete(String id);//用户不想要这个商品
	public ArrayList<zhuji> serch(String id);//查询商品
	public ArrayList<zhuji> detail(String id);//用户查看商品详细信息
}
