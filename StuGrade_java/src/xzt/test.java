package xzt;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class test {
JFrame jf;
JLabel jl1,jl2,jl3;
JButton jb1,jb2;
JTextField jt;
JPasswordField jpw;
JPanel jp,jp1,jp2,jp3,jp4;
public test(){
	jf=new JFrame();
	jl1=new JLabel("ѧ��:");
	jl2=new JLabel("����:");
	jl3=new JLabel("����״̬");
	jb1=new JButton("ȷ��"); 
	jb2=new JButton("ע��");
	jt=new JTextField(15);
	jpw=new JPasswordField(15);
	jp=new JPanel();
	jp1=new JPanel();
	jp2=new JPanel();
	jp3=new JPanel();
	jp4=new JPanel();
	jf.setSize(300,200);
	jf.setLocationRelativeTo(null);
	jf.add(jp);
	jp.setLayout(new GridLayout(4,1));
	jp.add(jp1);jp.add(jp2);jp.add(jp3);jp.add(jp4);
	jp1.add(jl1);jp1.add(jt);
	jp2.add(jl2);jp2.add(jpw);
	jp3.add(jb1);jp3.add(jb2);
	jp4.add(jl3);
	jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	jf.setVisible(true);
	jb1.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e) {
		String a=String.valueOf(jt.getText());
		String b=String.valueOf(jpw.getPassword());
		Object[]c= {a,b};
		if(sqlfun.check(c)==0) {
			jt.setText("");
		jpw.setText("");
		jl3.setText("����ɹ�");
		new stu(a,b);}
		else if(sqlfun.check(c)==1) {
			jt.setText("");
		    jpw.setText("");
		    
		    jl3.setText("����ɹ�");
		    new teach();}
		else {jt.setText("");
		    jpw.setText(""); 
		    jl3.setText("����ʧ��");
		    JOptionPane.showMessageDialog(null,"����ʧ�ܣ���˶��˺����룡");}
		//���ȷ���������һ�����еĺ˶����ݿ�ע������ݷ������ɹ�jl3��ʾ����ɹ���ʧ����ʾ����ʧ�ܡ��ɹ�ʱҪ�жϸ��û���ݣ�Ȼ��new��ͬ�Ľ�ʦ�������ѧ�����档		
	}	
	});
	jb2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			jt.setText("");
			jpw.setText("");
		new register();	
		//���ע���ת��ע����棬�����������룬һ�º�������ݿ��ע����ڡ���һ���򷢳���ʾ,��ʾ��Ϣ�򡣵�����ؿɷ��ص������.dispose����		
		}	
		});
		
	
	
}

	
	
	
	
	
	
	
	public static void main(String[] args) {
		new test();
		
//System.out.print(sqlfun.column());
	}

}

