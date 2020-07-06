package dao;
import java.util.List;
import mode.StudentBean;
//使用面向接口的方法有利于降低程序耦合性。
//接口也就是功能规范便于管理
public interface StudentDao {
	
    public boolean con(String name,String password,int shenfen);//用户登入验证


	public List findAllUser();//得到所有用户的所有成绩信息，返回list
	
	
	public int delUserById(String id);//通过ID删除用户的所有成绩
	
	
	public StudentBean findUserById(String id);//通过ID查到指定用户的所有成绩
	
	
	public boolean modifyUser(StudentBean regf,String id);//修改指定用户的成绩
	
	public boolean ifexist(String id);//搜索该用户是否存在
	
	public boolean insert(String id,int gradeone, int gradetwo, int gradethree, int gradefour);//增加成绩
	

}
