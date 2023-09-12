package by.itAcademy.JD2.firstapp;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/hello_with_name")
public class HelloWithNameServlet extends HttpServlet {

    @Override
    public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/plain; charset=utf-8");

        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");

        PrintWriter writer = resp.getWriter();
        writer.write("Hello, " + firstName + " " + lastName +"!");
    }
}
