package org.sample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @EJB
    private Bar bar;

    public HelloServlet() {}

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<head><title>Hello World Servlet</title></head>");
        writer.println("<body>");
        writer.println("    <h3>Hello World from a Servlet!</h3>");
        writer.println("    <p><b>Bar Bean says</b>: " + bar.sayHello() + "</p>");
        writer.println("<body>");
        writer.println("</html>");
        writer.close();
    }

}
