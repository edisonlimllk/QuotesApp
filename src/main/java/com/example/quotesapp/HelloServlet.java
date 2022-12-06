package com.example.quotesapp;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;
//    private String quotes;
    public void init() {
        message = "Featured Quotes of the Day!";
//        quotes = "An apple a day, keeps the doctor away.";
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
                "                <li><a href=\"index.jsp\" class=\"nav-link px-2 text-white\">Home</a></li>\n" +
                "                <li><a href=\"#\" class=\"nav-link px-2 text-secondary\">Features</a></li>\n" +
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
        out.println("<div class=\"bg-dark text-secondary px-4 py-5 text-center\">\n" +
                "        <h1 class=\"display-5 fw-bold text-white\">"+ message +"</h1>\n" +
                "</div>");
        out.println("<div class=\"card\">\n" +
                "  <div class=\"card-header\">\n" +
                "    Featured\n" +
                "  </div>\n" +
                "  <div class=\"card-body\">\n" +
                "    <h5 class=\"card-title\">Joseph Conrad</h5>\n" +
                "    <p class=\"card-text\">The belief in a supernatural source of evil is not necessary. Men alone are quite capable of every wickedness.</p>\n" +
                "  </div>\n" +
                "</div>" + "<div class=\"card\">\n" +
                        "  <div class=\"card-header\">\n" +
                        "  </div>\n" +
                        "  <div class=\"card-body\">\n" +
                        "    <h5 class=\"card-title\">Winston Churchill</h5>\n" +
                        "    <p class=\"card-text\">The farther backward you can look, the farther forward you can see.</p>\n" +
                        "  </div>\n" +
                        "</div>" + "<div class=\"card\">\n" +
                        "  <div class=\"card-header\">\n" +
                        "  </div>\n" +
                        "  <div class=\"card-body\">\n" +
                        "    <h5 class=\"card-title\">Samuel Beckett</h5>\n" +
                        "    <p class=\"card-text\">Try again, fail again. Fail better.</p>\n" +
                        "  </div>\n" +
                        "</div>" +
                        "</div>" + "<div class=\"card\">\n" +
                        "  <div class=\"card-header\">\n" +
                        "  </div>\n" +
                        "  <div class=\"card-body\">\n" +
                        "    <h5 class=\"card-title\">Albert Einstein</h5>\n" +
                        "    <p class=\"card-text\">Imagination is more important than knowledge. Knowledge is limited. Imagination encircles the world.</p>\n" +
                        "  </div>\n" +
                        "</div>" +
                        "</div>" + "<div class=\"card\">\n" +
                        "  <div class=\"card-header\">\n" +
                        "  </div>\n" +
                        "  <div class=\"card-body\">\n" +
                        "    <h5 class=\"card-title\">Rose Kennedy</h5>\n" +
                        "    <p class=\"card-text\">Birds sing after a storm. Why shouldn't people feel as free to delight in whatever sunlight remains to them?</p>\n" +
                        "  </div>\n" +
                        "</div>" +
                        "</div>" + "<div class=\"card\">\n" +
                        "  <div class=\"card-header\">\n" +
                        "  </div>\n" +
                        "  <div class=\"card-body\">\n" +
                        "    <h5 class=\"card-title\">William Shakespeare</h5>\n" +
                        "    <p class=\"card-text\">Nothing is so common as the wish to be remarkable.</p>\n" +
                        "  </div>\n" +
                        "</div>"
                );
        out.println("</body></html>");
        out.println ("<footer class=\"footer mt-auto py-3 bg-light\">\n" +
                "    <div class=\"container\">\n" +
                "        <span class=\"text-muted\">DevOps Group Assignment Part 1 | 2022 | All Rights Reserved</span>\n" +
                "    </div>\n" +
                "</footer>");

    }

    public void destroy() {
    }
}