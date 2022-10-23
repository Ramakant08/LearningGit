package JavaQuiz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton b1,b2;
    String username;
	public Rules( String username) {
		this.username = username;
		setBounds(600, 200, 800, 650);
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		JLabel l1= new JLabel("Welcome "+ username +" to Quiz Challenge");
		l1.setBounds(50,20,700,30);
		l1.setFont(new Font("Viner Hand ITC", Font.BOLD, 30));
		l1.setForeground(new Color(30, 140, 250));
		add(l1);
		
		JLabel l2= new JLabel("");
		l2.setFont(new Font("Tahoma",Font.ROMAN_BASELINE, 16));
		l2.setBounds(20,90,600,350);
		l2.setText(
				"<html>"+
					       "1. You have to answer point to point" + "<br><br>" +
					       "2. Do not unnecessarily smile at the person sitting next to you, they may also know the answer" + "<br><br>" + 
					       "3. You may have lot of options in life but here all questions are compulsary" + "<br><br>" +
					       "4. Crying is allowed but please do so quietly." + "<br><br>" + 
					       "5. Only a fool asks and a wise answers (Be wise, not otherwise)"+ "<br><br>" + 
					       "6. Brace yourself, this paper is not for the faint hearted " + "<br><br>" + 
					       "7. All the very Best, Go Ahead !!." + "<br><br>" + 
					"<html>");
		add(l2);
		
	    b1=new JButton("Back");
		b1.setBounds(250,500,100,30);
		b1.setBackground(new Color(30,144,255));
		b1.setForeground(Color.WHITE);
		b1.addActionListener(this);
		add(b1);
		
		b2=new JButton("Start");
		b2.setBounds(400,500,100,30);
		b2.setBackground(new Color(30,144,255));
		b2.setForeground(Color.WHITE);
		b2.addActionListener(this);
		add(b2);
		
		setVisible(true);
		
		
	}

public void actionPerformed(ActionEvent ae) {
	if(ae.getSource()==b1) {
		this.setVisible(false);
		new JavaQuiz().setVisible(true);
	}
	else if(ae.getSource()==b2){
		this.setVisible(false);
		new Quiz(username).setVisible(true);
	}
}

	public static void main(String[] args) {
		new Rules("");

	}

}
