package xzt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class change {
	JFrame jf;
	JLabel jl1,jl2,jl3;
	JButton jb1,jb2;
	
	JPasswordField jpw,jpw1,jpw2;
	JPanel jp,jp1,jp2,jp3,jp4;

   change(String a,String b){
	   jf=new JFrame();
		jl1=new JLabel("原 密 码  :");
		jl2=new JLabel("新 密 码  :");
		jl3=new JLabel("核对密码:");
		jb1=new JButton("确定");
		jb2=new JButton("返回");
		jpw=new JPasswordField(15);
		jpw1=new JPasswordField(15);
		jpw2=new JPasswordField(15);
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
		jp1.add(jl1);jp1.add(jpw);
		jp2.add(jl2);jp2.add(jpw1);
		jp3.add(jl3);jp3.add(jpw2);
		jp4.add(jb1);jp4.add(jb2);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
		jb2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				jf.dispose();		
			}	
			});
		jb1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				String x=String.valueOf(jpw.getPassword());
				String y=String.valueOf(jpw1.getPassword());
				String z=String.valueOf(jpw2.getPassword());
				jpw1.setText("");
			    jpw.setText("");
			    jpw2.setText("");
				if(b.equals(x)) {
					if(y.equals(z)&&y.length()>0){
						sqlfun.update(a,y);
						JOptionPane.showMessageDialog(null,"修改成功！");
					}else {JOptionPane.showMessageDialog(null,"修改失败！两次密码输入不一致或不能为空！");}
					
					
					
				}else {JOptionPane.showMessageDialog(null,"修改失败！原密码不正确！");}
			}	
			});
	
	
	
	
 }
	
	
}
