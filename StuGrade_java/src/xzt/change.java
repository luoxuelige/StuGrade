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
		jl1=new JLabel("ԭ �� ��  :");
		jl2=new JLabel("�� �� ��  :");
		jl3=new JLabel("�˶�����:");
		jb1=new JButton("ȷ��");
		jb2=new JButton("����");
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
						JOptionPane.showMessageDialog(null,"�޸ĳɹ���");
					}else {JOptionPane.showMessageDialog(null,"�޸�ʧ�ܣ������������벻һ�»���Ϊ�գ�");}
					
					
					
				}else {JOptionPane.showMessageDialog(null,"�޸�ʧ�ܣ�ԭ���벻��ȷ��");}
			}	
			});
	
	
	
	
 }
	
	
}
