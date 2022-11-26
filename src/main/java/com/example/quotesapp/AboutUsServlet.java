package com.example.quotesapp;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet(name = "aboutUsServlet", value = "/aboutUs-servlet")
public class AboutUsServlet extends HttpServlet{
    private String AboutUs;
    public void init() {
        AboutUs = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. ";
    }
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + AboutUs + "</h1>");
        out.println("</body></html>");
    }
    public void destroy() {
    }
}
