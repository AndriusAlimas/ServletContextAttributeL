package com.example.servlet;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class MyServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, 
			HttpServletResponse response)throws ServletException,IOException{
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        ServletContext sc = this.getServletContext();
        // go this thread to sleep, to see in action in slow motion:
        sleep();
        // simple servlet context global attribute set in code, not receive,
        // you will not see anything in browser, just look console for result
        // this will call event attributeAdded:
        sc.setAttribute("CompanyName", "Next");
        sleep();
        // this will call event attributeReplaced:
        sc.setAttribute("CompanyName", "Asda");
        sleep();
        // this will call event attributeRemoved:
        sc.setAttribute("CompanyName", null);
	}
	// method to put thread sleep :
	 private void sleep() {
	        try {
	            Thread.sleep(9000);
	        }
	        catch (InterruptedException ex) {
	            ex.printStackTrace();
	        }
	    }
}
