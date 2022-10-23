package JavaQuiz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class Score extends JFrame implements ActionListener{
 
	public Score(String username,int score) {
		setBounds(600,150,750,550);
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("JavaQuiz/icons/score.jpeg"));
		JLabel l1= new JLabel(i1);
		l1.setBounds(0,5,800,400);
		add(l1);
		
		JLabel l2= new JLabel("Thankyou "+ username +"  for palying this quiz !");
		l2.setFont(new Font("Jokerman", Font.PLAIN, 26));
		l2.setBounds(45,120,900,600);
		add(l2);
		
		JLabel l3= new JLabel("Your Score is: "+ score);
		l3.setFont(new Font("Jokerman", Font.PLAIN, 24));
		l3.setForeground(new Color(250,10,133));
		l3.setBounds(45,170,900,600);
		add(l3);
		
		JButton b1 = new JButton("Play Again");
		b1.setBackground(Color.BLUE);
		b1.setForeground(Color.WHITE);
		b1.addActionListener(this);
		b1.setBounds(600,450,120,30);
		add(b1);
	}

	public void actionPerformed(ActionEvent ae) {
		this.setVisible(false);
		new JavaQuiz().setVisible(true);
	}

	public static void main(String[] args) {
		new Score("",0).setVisible(true);
	}

}
