package psy;

import java.awt.*;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class main extends JPanel {
	
	session s= new session("2018-25-01","client");
	session s2= new session("2018-25-01","client");
    public main() {
   
		this.setLayout(new GridLayout( 0,1,10,10));
		add(s);
		add(s2);
    }
}
//test
class session extends JPanel {

    JLabel dateLabel = new JLabel();
    JLabel clientLabel = new JLabel();
    JButton viewButton = new JButton("view");
    ImageIcon icon = new ImageIcon("eye");
    JPanel top = new JPanel();

    public session(String date, String client) {
        dateLabel.setText("From " + date);
        clientLabel.setText("Session with " + client);

        top.setLayout(new BorderLayout());
        top.add(dateLabel, BorderLayout.WEST);
        top.add(viewButton, BorderLayout.EAST);
        viewButton.setMargin(new Insets(0, 20, 0, 20));
        top.setBackground(Color.white);

        this.setLayout(new BorderLayout());
        this.setBorder(new EmptyBorder(10, 10, 10, 10));
        this.setBackground(Color.WHITE);

        this.add(top, BorderLayout.NORTH);
        this.add(clientLabel, BorderLayout.CENTER);

    }
}

