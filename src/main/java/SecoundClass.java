import javax.servlet.GenericServlet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class SecoundClass extends GenericServlet {
    @Override
    public void init(){
        System.out.println("My own Servlet ");
    }
    @Override
    public void service(ServletRequest req, ServletResponse resp) throws IOException {
        resp.setContentType("text/html");
        PrintWriter printWriter=resp.getWriter();
        printWriter.println("<h1>Hi this is my  secound servlet page</h1>");
        printWriter.println("<p>After creating </p>");
        printWriter.println("<h3>Helicopter</h3>");
    }
    @Override
    public void destroy(){
        System.out.println("My own servlet is getting distroy");
    }
}
