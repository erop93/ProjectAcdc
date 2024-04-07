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

import static com.javarush.kondrashov.constants.Constants.*;

@WebServlet(QUEST_SERVLET)
public class QuestServlet extends HttpServlet {
    private final Service userService = UserService.getInstance();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher(QUEST_JSP);
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        long id = (long) session.getAttribute("id");
        User user = userService.get(id).get();
        int answer = Integer.parseInt(req.getParameter("answer"));

        if (answer == 1) {
            user.levelUp();
            if (user.getScore() > 2) {
                resp.sendRedirect(WIN_SERVLET);
            } else {
                session.setAttribute("score", user.getScore());
                resp.sendRedirect(QUEST_SERVLET);
            }
        } else if (answer == 0) {
            session.removeAttribute("score");
            resp.sendRedirect(LOSE_SERVLET);
        } else {
            resp.sendRedirect(QUEST_SERVLET);
        }
    }
}
