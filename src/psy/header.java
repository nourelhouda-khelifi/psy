package psy;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class header extends JPanel {
	private JLabel greeting = new JLabel("Hi admin");
	private JLabel notesHeader = new JLabel("Notes to Review");	
	static JTextField f = new JTextField("Search for client name");
    public header() {
    	greeting.setFont(new Font("Arial", Font.BOLD, 24));
    	
    	notesHeader.setFont(new Font("Arial", Font.BOLD, 24));
    	this.setLayout(new FlowLayout( FlowLayout.CENTER, 100, 0));
    	add(greeting, BorderLayout.NORTH);
        
        add(notesHeader, BorderLayout.CENTER);
        add(f, BorderLayout.EAST);

        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    }
}




