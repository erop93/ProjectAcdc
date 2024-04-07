package com.javarush.kondrashov.controller;

import com.javarush.kondrashov.entity.User;
import com.javarush.kondrashov.service.Service;
import com.javarush.kondrashov.service.UserService;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.stream.BaseStream;

@WebServlet(value = {"/start", "/"})
public class StartPageServlet extends HttpServlet {
    private final Service userService = UserService.getInstance();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("WEB-INF/start.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();

        String name = req.getParameter("name");
        String ip = req.getRemoteAddr();

        User newUser = new User(name, ip);
        userService.create(newUser);

        session.setAttribute("ip", ip);
        session.setAttribute("name", name);
        session.setAttribute("id", newUser.getId());
        session.setAttribute("score", newUser.getScore());

        resp.sendRedirect("/quest");
    }
}
