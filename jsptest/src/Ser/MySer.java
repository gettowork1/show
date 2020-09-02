package Ser;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Bean.zhuji;
import DBchuli.gmSert;



public class MySer extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("gb2312");
		response.setContentType("text/html;charset=gb2312");
		PrintWriter out = response.getWriter();
		String status=request.getParameter("status");
		 zhuji stu=new zhuji();
		 gmSert db=new gmSert(); 
		 gmSert db1=new gmSert();
		 zhuji stu1=new zhuji();
	   
	if(status.equals("insert")){
		String id=request.getParameter("id");
		byte a[]=id.getBytes("iso-8859-1");
		id=new String(a,"gb2312");
		String name=request.getParameter("pinpai");
		byte b[]=name.getBytes("iso-8859-1");
		name=new String(b,"gb2312");
		String neicun=request.getParameter("neicun");
		byte c[]=neicun.getBytes("iso-8859-1");
		neicun=new String(c,"gb2312");
		String xianka=request.getParameter("xianka");
		byte d[]=xianka.getBytes("iso-8859-1");
		xianka=new String(d,"gb2312");
		String price=request.getParameter("price");
		byte e[]=price.getBytes("iso-8859-1");
		price=new String(e,"gb2312");
		String guangqu=request.getParameter("guangqu");
		byte f[]=guangqu.getBytes("iso-8859-1");
		guangqu=new String(f,"gb2312");
		String cpu=request.getParameter("cpu");
		byte g[]=cpu.getBytes("iso-8859-1");
		cpu=new String(g,"gb2312");
		boolean fl=db.insert(name,cpu,xianka,neicun,guangqu,price,id);
	    if(fl==true){
	    	 int currentPage=Integer.parseInt(request.getParameter("currentPage"));
				//更新session中的当前页
				request.getSession().setAttribute("currentPage", currentPage);
				 ArrayList<zhuji> zhujis=db.dis(currentPage);
			 request.setAttribute("zhujis",zhujis);
			 RequestDispatcher dispatcher=request.getRequestDispatcher("/jsp/guanlimain.jsp");
			 dispatcher.forward(request, response);
	    	return ;
	    }
	}
	   else if(status.equals("dis")){ 
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
			 return ;
		 }	 
	   else if(status.equals("delete")){
			String id=request.getParameter("id");
			System.out.println(id);
			 boolean fl=db.delete(id);
			 if(fl==true){
				 int currentPage=Integer.parseInt(request.getParameter("currentPage"));
					//更新session中的当前页
					request.getSession().setAttribute("currentPage",currentPage);
					 ArrayList<zhuji> zhujis=db.dis(currentPage);
				 request.setAttribute("zhujis",zhujis);
				 RequestDispatcher dispatcher=request.getRequestDispatcher("/jsp/guanlimain.jsp");
				 dispatcher.forward(request, response);
		    	return ;
		    }
	   }
	   else if(status.equals("update")){
			String id=request.getParameter("id");
			byte a[]=id.getBytes("iso-8859-1");
			id=new String(a,"gb2312");
			String pinpai=request.getParameter("pinpai");
			byte b[]=pinpai.getBytes("iso-8859-1");
			pinpai=new String(b,"gb2312");
			String neicun=request.getParameter("neicun");
			byte c[]=neicun.getBytes("iso-8859-1");
			neicun=new String(c,"gb2312");
			String xianka=request.getParameter("xianka");
			byte d[]=xianka.getBytes("iso-8859-1");
			xianka=new String(d,"gb2312");
			String price=request.getParameter("price");
			byte e[]=price.getBytes("iso-8859-1");
			price=new String(e,"gb2312");
			String guangqu=request.getParameter("guangqu");
			byte f[]=guangqu.getBytes("iso-8859-1");
			guangqu=new String(f,"gb2312");
			String cpu=request.getParameter("cpu");
			byte g[]=cpu.getBytes("iso-8859-1");
			cpu=new String(g,"gb2312");
			boolean fl=db.update(pinpai,cpu,xianka,neicun,guangqu,price,id);
		    if(fl==true){
		    	 int currentPage=Integer.parseInt(request.getParameter("currentPage"));
					//更新session中的当前页
					request.getSession().setAttribute("currentPage", currentPage);
					 ArrayList<zhuji> zhujis=db.dis(currentPage);
				 request.setAttribute("zhujis", zhujis);
				 RequestDispatcher dispatcher=request.getRequestDispatcher("/jsp/guanlimain.jsp");
				 dispatcher.forward(request, response);
		    	return ;
		    }
		}
	
		 out.flush();
			out.close();
	}
	

}