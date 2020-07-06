package manager;
import java.util.List;

import mode.StudentBean;

import dao.StudentDao;
import dao.MysqlFun;
import forms.LoginForm;


public class UserManager {
	 
	//相当于锁，每次只处理一个请求
	 static private UserManager instance=null;
	 
	 private UserManager()
	 {
		 //私有函数，故想要创建实例只能用getInstance（）
	 }
	 
	 static public UserManager getInstance()//静态公共函数，调用时不需要创建对象，只需要用类名加函数名即可
	 {
		 if(instance==null)
		 {
			 instance=new UserManager(); 
			 
		 }
	     return instance;
	 }
	 
	
		
		public boolean login(LoginForm loginf){  //登入验证，若登入验证成功则返回true 不超过返回false
		StudentDao intsl=new MysqlFun();  //实现了接口的类的对象指向接口类型的变量，也可以减少耦合性
		 boolean flag=intsl.con(loginf.getUsername(), loginf.getPassword(),loginf.getShenfen());
		return flag;
		}
		
		public boolean ifexsit(String id){  //验证该id是否存在成绩
			StudentDao intsl=new MysqlFun();  //实现了接口的类的对象指向接口类型的变量，也可以减少耦合性
			 boolean flag=intsl.ifexist(id);
			return flag;
			}
			
		public boolean addgrade(StudentBean as){  
			StudentDao intsl=new MysqlFun();  
			 boolean flag=intsl.insert(as.getid(),as.getgradeone(),as.getgradetwo(),as.getgradethree(),as.getgradefour());
			return flag;
			}

		public List findAllUse()  //返回的是所有用户成绩的表单bean组成的集合
	    {
		  StudentDao intsl=new MysqlFun();
	      List AllUser=intsl.findAllUser();
	      return AllUser;
	    }
		
		/**
		 * 删锟斤拷指锟斤拷锟矫伙拷 
		 * @param id
		 * @param int 
		 */
		public int delUserById(String id)  
		{
			StudentDao intsl=new MysqlFun();
			int flag=intsl.delUserById(id);
			return flag;
		}
		
		public StudentBean findUserById(String id)  
		{
			StudentDao intsl=new MysqlFun();
			StudentBean bean=intsl.findUserById(id);
			return bean;
		}
		
		/**
		 *根据对用户的数据进行编辑
		 * @param RegisterFrom,String id
		 * @return boolean
		 */
		public boolean modifyUser(StudentBean regf,String id)
		{   
			StudentDao intsl=new MysqlFun();
			boolean flag=intsl.modifyUser(regf,id);
			return flag;
		}
	 }