package Ser;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Bean.dingdan;
import Bean.zhuji;
import DBchuli.gmSert;

public class Gmchangestatus extends HttpServlet {

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
		gmSert db=new gmSert();
		boolean mark=db.dingdanudp(id);
		if(mark==true){
			ArrayList<dingdan> dingdans=db.dingdan();
			request.setAttribute("dingdans", dingdans);
			request.getRequestDispatcher("/jsp/gmdingdan.jsp").forward(request, response);
	}
		out.print("enen");
	}
}

