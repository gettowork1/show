package Ser;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class filter extends HttpServlet implements Filter{
	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain arg2) throws IOException, ServletException {
		// 过滤未登未用户
		arg1.setContentType("text/html;charset=gb2312");
		HttpSession session=((HttpServletRequest)arg0).getSession();
		if(session.getAttribute("name")==null){
			PrintWriter out=arg1.getWriter();
			out.print("<script language=javascript>alert('您还没有登录');window.location.href='../index.jsp';</script>");
		}
		else{
			arg2.doFilter(arg0, arg1);
		}
		
	}
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
