package dao;
import java.util.List;
import mode.StudentBean;
//ʹ������ӿڵķ��������ڽ��ͳ�������ԡ�
//�ӿ�Ҳ���ǹ��ܹ淶���ڹ���
public interface StudentDao {
	
    public boolean con(String name,String password,int shenfen);//�û�������֤


	public List findAllUser();//�õ������û������гɼ���Ϣ������list
	
	
	public int delUserById(String id);//ͨ��IDɾ���û������гɼ�
	
	
	public StudentBean findUserById(String id);//ͨ��ID�鵽ָ���û������гɼ�
	
	
	public boolean modifyUser(StudentBean regf,String id);//�޸�ָ���û��ĳɼ�
	
	public boolean ifexist(String id);//�������û��Ƿ����
	
	public boolean insert(String id,int gradeone, int gradetwo, int gradethree, int gradefour);//���ӳɼ�
	

}
