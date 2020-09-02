package Ser;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Bean.zhuji;
import DBchuli.yonghuSert;
public class search extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doPost(request, response);
	}
	//查询商品的ID
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=gb2312");	
		String id=request.getParameter("id");
		byte b[]=id.getBytes("iso-8859-1");
		id=new String(b,"gb2312");	
		yonghuSert db=new yonghuSert();
		ArrayList<zhuji> zhujis=db.serch(id);
		if(zhujis!=null){
			request.setAttribute("zhujis", zhujis);
			request.getRequestDispatcher("/jsp/main.jsp").forward(request, response);
		}
	}

}
