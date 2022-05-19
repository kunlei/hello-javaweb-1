package com.learn.javaweb.web.request;

import java.io.BufferedReader;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/req")
public class RequestDemo extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
    throws ServletException, IOException {
    // get moethod
    String method = req.getMethod();
    System.out.println(method);

    String contextPath = req.getContextPath();
    System.out.println(contextPath);

    StringBuffer requestURL = req.getRequestURL();
    System.out.println(requestURL.toString());

    String uri = req.getRequestURI();
    System.out.println(uri);

    String queryString = req.getQueryString();
    System.out.println(queryString);

    // get headers
    String agent = req.getHeader("user-agent");
    System.out.println("agent: " + agent);
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp)
    throws ServletException, IOException {
    BufferedReader reader = req.getReader();
    String line = reader.readLine();
    System.out.println(line);
  }
}
