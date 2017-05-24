import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Kekko on 24/05/2017.
 */
public class InicioForm {
    private JPanel inicioPanel;
    private JButton cambiarDeUsuarioButton;
    private JButton salirButton;

    public JPanel getInicioPanel() {
        return inicioPanel;
    }

    public InicioForm() {
        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }


    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
