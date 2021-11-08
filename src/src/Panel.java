package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel extends JPanel implements ActionListener {
    DataBase dataBase = new DataBase();

    public Panel(){
        setLayout(new FlowLayout());
        fillDataBase();
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



        loginButton.addActionListener(e->{
            String password = new String(passwordField.getPassword());
            int result = login(idField.getText(),password);
            if(result==1){
                setBackground(Color.GREEN);//Okienko zrobi się zielone gdy wszystko przejdzie pomyślnie
                System.out.println("Zalogowano pomyślnie");
            }
            else if(result==2){
                setBackground(Color.BLUE); //Okienko zrobi się niebieskie gdy nie będzie podanego ID w bazie
                System.out.println("Brak takiego ID w bazie");
            }
            else if(result==3){
                setBackground(Color.YELLOW); // Okienko zrobi się żółte, gdy któreś pole zostanie puste
                System.out.println("Któreś z pól jest puste");
            }
            else{
                setBackground(Color.RED); //Okienko zrobi się czerwone, gdy zostanie podane złe hasło lub wystąpi inny błąd
                System.out.println("Podano złe hasło");
            }
            idField.setText(null);
            passwordField.setText(null);
        });
        clearButton.addActionListener(e -> {
            idField.setText(null);
            passwordField.setText(null);
            setBackground(Color.LIGHT_GRAY);
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    private int login(String id, String password){
        if(id.isEmpty() || password.isEmpty()) return 3;
        return dataBase.findUser(Integer.parseInt(id), password);
    }

    private void fillDataBase(){
        dataBase.addUser("Jacek", 20, "pilka");
        dataBase.addUser("Marek", 33, "hulajnoga");
        dataBase.addUser("Sebastian", 78, "komputer");
    }
}
