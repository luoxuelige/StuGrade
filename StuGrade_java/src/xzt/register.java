package xzt;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class register {
	JFrame jf;
	JLabel jl1,jl2,jl3;
	JButton jb1,jb2;
	JTextField jt;
	JPasswordField jpw,jpw1;
	JPanel jp,jp1,jp2,jp3,jp4;
	public register(){
		jf=new JFrame();
		jl1=new JLabel("ѧ        ��:");
		jl2=new JLabel("��        ��:");
		jl3=new JLabel("�˶�����:");
		jb1=new JButton("ȷ��");
		jb2=new JButton("����");
		jt=new JTextField(15);
		jpw=new JPasswordField(15);
		jpw1=new JPasswordField(15);
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
		jp3.add(jl3);jp3.add(jpw1);
		jp4.add(jb1);jp4.add(jb2);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
		jb1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				String a=String.valueOf(jpw.getPassword());
				String b=String.valueOf(jpw1.getPassword());
				String c=String.valueOf(jt.getText());
				if(a.length()==0||b.length()==0||c.length()==0){JOptionPane.showMessageDialog(null,"ע��ʧ�ܣ�������û�������Ϊ�գ���");  }
				else if(a.equals(b)){
					Object[]o= {c,b};
					if(sqlfun.search(c)==true) {
						sqlfun.register(o);
						JOptionPane.showMessageDialog(null,"ע��ɹ�");}
				else {
					JOptionPane.showMessageDialog(null,"ע��ʧ�ܣ��޸�ѧ����");}
		
				}else{
					JOptionPane.showMessageDialog(null,"ע��ʧ�ܣ���˶������Ƿ�һ�£�");}
				}
			});
		jb2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				jf.dispose();		
			}	
			});
	   
		
		
	}
		
}
