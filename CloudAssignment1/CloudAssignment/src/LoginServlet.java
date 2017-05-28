import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{
	private int employeecount; 
     @Override
    public void init(){
    	 employeecount = 0;
    }    
    @Override
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
    	String arr[] = request.getParameter("fullname").split(" ", 2);    	
    	String str1 = request.getParameter("phone").substring(0,4);
    	Random rand = new Random(); 
    	int value = rand.nextInt(50); 
    	employeecount=employeecount+1;
    	String referenceNumber=arr[0]+str1+value;    	
    	PrintWriter out=response.getWriter();    	
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Registration Servlet</title>");        
        out.println("</head>");
        out.println("<body>");
        out.println("<div style='background-color:LightSkyBlue;color:white;height:100px;padding:5px;text-align:center'>"); 
     
      out.println("<h2 style='color:white'>Job Portal Management System<h2>");            
        out.println("</div>");        
      out.println("<div style='color:black'>");       
      out.println("<table align='center' style='font-size:24px'>");
      out.println("<tr>");
        out.println("<th>User Details</th>");
        out.println("<tr>");
        out.println("<td>Full Name</td>");
        out.println("<td>");
        out.println(request.getParameter("fullname"));
        out.println("</td>");
        out.println("</tr>");
        out.println("<tr>");
        out.println("<td>Email</td>");
        out.println("<td>");
        out.println(request.getParameter("emailid"));
        out.println("</td>");
        out.println("</tr>");
        out.println("<tr>");
        out.println("<td>Linkedin URL</td>");
        out.println("<td>");
        out.println(request.getParameter("link"));
        out.println("</td>");
        out.println("</tr>");
        out.println("<tr>");
        out.println("<td>Phone Number</td>");
        out.println("<td>");
        out.println(request.getParameter("phone"));
        out.println("</td>");
        out.println("</tr>");
        out.println("<tr>");
        out.println("<td>Highest Degree</td>");
        out.println("<td>");
        out.println(request.getParameter("degree"));
        out.println("</td>");
        out.println("</tr>");
        out.println("<tr>");
        out.println("<td>Major</td>");
        out.println("<td>");
        out.println(request.getParameter("major"));
        out.println("</td>");
        out.println("</tr>");
        out.println("<tr>");
        out.println("<td>Graduation Date</td>");
        out.println("<td>");
        out.println(request.getParameter("grad"));
        out.println("</td>");
        out.println("</tr>");
        out.println("<tr>");
        out.println("<td>Desired Job Type</td>");
        out.println("<td>");
        out.println(request.getParameter("job"));
        out.println("</td>");
        out.println("</tr>");
        out.println("<tr>");
        out.println("<td>Desired Salary</td>");
        out.println("<td>");
        out.println(request.getParameter("salary"));
        out.println("</td>");
        out.println("</tr>");
        out.println("</table>");    
        
        out.println("<center>");
        out.println("<p style='color:black;font-size:24px'>Your Employee Reference Number is:");
        out.println(referenceNumber);  
        out.println("</p>");
        out.println("<p style='color:black;font-size:24px'>Number of people registered for Jobs are:");
        out.println(employeecount);  
        out.println("</p>");
        out.println("<p style='color:black;font-size:24px'>Thank you for registering");
        out.println("</p>");       
    	
    	out.println("<img src='employee.jpg' alt='Employee'>");
    	out.println("<p style='color:black;font-size:24px'>Click");
    	out.println("<A HREF ='website.html'>here</A>");
    	out.println("</p>");
    	out.println("</center>");    	
       out.println("</div>");       
        out.println("</body>");
        out.println("</html>");
        
    }
    @Override
    public void destroy(){
        
    }
}
