package com.example.statistic;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    static int rightHand = 0;
    static int leftHand = 0;
    static int count = 0;



    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.sendRedirect("index.jsp");
        /*response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>"); */
    }

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String answer = req.getParameter("question");


        if (answer.equals("right")){
            count++;
            rightHand++;
        }
        else if (answer.equals("left")){
            count++;
            leftHand++;
        }

        resp.sendRedirect("index.jsp");

    }

    public void destroy() {
    }
}