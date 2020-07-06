package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
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
 

public class AddServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
		
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		
		UserManager userManager = UserManager.getInstance();
		
		String id= request.getParameter("id");
		
		
		if(userManager.ifexsit(id)){//�жϸ�ѧ��id�Ƿ��Ѿ����ڳɼ�
			
			request.setAttribute("Msg","��ѧ�����ڳɼ���Ϣ�������ظ�������");
			request.getRequestDispatcher("/addgrade.jsp").forward(request, response);
		}else{
		
		//����������ձ����ݷ�װ��ѧ���ɼ���bean����ҵ����е���insert���������óɹ�����studentInfoҳ��
		
		StudentBean as = new StudentBean();
		
		
		as.setid(request.getParameter("id"));
		as.setgradeone(Integer.parseInt(request.getParameter("gradeone")));
		as.setgradetwo(Integer.parseInt(request.getParameter("gradetwo")));
		as.setgradethree(Integer.parseInt(request.getParameter("gradethree")));
		as.setgradefour(Integer.parseInt(request.getParameter("gradefour")));
        boolean flag=userManager.addgrade(as);
        if(flag) {request.getRequestDispatcher("/studentInfo.jsp").forward(request, response);}
		}
	}

}
