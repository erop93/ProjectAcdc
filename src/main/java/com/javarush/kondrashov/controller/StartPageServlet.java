package com.javarush.kondrashov.controller;

import com.javarush.kondrashov.entity.User;
import com.javarush.kondrashov.service.UserServiceInterface;
import com.javarush.kondrashov.service.UserService;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import static com.javarush.kondrashov.constants.Constants.*;

@WebServlet(value = {START_SERVLET, ROOT_SERVLET})
public class StartPageServlet extends HttpServlet {
    private final UserServiceInterface userService = UserService.getInstance();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher(START_JSP);
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

        resp.sendRedirect(QUEST_SERVLET);
    }
}
