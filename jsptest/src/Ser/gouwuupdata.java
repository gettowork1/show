package Ser;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Bean.gouwu;
import Bean.zhuji;
import DBchuli.gmSert;
import DBchuli.yonghuSert;
public class gouwuupdata extends HttpServlet {
//购物篮更新件数
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doPost(request, response);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=gb2312");
		PrintWriter out = response.getWriter();
		String id=request.getParameter("id");
		byte a[]=id.getBytes("iso-8859-1");
		id=new String(a,"gb2312");
		String price=request.getParameter("price");
		byte e[]=price.getBytes("iso-8859-1");
		id=new String(e,"gb2312");
		String pinpai=request.getParameter("pinpai");
		byte b[]=pinpai.getBytes("iso-8859-1");
		pinpai=new String(b,"gb2312");
		String benshu=request.getParameter("benshu");
		byte c[]=benshu.getBytes("iso-8859-1");
		benshu=new String(c,"gb2312");
		yonghuSert db=new yonghuSert();
		boolean mark=db.update(id,price,pinpai,benshu);
		if(mark!=true){
	
			request.getRequestDispatcher("gouwudis").forward(request, response);
	}
		out.print("enen");
	}
}
