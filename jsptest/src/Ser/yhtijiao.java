package Ser;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Bean.zhuji;
import DBchuli.gmSert;

import com.sun.jmx.snmp.Timestamp;

public class yhtijiao extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
     this.doPost(request, response);
	}
//用户提交订单界面
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=gb2312");
		PrintWriter out = response.getWriter();
		java.text.SimpleDateFormat formatter=new java.text.SimpleDateFormat();
		java.util.Date currentTime=new java.util.Date();
		HttpSession	session=request.getSession();
		String name=(String)session.getAttribute("username");
		String totalprice=request.getParameter("pricetotal");
		byte c[]=totalprice.getBytes("iso-8859-1");
		totalprice=new String(c,"gb2312");
		String ip=request.getRemoteAddr();
		String date=formatter.format(currentTime);
		gmSert db=new gmSert();
		boolean mark=db.dingdan(totalprice,ip,date,name);
		if(mark==true){
			out.print("<script language=javascript>alert('提交成功，感谢您此次购物');window.location.href='../zhuji1/index.jsp';</script>");
			
	}
		out.flush();
		out.close();
	}
	}
