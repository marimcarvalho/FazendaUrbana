package src;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroCliente extends JFrame {

    private JTextField campoNome;
    private JTextField campoEmail;
    private JPasswordField campoSenha;

    public CadastroCliente() {
        setTitle("Cadastro de Cliente");
        setSize(400, 300); 
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
        setLocationRelativeTo(null); 

        JPanel panel = new JPanel();
        JLabel labelNome = new JLabel("Nome:");
        campoNome = new JTextField(20);
        JLabel labelEmail = new JLabel("Email:");
        campoEmail = new JTextField(20);
        JLabel labelSenha = new JLabel("Senha:");
        campoSenha = new JPasswordField(20);

        JButton botaoCadastrar = new JButton("Cadastrar");

        panel.add(labelNome);
        panel.add(campoNome);
        panel.add(labelEmail);
        panel.add(campoEmail);
        panel.add(labelSenha);
        panel.add(campoSenha);
        panel.add(botaoCadastrar);

        add(panel);

        botaoCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadastrarCliente();
            }
        });

        setVisible(true);
    }

    private void cadastrarCliente() {
        String nome = campoNome.getText();
        String email = campoEmail.getText();
        String senha = new String(campoSenha.getPassword());

        // A lógica de cadastro pode ser inserida aqui (salvar em uma base de dados, por exemplo)
        JOptionPane.showMessageDialog(this, "Cliente " + nome + " cadastrado com sucesso!");
        dispose();
    }
}
