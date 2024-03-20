package psy;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class left1 extends JPanel{
	JTextArea textArea = new JTextArea(10, 30);
	JLabel details=new JLabel("The session description must be between 100 and 1000 words");
	JLabel date=new JLabel("Date");
	JTextField tdate=new JTextField("");
	JPanel p1=new JPanel(new GridLayout(2,0));
	
	
	
	public left1() {
		this.setLayout(new GridLayout(3,0));
		this.add(textArea);
		this.add(details);
		p1.add(date);
		p1.add(tdate);
		this.add(p1);
		

	}

}

