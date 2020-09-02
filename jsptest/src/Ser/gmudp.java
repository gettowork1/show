package Ser;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Bean.zhuji;
import DBchuli.gmSert;
public class gmudp extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doPost(request, response);
	}
	//管理员更新商品信息
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
		String neicun=request.getParameter("neicun");
		byte c[]=neicun.getBytes("iso-8859-1");
		neicun=new String(c,"gb2312");
		String xianka=request.getParameter("xianka");
		byte d[]=xianka.getBytes("iso-8859-1");
		xianka=new String(d,"gb2312");
		String price=request.getParameter("price");
		byte e[]=price.getBytes("iso-8859-1");
		price=new String(e,"gb2312");
		String guangqu=request.getParameter("guangqu");
		byte f[]=guangqu.getBytes("iso-8859-1");
		guangqu=new String(f,"gb2312");
		String cpu=request.getParameter("cpu");
		byte g[]=cpu.getBytes("iso-8859-1");
		cpu=new String(g,"gb2312");
		gmSert db=new gmSert();
		boolean mark=db.update(pinpai,cpu,xianka,neicun,guangqu,price,id);
		if(mark==true){
			ArrayList<zhuji> zhujis=db.display();
			request.setAttribute("zhujis", zhujis);
			request.getRequestDispatcher("/jsp/guanlimain.jsp").forward(request, response);
	}
		out.print("enen");
	}
}
