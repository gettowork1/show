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


public class gouwudel extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doPost(request, response);
	}
//用户删除商品理的购物单
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=gb2312");
		PrintWriter out = response.getWriter();
		String id=request.getParameter("id");
		byte a[]=id.getBytes("iso-8859-1");
		id=new String(a,"gb2312");
		yonghuSert db=new yonghuSert();
		boolean mark=db.delete(id);
		if(mark==true){
			ArrayList<gouwu> gouwus=db.cha();
			request.setAttribute("gouwus",gouwus);
			request.getRequestDispatcher("/jsp/yhgouwulan.jsp").forward(request, response);
	}
		out.flush();
		out.close();
	}
}
