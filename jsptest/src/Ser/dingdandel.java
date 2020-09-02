package Ser;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Bean.dingdan;
import Bean.gouwu;
import DBchuli.gmSert;
import DBchuli.yonghuSert;

public class dingdandel extends HttpServlet {

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doPost(request, response);
	}
//¶©µ¥µÄÉ¾³ý
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=gb2312");
		PrintWriter out = response.getWriter();
		String ip=request.getParameter("ip");
		gmSert db=new gmSert();
		boolean mark=db.dingdandel(ip);
		if(mark==true){
			ArrayList<dingdan> dingdans=db.dingdan();
			request.setAttribute("dingdans",dingdans);
			request.getRequestDispatcher("/jsp/gmdingdan.jsp").forward(request, response);
	}
		else{
			out.print("eeee");
		}
		out.flush();
		out.close();
	}

}
