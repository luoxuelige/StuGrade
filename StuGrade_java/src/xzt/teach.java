package xzt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class teach {
JMenuBar jmb;
JMenu jm,jm1,jm2,jm3;
JMenuItem jmi,jmi1,jmi2,jmi3,jmi4,jmi5,jmi6;
JFrame jf;
JPanel jp;
JLabel jl;
teach(){
	jp=new JPanel();
	jf=new JFrame();
	jf.setSize(400,300);
	jf.setLocationRelativeTo(null);
	jf.setTitle("��ʦ����");
    jl=new JLabel("");
	jp.add(jl);
	jf.add(jp);
jmb=new JMenuBar();
jm1=new JMenu("����");
jm=new JMenu("��ѯ");	
jm2=new JMenu("ɾ��");
jm3=new JMenu("�ļ�");
jmi=new JMenuItem("����");
jmi1=new JMenuItem("��ѯȫ��");
jmi2=new JMenuItem("��ѯ����");
jmi3=new JMenuItem("ɾ������");
jmi6=new JMenuItem("��ձ�����");
jmi4=new JMenuItem("�˳�");
jmi5=new JMenuItem("�޸�");
jmb.add(jm1);jmb.add(jm3);
jm1.add(jm);jm1.add(jmi5);jm1.add(jmi);jm1.add(jmi3);
jm.add(jmi1);jm.add(jmi2);
//jm2.add(jmi3);jm2.add(jmi6);
jm3.add(jmi4);
jf.setJMenuBar(jmb);
	
jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
jf.setVisible(true);	
jmi4.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e) {
		jf.dispose();		
	}	
	});
jmi.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e) {
		//jp.removeAll();
		JLabel jl1,jl2,jl3,jl4,jl5;
		JButton jb1,jb2;
		JTextField jt1,jt2,jt3,jt4,jt5;
	
		JPanel jp,jp1,jp2,jp3,jp4,jp5,jp6;
		jl1=new JLabel("ѧ���� ��");
		jl2=new JLabel("������� ");
		jl3=new JLabel("��  ��  ��:");
		jl4=new JLabel("ѧ        ��:");
		jl5=new JLabel("��         ��");
		jb1=new JButton("����");
		jb2=new JButton("����");
		JFrame jf=new JFrame();
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
		jf.setSize(400,300);
		jf.setLocationRelativeTo(null);
		jf.add(jp);
		jp.setLayout(new GridLayout(6,1));
		jp.add(jp1);jp.add(jp2);jp.add(jp3);jp.add(jp4);jp.add(jp5);jp.add(jp6);
		jp1.add(jl1);jp1.add(jt1);
		jp2.add(jl4);jp2.add(jt4);
		jp3.add(jl3);jp3.add(jt3);
		jp4.add(jl2);jp4.add(jt2);
		jp5.add(jl5);jp5.add(jt5);
		jp6.add(jb1);jp6.add(jb2);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
		jb2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				jf.dispose();
					}	
			});
		
		jb1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				Object[]a= {String.valueOf(jt4.getText()),String.valueOf(jt1.getText()),String.valueOf(jt2.getText()),String.valueOf(jt3.getText()),String.valueOf(jt5.getText())};
				if(String.valueOf(jt4.getText()).length()==0||String.valueOf(jt2.getText()).length()==0){JOptionPane.showMessageDialog(null,"ע��ʧ�ܣ�ѧ�Ż��û�������Ϊ�գ���");  }
				else {
				sqlfun.add(a);	
				JOptionPane.showMessageDialog(null,"����ɹ���");
				}
					}	
			});
	}

	
	});//1

