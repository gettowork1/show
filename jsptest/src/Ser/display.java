package Ser;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Bean.zhuji;
import DBchuli.gmSert;
public class display extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//显示商品的跳转页面
		response.setContentType("text/html;charset=gb2312");
		PrintWriter out = response.getWriter();
		gmSert db1=new gmSert();
		gmSert db=new gmSert();
		   int currentPage=Integer.parseInt(request.getParameter("currentPage"));
				//更新session中的当前页
				request.getSession().setAttribute("currentPage", currentPage);
				int countPage=db.countPage();
				request.getSession().setAttribute("countPage", countPage);
				 ArrayList<zhuji> zhujis=db1.dis1(currentPage);
				 request.setAttribute("zhujis", zhujis);
				 System.out.println("++++++++++"+zhujis.size());
				 RequestDispatcher dispatcher=request.getRequestDispatcher("/jsp/guanlimain.jsp");
				 dispatcher.forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	this.doGet(request, response);
	}

}
