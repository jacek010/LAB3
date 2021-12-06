package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rysowanie extends JPanel implements ActionListener {

    public Rysowanie(){
        setLayout(new FlowLayout());
        JTextField idField = new JTextField(20);
        JPasswordField passwordField = new JPasswordField(15);

        JButton loginButton = new JButton("Login");
        JButton clearButton = new JButton("Clear");

        add(new JLabel("Id"));
        add(idField);
        add(new JLabel("Password"));
        add(passwordField);
        add(loginButton);
        add(clearButton);



        loginButton.addActionListener(e->{});
        clearButton.addActionListener(e -> {});
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
