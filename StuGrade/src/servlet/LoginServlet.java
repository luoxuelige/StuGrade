 package servlet;
 import java.io.IOException;
 import javax.servlet.ServletException;
 import javax.servlet.http.HttpServlet;
 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpServletResponse;
 import javax.servlet.http.HttpSession;

 import manager.UserManager;
 import forms.LoginForm;
public class LoginServlet extends HttpServlet {
	
	
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	  System.out.println("123");
		super.doGet(req, resp);
		System.out.println("123");
	}
  
  protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	  
	  req.setCharacterEncoding("utf-8");
	   LoginForm lgfm=new LoginForm();
	   HttpSession session=req.getSession();
	   String name=null;
	   String password=null;
	   int shenfen;
	   name=req.getParameter("username");
	   password=req.getParameter("password");
	   shenfen=Integer.parseInt(req.getParameter("shenfen"));
	  
	   lgfm.setUsername(req.getParameter("username"));
	   lgfm.setPassword(req.getParameter("password"));
	   lgfm.setShenfen(Integer.parseInt(req.getParameter("shenfen")));
	   UserManager um=UserManager.getInstance();
	   boolean flag=um.login(lgfm);
	   if(flag) {
		   session.setAttribute("name",name);
		   session.setAttribute("password",password);
		   session.setAttribute("shenfen",shenfen);
		   if(shenfen==1){
				req.getRequestDispatcher("/login.jsp").forward(req, resp);}
				
				if(shenfen==0){
				req.getRequestDispatcher("/StudentLogin").forward(req, resp);}
				
			}else{
				req.getRequestDispatcher("/error.jsp").forward(req, resp);
			}

    }
  
  
}