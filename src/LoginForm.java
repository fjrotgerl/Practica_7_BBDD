import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Kekko on 23/05/2017.
 */
public class LoginForm {

    private JButton loginButton;
    private JFormattedTextField userName;
    private JPasswordField userPass;
    private JPanel loginPanel;

    public LoginForm() {
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Connected");
            }
        });
    }

    public JPanel getLoginPanel() {
        return loginPanel;
    }
}
