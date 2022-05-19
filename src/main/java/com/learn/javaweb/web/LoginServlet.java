package com.learn.javaweb.web;

import com.learn.javaweb.mapper.UserMapper;
import com.learn.javaweb.pojo.User;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    // take in username and password
    String username = request.getParameter("username");
    String password = request.getParameter("password");

    // invoke mybatis
    String resource = "mybatis-config.xml";
    InputStream inputStream = Resources.getResourceAsStream(resource);
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

    // acquire session
    SqlSession sqlSession = sqlSessionFactory.openSession();

    // acquire mapper
    UserMapper usermapper = sqlSession.getMapper(UserMapper.class);

    // call function
    User user = usermapper.select(username, password);

    // release resource
    sqlSession.close();

    response.setContentType("text/html;charset=utf-8");
    PrintWriter writer = response.getWriter();
    // check user
    if (user == null) {
      // login failed
      writer.write("Login failed.");
    } else {
      // login success
      writer.write("Login success");
    }
  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
// take in username and password
    String username = request.getParameter("username");
    String password = request.getParameter("password");

    // invoke mybatis
    String resource = "mybatis-config.xml";
    InputStream inputStream = Resources.getResourceAsStream(resource);
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

    // acquire session
    SqlSession sqlSession = sqlSessionFactory.openSession();

    // acquire mapper
    UserMapper usermapper = sqlSession.getMapper(UserMapper.class);

    // call function
    User user = usermapper.select(username, password);

    // release resource
    sqlSession.close();

    response.setContentType("text/html;charset=utf-8");
    PrintWriter writer = response.getWriter();
    // check user
    if (user == null) {
      // login failed
      writer.write("Login failed.");
    } else {
      // login success
      writer.write("Login success");
    }
  }
}
