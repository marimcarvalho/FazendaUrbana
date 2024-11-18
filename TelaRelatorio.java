package src;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaRelatorio extends JFrame {
    private JPanel panel;
    private JTable tabelaRelatorio;
    private JButton btnVoltar, btnExportar;

    public TelaRelatorio() {
        // Configuração da tela
        setTitle("Relatório de Vendas");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(new BorderLayout());

        // Criar os dados fictícios para o relatório
        String[] colunas = {"ID", "Produto", "Quantidade", "Preço", "Total"};
        Object[][] dados = {
            {1, "Produto A", 10, 50.0, 500.0},
            {2, "Produto B", 5, 100.0, 500.0},
            {3, "Produto C", 2, 200.0, 400.0},
            {4, "Produto D", 7, 70.0, 490.0},
            {5, "Produto E", 3, 150.0, 450.0}
        };

        // Criar a tabela com os dados fictícios
        tabelaRelatorio = new JTable(dados, colunas);
        JScrollPane scrollPane = new JScrollPane(tabelaRelatorio);
        panel.add(scrollPane, BorderLayout.CENTER);

        // Botões de ação
        JPanel botoesPanel = new JPanel();
        botoesPanel.setLayout(new FlowLayout());
        
        btnVoltar = new JButton("Voltar");
        btnExportar = new JButton("Exportar");

        botoesPanel.add(btnVoltar);
        botoesPanel.add(btnExportar);
        
        panel.add(botoesPanel, BorderLayout.SOUTH);
        
        add(panel);

        // Ação para o botão "Voltar"
        btnVoltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Fechar a tela de relatórios e voltar para a tela anterior (AdminScreen ou outra)
                dispose();
            }
        });

        // Ação para o botão "Exportar"
        btnExportar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Aqui você pode implementar a lógica de exportar os dados do relatório
                JOptionPane.showMessageDialog(null, "Relatório exportado com sucesso!");
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TelaRelatorio());
    }
}
