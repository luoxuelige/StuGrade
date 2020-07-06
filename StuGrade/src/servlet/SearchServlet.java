package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import manager.UserManager;
import mode.StudentBean;
import dao.*;


public class SearchServlet  extends HttpServlet{
	
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req,resp);//因为是a标签，所以是get方式访问servlet，在get方法中直接转入dopost方法
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		String id=req.getParameter("userName");
		
		UserManager userMassage=UserManager.getInstance();
		boolean flag=userMassage.ifexsit(id);
		if(flag) {
		StudentBean sb  =userMassage.findUserById(id);
		req.setAttribute("sb", sb);
		req.getRequestDispatcher("/search.jsp").forward(req, resp);//转发到studentInfo.jsp页面
		}else {
			req.getRequestDispatcher("/studentInfo.jsp").forward(req, resp);
		}
		
	}
	
}
