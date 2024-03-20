package psy;

import java.awt.GridLayout;

import javax.swing.JFrame;



public class left extends JFrame{
	left1 left1=new left1();
	button btn=new button();
	
	left(){
		this.setTitle("left");
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		this.setLayout(new GridLayout(3,0));
		this.add(left1);
		this.add(btn);
		pack();
	}
	public static void main (String args[]) {
		new left();
	}

}
