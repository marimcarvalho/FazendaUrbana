package src;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class RelatorioVendas extends JFrame {
    
    public RelatorioVendas() {
        setTitle("Relatório de Vendas");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        String[] colunas = {"Produto", "Quantidade", "Data da Venda"};
        Object[][] dados = {
            {"Alface", 30, "10/11/2024"},
            {"Tomate", 20, "09/11/2024"},
            {"Cenoura", 60, "08/11/2024"}
        };

        JTable tabela = new JTable(dados, colunas);
        JScrollPane scrollPane = new JScrollPane(tabela);
        add(scrollPane);

        setVisible(true);
    }
}
