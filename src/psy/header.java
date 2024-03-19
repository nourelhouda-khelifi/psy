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
	private JLabel headerLabel;

    public header() {
        headerLabel = new JLabel("jtm nawara");
        headerLabel.setFont(new Font("Arial", Font.BOLD, 24));
        setLayout(new BorderLayout());
        add(headerLabel, BorderLayout.CENTER);
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    }
}




