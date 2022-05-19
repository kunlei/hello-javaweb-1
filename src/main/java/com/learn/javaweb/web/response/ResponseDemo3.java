package com.learn.javaweb.web.response;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ResponseDemo3", value = "/ResponseDemo3")
public class ResponseDemo3 extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    response.setContentType("text/html;charset=utf-8");
    PrintWriter writer = response.getWriter();
    response.setHeader("content-type", "text/html");
    writer.write("aaa");
    writer.write("<h1>bbb</h1>");
  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

  }
}
