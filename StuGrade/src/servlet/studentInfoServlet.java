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

import dao.*;


public class studentInfoServlet  extends HttpServlet{
	
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req,resp);//��Ϊ��a��ǩ��������get��ʽ����servlet����get������ֱ��ת��dopost����
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		UserManager userMassage=UserManager.getInstance();
		List list =userMassage.findAllUse();
		
		req.setAttribute("user", list);//�õ�ѧ���ɼ���bean����
		
		req.getRequestDispatcher("/studentInfo.jsp").forward(req, resp);//ת����studentInfo.jspҳ��
		
	}
	
}

