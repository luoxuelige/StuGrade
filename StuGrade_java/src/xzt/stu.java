package xzt;

import java.awt.*;
import java.sql.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class stu {
	JFrame jf;
	JLabel jl1,jl2,jl3,jl4,jl5;
	JButton jb1,jb2;
	JTextField jt1,jt2,jt3,jt4,jt5;
	
	JPanel jp,jp1,jp2,jp3,jp4,jp5,jp6;
	public stu(String a,String b){
		jf=new JFrame();
		jl1=new JLabel("学生姓 名");
		jl2=new JLabel("程序设计 ");
		jl3=new JLabel("数  据  库:");
		jl4=new JLabel("学        号:");
		jl5=new JLabel("总         分");
		jb1=new JButton("返回");
		jb2=new JButton("修改密码"); 
		jt1=new JTextField(15);
		jt2=new JTextField(15);
		jt3=new JTextField(15);
		jt4=new JTextField(15);
		jt5=new JTextField(15);
	    jp=new JPanel();
		jp1=new JPanel();
		jp2=new JPanel();
		jp3=new JPanel();
		jp4=new JPanel();
		jp5=new JPanel();
		jp6=new JPanel();
		jf.setSize(300,500);
		jf.setLocationRelativeTo(null);
		jf.add(jp);
		jp.setLayout(new GridLayout(6,1));
		jp.add(jp1);jp.add(jp2);jp.add(jp3);jp.add(jp4);jp.add(jp5);jp.add(jp6);
		jp1.add(jl1);jp1.add(jt1);
		jp2.add(jl4);jp2.add(jt4);
		jp3.add(jl3);jp3.add(jt3);
		jp4.add(jl2);jp4.add(jt2);
		jp5.add(jl5);jp5.add(jt5);
		jp6.add(jb2);jp6.add(jb1);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
		try {Connection con=jdconnection.getconnection();
		PreparedStatement ps1=con.prepareStatement("select*from stu where IdNumber=?");
        ps1.setString(1, a);
		ResultSet rs=ps1.executeQuery();
		if(rs.next()) {jt1.setText(rs.getString("Name"));jt1.setEditable(false);
		jt4.setText(rs.getString("IdNumber"));jt4.setEditable(false);
		jt3.setText(rs.getString("Msql"));jt3.setEditable(false);
		jt2.setText(rs.getString("Java"));jt2.setEditable(false);
		jt5.setText(rs.getString("Sum"));jt5.setEditable(false);
		} }catch (SQLException e) {
	        e.printStackTrace();}
			
		jb1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				jf.dispose();		
			}	
			});
		jb2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				new change(a,b);		
			}	
			});
	}
	
	
	}
	


