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
import DBchuli.yonghuSert;

public class yhdisplay extends HttpServlet {
//用户界面的显示
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {

   response.setContentType("text/html;charset=gb2312");
   PrintWriter out = response.getWriter();
   yonghuSert db=new yonghuSert();
   ArrayList<zhuji> zhujis=db.display();
   request.setAttribute("zhujis", zhujis);
   System.out.println(zhujis.size()+"----");
   request.getRequestDispatcher("/jsp/main.jsp").forward(request, response);
}

      public void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
     this.doGet(request, response);
}
    
}
