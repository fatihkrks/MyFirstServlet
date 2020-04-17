package helloservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyFirstServlet extends HttpServlet {
	 
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("MyfirstServlet#doget");
		PrintWriter pw =resp.getWriter();
		String message="Helloservlet";
		LocalTime localTime=LocalTime.now();
		pw.print("<h1>" + localTime +"</h1>");
		pw.print("<h2>"+message+ "</h2>");
		  
	}
}

//HttpServlet sınıfını extends et
//HTTP GET,HTTP POST

