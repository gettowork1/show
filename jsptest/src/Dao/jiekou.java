package Dao;
public interface jiekou {
	public boolean reg(String name,String mima,String dizhi,String dianhua,String youxiang);//注册用户
	public boolean login(String name,String mima);//登录用户
	public boolean guanli(String name,String mima);//管理员验证
}
