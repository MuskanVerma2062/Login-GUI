import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//import static javax.swing.JOptionPane.showMessageDialog;

public class UserLogin implements ActionListener {

    private static JTextField textFname;
    private static JTextField textLname;
    private static JLabel password;
    private static JLabel success;
    private static JLabel label;
    private static JLabel label2;
    private static JPasswordField passwordField;
    private static JButton button;

    public static void main(String[] args) {

        JPanel panel = new JPanel();
        JFrame frame = new JFrame("User Login");
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.add(panel);
        panel.setLayout(null);

        label = new JLabel("First Name:");
        label.setBounds(10, 30, 150, 25);
        panel.add(label);

        label2 = new JLabel("Last Name:");
        label2.setBounds(10, 60, 150, 25);
        panel.add(label2);

        textFname = new JTextField();
        textFname.setBounds(120, 30, 150, 25);
        panel.add(textFname);

        textLname = new JTextField();
        textLname.setBounds(120, 60, 150, 25);
        panel.add(textLname);

        password = new JLabel("Password:");
        password.setBounds(10, 90, 150, 25);
        panel.add(password);

        passwordField = new JPasswordField();
        passwordField.setBounds(120, 90, 150, 25);
        panel.add(passwordField);

        button = new JButton("Login");
        button.setBounds(145, 150, 100, 30);
        button.setBackground(Color.BLACK);
        button.setForeground(Color.CYAN);
        button.addActionListener(new UserLogin());
        panel.add(button);

        success = new JLabel("");
        success.setBounds(10, 210, 300, 25);
        panel.add(success);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String fname = textFname.getText();
        String lname = textLname.getText();
        String passcode = passwordField.getText();
        System.out.println(fname + " " + lname + " " + passcode);
        JFrame f = new JFrame();

        if (fname.equals("Muskan") && lname.equals("Verma") && passcode.equals("sunflower")) {
            success.setText("User Logged-in!");

            JOptionPane.showMessageDialog(f, "Login Successful!");
        }else{
            JOptionPane.showMessageDialog(f, "Invalid Password. Try Again!");
        }
    }
}
