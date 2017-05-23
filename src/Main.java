import javax.swing.*;
/**
 * Created by Kekko on 23/05/2017.
 */
public class Main {
    public static void main(String[] args) {
        LoginForm lf = new LoginForm();
        JFrame frame = new JFrame("Login");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setVisible(true);
        frame.setContentPane(lf.getLoginPanel());
    }
}
