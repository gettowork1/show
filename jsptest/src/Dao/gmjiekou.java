package Dao;

import java.util.ArrayList;

import Bean.dingdan;
import Bean.zhuji;

public interface gmjiekou {
	public boolean delete(String id);//����Աɾ����Ʒ
	public boolean update(String pingpai,String cpu,String xianka,String neicun,String guangqu,String price,String id); 
	//����Ա�޸Ķ���
	public boolean insert(String pingpai,String cpu,String xianka,String neicun,String guangqu,String price,String id);
	//����Ա�ϼ���Ʒ
	public boolean dingdan(String totalprice,String ip,String date,String name);
	//����Ա�鿴�����Ķ���
	public ArrayList<dingdan> dingdan();//��������ʾ
	public boolean dingdandel(String id);//ɾ������
}
