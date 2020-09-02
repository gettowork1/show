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


public class gmdel extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doPost(request, response);
	}
//管理员删除商品
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=gb2312");
		PrintWriter out = response.getWriter();
		String id=request.getParameter("id");
		gmSert db=new gmSert();
		boolean mark=db.delete(id);
		if(mark==true){
			ArrayList<zhuji> zhujis=db.display();
			request.setAttribute("zhujis", zhujis);
			request.getRequestDispatcher("/jsp/guanlimain.jsp").forward(request, response);
	}
		out.flush();
		out.close();
	}
}
