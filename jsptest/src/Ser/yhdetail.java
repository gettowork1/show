package Ser;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Bean.zhuji;
import DBchuli.gmSert;
import DBchuli.yonghuSert;

public class yhdetail extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}
//显示查看详细信息
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		   response.setContentType("text/html;charset=gb2312");
		   PrintWriter out = response.getWriter();
		   String id=request.getParameter("id");
			byte a[]=id.getBytes("iso-8859-1");
			id=new String(a,"gb2312");
			HttpSession	session=request.getSession();
			session.setAttribute("id", id);
		   yonghuSert db=new yonghuSert();
			ArrayList<zhuji> zhujis=db.detail(id);
			if(zhujis!=null)
			{
			request.setAttribute("zhujis", zhujis);
			request.getRequestDispatcher("/jsp/gouwudetail.jsp").forward(request, response);
			}
		out.flush();
		out.close();
	}
}
