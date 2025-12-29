import java.awt.*;
import java.awt.event.*;

public class LoginAWT extends Frame implements ActionListener {

    TextField user = new TextField();
    TextField pass = new TextField();
    Label result = new Label("");

    LoginAWT() {
        setTitle("Login");

        pass.setEchoChar('*');
        Button login = new Button("Login");

        login.addActionListener(this);
        pass.addActionListener(this);

        setLayout(new GridLayout(4, 2, 10, 10));

        add(new Label("Username:"));
        add(user);

        add(new Label("Password:"));
        add(pass);

        add(login);
        add(result);

        // Close window properly (Java 21 safe)
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
                System.exit(0);
            }
        });

        setSize(300, 180);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (user.getText().equals("admin") && pass.getText().equals("123"))
            result.setText("Login Successful");
        else
            result.setText("Login Failed");
    }

    public static void main(String[] args) {
        new LoginAWT();
    }
}