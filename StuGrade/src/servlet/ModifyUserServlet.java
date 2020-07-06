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




public class ModifyUserServlet extends HttpServlet {
	
	 
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req,resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		   req.setCharacterEncoding("utf-8");
		   StudentBean rgf =new StudentBean();
		   rgf.setid(req.getParameter("id"));
		  //�ռ��������ݣ����Ҵ���ѧ���ɼ���bean��
		   rgf.setgradeone(Integer.parseInt(req.getParameter("gradeone")));
		   rgf.setgradetwo(Integer.parseInt(req.getParameter("gradetwo")));
		   rgf.setgradethree(Integer.parseInt(req.getParameter("gradethree")));
		   rgf.setgradefour(Integer.parseInt(req.getParameter("gradefour")));
		   String id=req.getParameter("id");
		    //����bean��id����ҵ��㣬Ȼ��ҵ��㴴��dao��������ݿ����ݽ����޸�
		   UserManager userMassage=UserManager.getInstance();
		   boolean flag=userMassage.modifyUser(rgf,id);
		 
		if(flag)
		{
		 
		
			 req.getRequestDispatcher("/studentInfo").forward(req, resp);
		}
		 
	}
	
}
