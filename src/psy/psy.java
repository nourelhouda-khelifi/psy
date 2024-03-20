package psy;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;





public class psy  extends JFrame{
	header headerPanel = new header();
	main mainPanel = new main();
	left left = new left();
	
    public psy() {
        setTitle("Main Layout Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());


        add(headerPanel, BorderLayout.NORTH);
        add(left, BorderLayout.WEST);      
        add(mainPanel, BorderLayout.CENTER);
        
        setLocationRelativeTo(null);
        setVisible(true);
        pack();
    }

    public static void main(String[] args) {
    	new psy();
    }
}
