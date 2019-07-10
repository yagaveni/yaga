package com.harry;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/sq")
public class ServletToServlet extends HttpServlet{

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException{
		
		
		int k=0;
		Cookie cookies[]=req.getCookies();
		
		for(Cookie c:cookies){
			if(c.getName().equals("k")){
				k=Integer.parseInt(c.getValue());
				
				
			}
		}
		k=k*k;
		PrintWriter out=res.getWriter();
		//out.print("<html><body bgcolor=red>");
		out.println("square value : "+k);
		//out.println("</body></html>");
		//Session
		//HttpSession session=req.getSession();
		//int k=(int)session.getAttribute("k");
		
		//helps to remove session attribute
		//req.removeAttribute("k");
		
		
		//Passing url overwrite
		//int k=Integer.parseInt(req.getParameter("k"));
		
		System.out.println("sq called");
		/*int k=(int)req.getAttribute("k");
		k=k*k;
		
		PrintWriter out=res.getWriter();
		out.println("square value : "+k);*/
	}
}