jmi1.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e) {
		jp.removeAll();
		JFrame jf;
		JButton jb;
		JPanel jp,jp1;
		Object[][]row=new Object[sqlfun.column()][5];
		Object[]column;
		JTable tab;
		JScrollPane sp;
		jf=new JFrame();
		jb=new JButton("����");
		jp=new JPanel();
		jp1=new JPanel();
		row=sqlfun.stutable();
		column= new Object[]{"ѧ��","����","java","sql","�ܷ�"};
		tab=new JTable(row,column);
		sp=new JScrollPane(tab);
		//jp.setLayout(new GridLayout(2,1));
		jf.add(sp,BorderLayout.CENTER);
		jp.add(jp1);
		jp1.add(jb);
		
		jf.add(jp,BorderLayout.SOUTH);
		jf.setSize(400,300);
		jf.setLocationRelativeTo(null);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
		//System.out.print("sqlfun.column()"+row);
		jb.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				jf.dispose();
					}	
			});
	}	
	});//2

jmi2.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e) {
		//jp.removeAll();
		JFrame jf;
		JLabel jl1,jl2,jl3,jl4,jl5,jl6;
		JButton jb1,jb2;
		JTextField jt1,jt2,jt3,jt4,jt5,jt6;
		
		JPanel jp,jp1,jp2,jp3,jp4,jp5,jp6,jp7;
		jf=new JFrame();
		jl1=new JLabel("ѧ���� ��");
		jl2=new JLabel("������� ");
		jl3=new JLabel("��  ��  ��:");
		jl4=new JLabel("ѧ        ��:");
		jl5=new JLabel("��         ��");
		jl6=new JLabel("����ѧ��");
		jb1=new JButton("����");
		jb2=new JButton("��ѯ"); 
		
		jt1=new JTextField(18);
		jt2=new JTextField(18);
		jt3=new JTextField(18);
		jt4=new JTextField(18);
		jt5=new JTextField(18);
		jt6=new JTextField(10);
	    jp=new JPanel();
		jp1=new JPanel();
		jp2=new JPanel();
		jp3=new JPanel();
		jp4=new JPanel();
		jp5=new JPanel();
		jp6=new JPanel();
		jp7=new JPanel();
		jf.setSize(400,300);
		jf.setLocationRelativeTo(null);
		jf.add(jp);
		jp.setLayout(new GridLayout(7,1));
		jp.add(jp7);jp.add(jp1);jp.add(jp2);jp.add(jp3);jp.add(jp4);jp.add(jp5);jp.add(jp6);
		jp7.add(jl6);jp7.add(jt6);
		jp1.add(jl1);jp1.add(jt1);
		jp2.add(jl4);jp2.add(jt4);
		jp3.add(jl3);jp3.add(jt3);
		jp4.add(jl2);jp4.add(jt2);
		jp5.add(jl5);jp5.add(jt5);
		jp6.add(jb2);jp6.add(jb1);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
		jb1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				jf.dispose();
					}	
			});
		jb2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				
			if(sqlfun.search(jt6.getText())) {	Object[]a=sqlfun.search1(jt6.getText());
				jt4.setText(String.valueOf(a[0]));jt4.setEditable(false);
				jt1.setText(String.valueOf(a[1]));jt1.setEditable(false);
				jt2.setText(String.valueOf(a[2]));jt2.setEditable(false);
				jt3.setText(String.valueOf(a[3]));jt3.setEditable(false);
				jt5.setText(String.valueOf(a[4]));jt5.setEditable(false);}
			else { JOptionPane.showMessageDialog(null,"�޴�ѧ����");}
				
					}	
			});
		
	}	
	});//3

jmi3.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e) {
		JLabel jl=new JLabel("������ѧ��:");
		JTextField jt=new JTextField(15);
		JPanel jp1=new JPanel();
		JButton jb1=new JButton("ɾ��");
		JButton jb2=new JButton("����");
		JPanel jp=new JPanel();
		JFrame jf=new JFrame();
		jp.add(jl);jp.add(jt);
		jp1.add(jb1);jp1.add(jb2);
		jf.setSize(400,300);
		jf.setLocationRelativeTo(null);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
		jf.add(jp,BorderLayout.CENTER);
		jf.add(jp1, BorderLayout.SOUTH);
		jb2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				jf.dispose();
					}	
			});
		jb1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(sqlfun.delete(jt.getText())) {
					JOptionPane.showMessageDialog(null,"ɾ���ɹ���");
				}else {JOptionPane.showMessageDialog(null,"ɾ��ʧ�ܣ��޴�ѧ����");}
					}	
			});
		
		
	}	
	});//4


