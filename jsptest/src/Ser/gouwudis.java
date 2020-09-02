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
public class gouwudis extends HttpServlet {
//购物篮显示方法
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=gb2312");
		PrintWriter out = response.getWriter();
		yonghuSert db=new yonghuSert();
		ArrayList<gouwu> gouwus=db.cha();
		request.setAttribute("gouwus", gouwus);
		System.out.println(gouwus.size()+"----");
		request.getRequestDispatcher("/jsp/yhgouwulan.jsp").forward(request,response);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	this.doGet(request, response);
	}

}
