package src;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class RelatorioFornecedores extends JFrame {
    
    public RelatorioFornecedores() {
        setTitle("Relatório de Fornecedores");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        String[] colunas = {"Fornecedor", "CNPJ", "Email"};
        Object[][] dados = {
            {"Fornecedor A", "12345678000123", "fornecedorA@email.com"},
            {"Fornecedor B", "98765432000123", "fornecedorB@email.com"}
        };

        JTable tabela = new JTable(dados, colunas);
        JScrollPane scrollPane = new JScrollPane(tabela);
        add(scrollPane);

        setVisible(true);
    }
}
