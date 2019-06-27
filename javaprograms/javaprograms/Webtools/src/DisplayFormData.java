import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;


public class DisplayFormData extends HttpServlet{

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{

        response.setContentType("text/html");
        PrintWriter out= response.getWriter();

        String name= request.getParameter("Name");
        String nuid= request.getParameter("NUID");
        String sem= request.getParameter("Semester");

        String doctype= "<!DOCTYPE html>" + "<html><head><title>" + "Form data input by user" + "</title></head>";

        out.println("Name: "+ name+ "<br/>");
        out.println("NUID: "+ nuid+ "<br/>");
        out.println("Semester: "+ sem+ "<br/>");

        out.println("Courses: ");
        for(String s: request.getParameterValues("Courses")){

            out.println(s+",");
        }

        out.println(
                "</body>"+
                        "</html>");


    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

        doGet(request, response);
    }

}