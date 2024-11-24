package view.segurança;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class LoginScreen extends JFrame {
    
    public LoginScreen() {
        setTitle("Banco Malvader - Login");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        
        JPanel panel = new JPanel();
        add(panel);
        panel.setLayout(null);
        
        JLabel userLabel = new JLabel("Usuário:");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);
        
        JTextField userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);
        
        JLabel passwordLabel = new JLabel("Senha:");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);
        
        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);
        
        JButton loginButton = new JButton("Login");
        loginButton.setBounds(10, 80, 80, 25);
        panel.add(loginButton);
        
        loginButton.addActionListener(e -> {
            String usuario = userText.getText();
            String senha = new String(passwordText.getPassword());
            if (usuario.equals("admin") && senha.equals("123")) {
                JOptionPane.showMessageDialog(this, "Login bem-sucedito");
            } else {
                JOptionPane.showMessageDialog(this, "Úsuario ou senha incorretos");
            }
        });
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            LoginScreen frame = new LoginScreen();
            frame.setVisible(true);
        });
    }
}
