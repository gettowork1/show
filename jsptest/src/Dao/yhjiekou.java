package Dao;

import java.util.ArrayList;

import Bean.zhuji;

public interface yhjiekou {
	public ArrayList<zhuji> display();//�û���ѡ��Ʒ
	public boolean insert(String pingpai,String price,String id);  //�û�������ѡ����Ķ���
	public boolean delete(String id);//�û�����Ҫ�����Ʒ
	public ArrayList<zhuji> serch(String id);//��ѯ��Ʒ
	public ArrayList<zhuji> detail(String id);//�û��鿴��Ʒ��ϸ��Ϣ
}