jmi4.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e) {
		jf.dispose();
			}
});//5




jmi5.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e) {
		JFrame jf;
		JLabel jl1,jl2,jl3,jl4,jl5,jl6;
		JButton jb1,jb2,jb3;
		JTextField jt1,jt2,jt3,jt4,jt5,jt6;
		
		JPanel jp,jp1,jp2,jp3,jp4,jp5,jp6,jp7;
		jf=new JFrame();
		jl1=new JLabel("ѧ���� ��");
		jl2=new JLabel("������� ");
		jl3=new JLabel("��  ��  ��:");
		jl4=new JLabel("ѧ        ��:");
		jl5=new JLabel("��         ��");
		jl6=new JLabel("���޸�ѧ��ѧ��");
		jb1=new JButton("����");
		jb2=new JButton("�޸�"); 
		jb3=new JButton("ȷ��"); 
		jt1=new JTextField(18);
		jt2=new JTextField(18);
		jt3=new JTextField(18);
		jt4=new JTextField(18);
		jt5=new JTextField(18);
		jt6=new JTextField(10);
	    jp=new JPanel();
		jp1=new JPanel();
		jp2=new JPanel();
		jp3=new JPanel();
		jp4=new JPanel();
		jp5=new JPanel();
		jp6=new JPanel();
		jp7=new JPanel();
		jf.setSize(400,300);
		jf.setLocationRelativeTo(null);
		jf.add(jp);
		jp.setLayout(new GridLayout(7,1));
		jp.add(jp7);jp.add(jp1);jp.add(jp2);jp.add(jp3);jp.add(jp4);jp.add(jp5);jp.add(jp6);
		jp7.add(jl6);jp7.add(jt6);jp7.add(jb3);
		jp1.add(jl1);jp1.add(jt1);
		jp2.add(jl4);jp2.add(jt4);
		jp3.add(jl3);jp3.add(jt3);
		jp4.add(jl2);jp4.add(jt2);
		jp5.add(jl5);jp5.add(jt5);
		jp6.add(jb2);jp6.add(jb1);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
		jb1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				jf.dispose();
					}	
			});
		
		jb3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				
				if(sqlfun.search(jt6.getText())) {	Object[]a=sqlfun.search1(jt6.getText());
					jt4.setText(String.valueOf(a[0]));
					jt1.setText(String.valueOf(a[1]));
					jt2.setText(String.valueOf(a[2]));
					jt3.setText(String.valueOf(a[3]));
					jt5.setText(String.valueOf(a[4]));}
				else { JOptionPane.showMessageDialog(null,"�޴�ѧ����");}
					
							
					}	
			});
		jb2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
			if(jt4.getText().length()==0) {JOptionPane.showMessageDialog(null,"���޸�ѧ�Ų���Ϊ�գ�");}	else {
			Object[]o=new Object[]{String.valueOf(jt4.getText()),String.valueOf(jt1.getText()),String.valueOf(jt2.getText()),String.valueOf(jt3.getText()),String.valueOf(jt5.getText())};
		if(sqlfun.update1(o)) {JOptionPane.showMessageDialog(null,"�޸ĳɹ���");}
		else {JOptionPane.showMessageDialog(null,"�޸�ʧ�ܣ�");}
							
					}	}
			});
		
			}
});//6


jmi6.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e) {
		if(sqlfun.deleteall()) {JOptionPane.showMessageDialog(null,"��ճɹ���");}
		else {JOptionPane.showMessageDialog(null,"���ʧ�ܣ�");}
			}
});//7


}



}
