package ru.ibs.servlet_demo.servlets;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;

public class GreetingsServlet extends HttpServlet{
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException{
        response.setContentType("index/html");
        try(PrintWriter writer = response.getWriter()){
            writer.println("<h2>\"Hello, from servlet!\"</h2>");
        }
    }
}
