package JavaQuiz;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

@SuppressWarnings("serial")
public class JavaQuiz extends JFrame implements ActionListener{
	 JButton b1,b2;
	 JTextField t1;
	JavaQuiz(){
		setBounds(400,200,1000,500); //dleft,//dup //dlength //dheight////
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("JavaQuiz/icons/quiz_time.jpeg"));
		JLabel l1= new JLabel(i1);
		l1.setBounds(0,0,600, 500);
		add(l1);
		
		JLabel l2=new JLabel("Java Quiz");
		l2.setBounds(650, 40, 300, 50);
		l2.setFont(new Font("Viner Hand ITC", Font.BOLD, 45));
		l2.setForeground(new Color(30, 133, 254));
		add(l2);
		
		JLabel l3=new JLabel("Enter your name:");
		l3.setBounds(700, 130, 300, 20);
		l3.setFont(new Font("Mongolian Baiti", Font.BOLD, 20));
		l3.setForeground(new Color(30, 144, 254));
		add(l3);
		
	    t1 = new JTextField();
		t1.setBounds(650, 170, 300, 25);
		t1.setFont(new Font("Times New Roman", Font.ITALIC,20));
	    add(t1);
		
		b1=new JButton("Rules");
		b1.setBounds(650, 270, 120, 25);
		b1.setBackground(new Color(30, 133, 254));
		b1.setForeground(Color.WHITE);
		b1.addActionListener(this);
		add(b1);
		
	    b2=new JButton("Exit");
		b2.setBounds(815, 270, 120, 25);
		b2.setBackground(new Color(30, 133, 254));
		b2.setForeground(Color.WHITE);
		b2.addActionListener(this);
		add(b2);
		
		
		
		setVisible(true);
	
       }
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==b1) {
			String name = t1.getText();
			this.setVisible(false);
			new Rules(name);
		}
		else {
			System.exit(0);
		}
	}
	

	public static void main(String[] args) {
		new JavaQuiz();
		

	}

	

}
