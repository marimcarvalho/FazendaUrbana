package src;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginScreen extends JFrame {
    private JTextField campoUsuario;
    private JPasswordField campoSenha;

    public LoginScreen() {
        // Configurações da janela
        setTitle("Tela de Login");
        setSize(400, 300); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setLocationRelativeTo(null); 

        // Adicionando componentes à tela
        JPanel panel = new JPanel();

        JLabel labelUsuario = new JLabel("Usuário:");
        campoUsuario = new JTextField(20);
        JLabel labelSenha = new JLabel("Senha:");
        campoSenha = new JPasswordField(20);

        JButton botaoLogin = new JButton("Login");

        panel.add(labelUsuario);
        panel.add(campoUsuario);
        panel.add(labelSenha);
        panel.add(campoSenha);
        panel.add(botaoLogin);

        add(panel);

        botaoLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                verificarLogin();
            }
        });

        setVisible(true);
    }

    private void verificarLogin() {
        String usuario = campoUsuario.getText();
        String senha = new String(campoSenha.getPassword());

        if (usuario.equals("admin") && senha.equals("senha123")) {
            JOptionPane.showMessageDialog(this, "Login bem-sucedido como Admin!");
            new AdminScreen();
            dispose();
        } else if (usuario.equals("cliente") && senha.equals("cliente123")) {
            JOptionPane.showMessageDialog(this, "Login bem-sucedido como Cliente!");
            new ClienteScreen();
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Usuário ou senha incorretos", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
