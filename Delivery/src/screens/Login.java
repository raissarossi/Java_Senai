package screens;

import components.LabelFood;

import javax.swing.*;
import java.awt.*;

public class Login extends JPanel {
    public JButton enterBtn = new JButton();
    public JButton backHome =  new JButton();
    JTextField name = new JTextField();
    JLabel nameLabel = new JLabel("Name:");
    JTextField password = new JTextField();
    JLabel passwordLabel = new JLabel("Password:");


    public Login(){
        setLayout(null);
        setBackground(Color.CYAN);
        setDefaultLocale(null);

        nameLabel.setBounds(117,160, 250, 50);
        add(nameLabel);
        name.setBounds(117,200, 250, 50);
        add(name);

        passwordLabel.setBounds(117,260, 250, 50);
        add(passwordLabel);
        password.setBounds(117, 300, 250, 50);
        add(password);

        backHome.setBounds(10, 10, 80, 20);
        backHome.setText("Back");
        add(backHome);

        enterBtn.setBounds(167,600, 150, 50);
        enterBtn.setText("Enter");
        add(enterBtn);
        nameLabel.setVisible(true);
        passwordLabel.setVisible(true);
    }
}
