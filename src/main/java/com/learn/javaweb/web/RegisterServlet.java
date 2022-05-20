package com.learn.javaweb.web;

import com.learn.javaweb.mapper.UserMapper;
import com.learn.javaweb.pojo.User;
import com.learn.javaweb.util.SqlSessionFactoryUtils;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

@WebServlet("/registerServlet")
public class RegisterServlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
    throws ServletException, IOException {
    // get user inputs
    String username = req.getParameter("username");
    String password = req.getParameter("password");

    // encapsulate
    User user = new User();
    user.setUsername(username);
    user.setPassword(password);

    // check if user already exists or not
    // invoke mybatis
    SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();

    // acquire session
    SqlSession sqlSession = sqlSessionFactory.openSession();

    // acquire mapper
    UserMapper usermapper = sqlSession.getMapper(UserMapper.class);

    User u = usermapper.selectByUsername(username);

    if (u == null) {
      // user does not exist
      usermapper.add(user);

      sqlSession.commit();
      sqlSession.close();
    } else {
      resp.setContentType("text/html;charset=utf-8");
      resp.getWriter().write("User already exists.");
    }
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp)
    throws ServletException, IOException {

    doGet(req, resp);
  }
}
