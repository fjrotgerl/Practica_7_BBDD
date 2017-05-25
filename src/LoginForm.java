import javax.swing.*;
import java.awt.*;
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
                InicioForm iniF = new InicioForm();

                JFrame frame = Main.frame;
                JPanel panel = new JPanel();

                panel.add(iniF.getInicioPanel(), "inicioPanel");
                panel.setLayout(new CardLayout());

                CardLayout cl = (CardLayout) panel.getLayout();
                cl.show(panel,"inicioPanel");
                Main.configSimple(frame,panel,"Inicio");
                Main.initMenu(frame);
            }
        });
    }

    public JPanel getLoginPanel() {
        return loginPanel;
    }

}
