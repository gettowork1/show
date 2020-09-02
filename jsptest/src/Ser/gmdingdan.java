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
import DBchuli.yonghuSert;

public class gmdingdan extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
//管理员查看订单的Servelet
   response.setContentType("text/html;charset=gb2312");
   PrintWriter out = response.getWriter();
   gmSert db=new gmSert();
   ArrayList<dingdan> dingdans=db.dingdan();
   request.setAttribute("dingdans",dingdans);
   System.out.println(dingdans.size()+"----");
   request.getRequestDispatcher("/jsp/gmdingdan.jsp").forward(request, response);
}

      public void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
     this.doGet(request, response);
}
}
