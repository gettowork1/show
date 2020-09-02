package Ser;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Bean.yonghu;
import Bean.zhuji;
import DBchuli.yonghuSert;
public class yhinsert extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doPost(request, response);
	}
	//用户的加入购物车
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=gb2312");
		PrintWriter out = response.getWriter();
		String id=request.getParameter("id");
		byte a[]=id.getBytes("iso-8859-1");
		id=new String(a,"gb2312");
		String pinpai=request.getParameter("pinpai");
		byte b[]=pinpai.getBytes("iso-8859-1");
		pinpai=new String(b,"gb2312");
		String price=request.getParameter("price");
		byte e[]=price.getBytes("iso-8859-1");
		price=new String(e,"gb2312");
		yonghuSert db=new yonghuSert();
	    boolean mark=db.insert(pinpai,price,id);
		if(mark==true){
			ArrayList<zhuji> zhujis=db.display();
			request.setAttribute("zhujis", zhujis);
			request.getRequestDispatcher("yhdisplay").forward(request, response);
	}
		out.print("enen");
	}
}
