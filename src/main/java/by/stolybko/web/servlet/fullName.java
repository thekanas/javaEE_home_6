package by.stolybko.web.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/fullName")
public class fullName extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        String fullNameAttribute = (String) session.getAttribute("fullNameAttribute");

        try (PrintWriter writer = resp.getWriter()) {

            writer.println("<h1>Hello, " + fullNameAttribute + "</h1>");
        }
    }
}
