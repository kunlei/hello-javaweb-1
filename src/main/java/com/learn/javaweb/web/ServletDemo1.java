package com.learn.javaweb.web;

import com.learn.javaweb.pojo.Brand;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/demo1")
public class ServletDemo1 extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
    throws ServletException, IOException {
    // prepare data
    List<Brand> brands = new ArrayList<>();
    brands.add(new Brand(1, "aaa", "aaa", 1, "aaa", 1));
    brands.add(new Brand(2, "bbb", "bbb", 2, "bbb", 0));
    brands.add(new Brand(3, "ccc", "ccc", 10, "ccc", 1));

    // save data to request
    req.setAttribute("brands", brands);
    req.setAttribute("status", 1);

    // redirect
//    req.getRequestDispatcher("/el-demo.jsp").forward(req, resp);
//    req.getRequestDispatcher("/jstl-if.jsp").forward(req, resp);
    req.getRequestDispatcher("/jstl-foreach.jsp").forward(req, resp);

  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp)
    throws ServletException, IOException {


  }
}
