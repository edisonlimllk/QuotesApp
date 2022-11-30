package com.example.quotesapp;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;
    private String quotes;

    public void init() {
        message = "QuotesApp Devops Assignment";
        quotes = "An apple a day, keeps the doctor away.";
    }



    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<head>\n" +
                "    <title>QOTD</title>\n" +
                "    <link rel=\"stylesheet\" href=\"./css/bootstrap.min.css\">\n" +
                "    <script src=\"./js/bootstrap.min.js\"></script>\n" +
                "</head>");
        out.println("<html><body>");
        out.println("<header class=\"p-3 bg-dark text-white\">\n" +
                "    <div class=\"container\">\n" +
                "        <div class=\"d-flex flex-wrap align-items-center justify-content-center justify-content-lg-start\">\n" +
                "            <ul class=\"nav col-12 col-lg-auto me-lg-auto mb-2 justify-content-center mb-md-0\">\n" +
                "                <li><a href=\"#\" class=\"nav-link px-2 text-secondary\">Home</a></li>\n" +
                "                <li><a href=\"#\" class=\"nav-link px-2 text-white\">Features</a></li>\n" +
                "                <li><a href=\"#\" class=\"nav-link px-2 text-white\">Pricing</a></li>\n" +
                "                <li><a href=\"#\" class=\"nav-link px-2 text-white\">FAQs</a></li>\n" +
                "                <li><a href=\"#\" class=\"nav-link px-2 text-white\">About</a></li>\n" +
                "            </ul>\n" +
                "\n" +
                "            <form class=\"col-12 col-lg-auto mb-3 mb-lg-0 me-lg-3\">\n" +
                "                <input type=\"search\" class=\"form-control form-control-dark\" placeholder=\"Search...\" aria-label=\"Search\">\n" +
                "            </form>\n" +
                "\n" +
                "            <div class=\"text-end\">\n" +
                "                <button type=\"button\" class=\"btn btn-outline-light me-2\">Login</button>\n" +
                "                <button type=\"button\" class=\"btn btn-warning\">Sign-up</button>\n" +
                "            </div>\n" +
                "        </div>\n" +
                "    </div>\n" +
                "</header>");
        out.println("<h1>" + message + "</h1>");
        out.println("<h2>" + quotes + "</h2>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}