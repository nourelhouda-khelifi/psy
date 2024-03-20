package psy;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;

public class button extends JPanel {
    JComboBox<String> patientSelect;
    JButton vocal = new JButton("upload vocal");
    JButton ok = new JButton("Configure and Generate");

    public button() {
        String[] patients = {"Patient 1", "Patient 2", "Patient 3", "Patient 4"}; // Exemple de liste de patients
        patientSelect = new JComboBox<>(patients);
        
        this.setLayout(new FlowLayout());
        this.add(patientSelect);
        this.add(vocal);
        this.add(ok);
    }
}
