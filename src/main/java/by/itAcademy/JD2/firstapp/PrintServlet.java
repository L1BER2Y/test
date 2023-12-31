package by.itAcademy.JD2.firstapp;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "PrintServlet", urlPatterns = "/print")
public class PrintServlet extends HttpServlet {
    private String PARAMS_FOR_NAMES = "name";
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=utf-8");
        PrintWriter writer = resp.getWriter();

        String[] names = req.getParameterMap().get(PARAMS_FOR_NAMES);

        if (names != null) {
            for (String name: names) {
                writer.write("<p>" + PARAMS_FOR_NAMES + ": " + name + "</p>");
            }
        }
    }
}
