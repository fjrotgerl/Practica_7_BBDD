import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Kekko on 23/05/2017.
 */
public class AñadirSocioForm {
    private JPanel añadirSociPanel;
    private JTextField nameText;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JComboBox comboBox3;
    private JRadioButton hombreRadioButton;
    private JRadioButton mujerRadioButton;
    private JButton guardarButton;
    private JButton cancelarButton;
    private JTextField idText;
    private JTextField primerApellido;
    private JTextField segundoApellido;
    private JTextField dniText;
    private JTextField direccionText;
    private JTextField cpText;
    private JTextField provinciaText;
    private JTextField paisText;
    private JTextField tel1Text;
    private JTextField tel2Text;
    private JTextField emailText;

    public AñadirSocioForm() {
        cancelarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) Main.frame.getContentPane().getLayout();
                cl.show(Main.frame.getContentPane(),"inicioPanel");
                Main.configSimple(Main.frame,"Inicio");
            }
        });
    }

    public JPanel getAñadirSociPanel() {
        return añadirSociPanel;
    }
}
