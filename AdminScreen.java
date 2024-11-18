package src;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminScreen extends JFrame {

    public AdminScreen() {
        setTitle("Tela do Admin");
        setSize(600, 400);  // Ajustado para acomodar os botões
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setLocationRelativeTo(null); 

        // Criando os componentes da tela
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Bem-vindo, Admin!");

        JButton botaoCadastroCliente = new JButton("Cadastro Cliente");
        JButton botaoCadastroFornecedor = new JButton("Cadastro Fornecedor");
        JButton botaoRelatorioProducao = new JButton("Relatório de Produção");
        JButton botaoRelatorioVendas = new JButton("Relatório de Vendas");
        JButton botaoRelatorioEstoque = new JButton("Relatório de Estoque");
        JButton botaoRelatorioFornecedores = new JButton("Relatório de Fornecedores");

        // Adicionando os componentes ao painel
        panel.add(label);
        panel.add(botaoCadastroCliente);
        panel.add(botaoCadastroFornecedor);
        panel.add(botaoRelatorioProducao);
        panel.add(botaoRelatorioVendas);
        panel.add(botaoRelatorioEstoque);
        panel.add(botaoRelatorioFornecedores);

        add(panel);

        // Adicionando os eventos para os botões
        botaoCadastroCliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new CadastroCliente(); // Abre a tela de cadastro de cliente
            }
        });

        botaoCadastroFornecedor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new CadastroFornecedor(); // Abre a tela de cadastro de fornecedor
            }
        });

        botaoRelatorioProducao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new RelatorioProducao(); // Abre a tela de relatório de produção
            }
        });

        botaoRelatorioVendas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new RelatorioVendas(); // Abre a tela de relatório de vendas
            }
        });

        botaoRelatorioEstoque.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new RelatorioEstoque(); // Abre a tela de relatório de estoque
            }
        });

        botaoRelatorioFornecedores.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new RelatorioFornecedores(); // Abre a tela de relatório de fornecedores
            }
        });

        setVisible(true);
    }
}
