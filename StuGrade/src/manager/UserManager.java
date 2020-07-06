package manager;
import java.util.List;

import mode.StudentBean;

import dao.StudentDao;
import dao.MysqlFun;
import forms.LoginForm;


public class UserManager {
	 
	//�൱������ÿ��ֻ����һ������
	 static private UserManager instance=null;
	 
	 private UserManager()
	 {
		 //˽�к���������Ҫ����ʵ��ֻ����getInstance����
	 }
	 
	 static public UserManager getInstance()//��̬��������������ʱ����Ҫ��������ֻ��Ҫ�������Ӻ���������
	 {
		 if(instance==null)
		 {
			 instance=new UserManager(); 
			 
		 }
	     return instance;
	 }
	 
	
		
		public boolean login(LoginForm loginf){  //������֤����������֤�ɹ��򷵻�true ����������false
		StudentDao intsl=new MysqlFun();  //ʵ���˽ӿڵ���Ķ���ָ��ӿ����͵ı�����Ҳ���Լ��������
		 boolean flag=intsl.con(loginf.getUsername(), loginf.getPassword(),loginf.getShenfen());
		return flag;
		}
		
		public boolean ifexsit(String id){  //��֤��id�Ƿ���ڳɼ�
			StudentDao intsl=new MysqlFun();  //ʵ���˽ӿڵ���Ķ���ָ��ӿ����͵ı�����Ҳ���Լ��������
			 boolean flag=intsl.ifexist(id);
			return flag;
			}
			
		public boolean addgrade(StudentBean as){  
			StudentDao intsl=new MysqlFun();  
			 boolean flag=intsl.insert(as.getid(),as.getgradeone(),as.getgradetwo(),as.getgradethree(),as.getgradefour());
			return flag;
			}

		public List findAllUse()  //���ص��������û��ɼ��ı�bean��ɵļ���
	    {
		  StudentDao intsl=new MysqlFun();
	      List AllUser=intsl.findAllUser();
	      return AllUser;
	    }
		
		/**
		 * ɾ��ָ���û� 
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
		 *���ݶ��û������ݽ��б༭
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