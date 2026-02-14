import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;

public class FirstClass extends GenericServlet {
    @Override
    public void init(){
        System.out.println("Servlet id started");
    }
    @Override
    public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        out.println("<h1>Hello from my first Servlet 🚀</h1>");
        out.println("<p>Tomcat is working!</p>");
        out.println("<p>hi i wam from Java file</p>");
    }
    @Override
    public void destroy() {
        System.out.println("Servlet is distroyed");
    }
}
