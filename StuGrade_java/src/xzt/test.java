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
	jl1=new JLabel("学号:");
	jl2=new JLabel("密码:");
	jl3=new JLabel("登入状态");
	jb1=new JButton("确定"); 
	jb2=new JButton("注册");
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
		jl3.setText("登入成功");
		new stu(a,b);}
		else if(sqlfun.check(c)==1) {
			jt.setText("");
		    jpw.setText("");
		    
		    jl3.setText("登入成功");
		    new teach();}
		else {jt.setText("");
		    jpw.setText(""); 
		    jl3.setText("登入失败");
		    JOptionPane.showMessageDialog(null,"登入失败，请核对账号密码！");}
		//点击确定后调用另一个类中的核对数据库注册表数据方法，成功jl3显示登入成功，失败显示登入失败。成功时要判断该用户身份，然后new不同的教师界面或者学生界面。		
	}	
	});
	jb2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			jt.setText("");
			jpw.setText("");
		new register();	
		//点击注册后转到注册界面，两次输入密码，一致后存入数据库的注册表内。不一致则发出提示,显示信息框。点击返回可返回登入界面.dispose（）		
		}	
		});
		
	
	
}

	
	
	
	
	
	
	
	public static void main(String[] args) {
		new test();
		
//System.out.print(sqlfun.column());
	}

}

