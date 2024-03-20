package psy;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;



public class left extends JPanel{
	left1 left1=new left1();
	button btn=new button();
	
	left(){

				this.setLayout(new GridLayout(3,0));
		this.add(left1);
		this.add(btn);
		
	}

}
