package org.example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/search")
public class search extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("utf-8");
        req.setCharacterEncoding("utf-8");
        String name = req.getParameter("name");
        System.out.println("name:"+name);
        req.setAttribute("name",name);
        index index=new index();
        try {
            String result=index.test2(name);
            req.setAttribute("result",result);
        } catch (Exception e) {
            e.printStackTrace();
        }
        req.getRequestDispatcher("result.jsp").forward(req, resp);
    }
}