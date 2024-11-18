package src;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroFornecedor extends JFrame {

    private JTextField campoNome;
    private JTextField campoCNPJ;
    private JTextField campoEmail;

    public CadastroFornecedor() {
        setTitle("Cadastro de Fornecedor");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Fecha somente a tela de cadastro
        setLocationRelativeTo(null); 

        JPanel panel = new JPanel();
        JLabel labelNome = new JLabel("Nome:");
        campoNome = new JTextField(20);
        JLabel labelCNPJ = new JLabel("CNPJ:");
        campoCNPJ = new JTextField(20);
        JLabel labelEmail = new JLabel("Email:");
        campoEmail = new JTextField(20);

        JButton botaoCadastrar = new JButton("Cadastrar");

        panel.add(labelNome);
        panel.add(campoNome);
        panel.add(labelCNPJ);
        panel.add(campoCNPJ);
        panel.add(labelEmail);
        panel.add(campoEmail);
        panel.add(botaoCadastrar);

        add(panel);

        botaoCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadastrarFornecedor();
            }
        });

        setVisible(true);
    }

    private void cadastrarFornecedor() {
        String nome = campoNome.getText();
        String cnpj = campoCNPJ.getText();
        String email = campoEmail.getText();

        // A lógica de cadastro pode ser inserida aqui (salvar em uma base de dados, por exemplo)
        JOptionPane.showMessageDialog(this, "Fornecedor " + nome + " cadastrado com sucesso!");
        dispose();
    }
}
