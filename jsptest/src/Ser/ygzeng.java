package Ser;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import DBchuli.totalSer;
public class ygzeng extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//�û��Ĺ���Ա�ĵ�¼��֤
		response.setContentType("text/html;charset=gb2312");
		PrintWriter out = response.getWriter();
		String status=request.getParameter("status1");//��ȡ�������ֵ
		String user=request.getParameter("name");
		String pwd=request.getParameter("mima");
		String dz=request.getParameter("dizhi");
		String dh=request.getParameter("dianhua");
		String yx=request.getParameter("youxiang");
		HttpSession	session=request.getSession();
		session.setAttribute("name", user);
		totalSer db=new totalSer();
		String dis="dis";
		if(status.equals("res")){	
		boolean mark=db.reg(user, pwd,dz,dh,yx);
		if(mark==true){
			response.sendRedirect("index.jsp");
		}
		else{
			response.sendRedirect("register.jsp");
		}
		}
		else if(status.equals("login")){
			boolean mark=db.login(user, pwd);
			if(mark==true){
			session=request.getSession();
			session.setAttribute("username", user);
			request.getRequestDispatcher("yhdisplay").forward(request, response);
			}
			else{
				out.print("<script language=javascript>alert('��¼���������µ�¼');window.location.href='../zhuji1/index.jsp';</script>");
			}
			}
		else if(status.equals("guanli")){
			boolean mark=db.guanli(user, pwd);
			if(mark==true){
	    	session=request.getSession();
			session.setAttribute("username", user);
			request.getRequestDispatcher("display").forward(request, response);
			}
			else {
				out.print("<script language=javascript>alert('�û��������ύ����');window.location.href='../zhuji1/guanliyuan.jsp';</script>");
			}
			out.flush();
			out.close();
	}
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doGet(request, response);
	}

}
