package src;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class RelatorioEstoque extends JFrame {
    
    public RelatorioEstoque() {
        setTitle("Relatório de Estoque");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        String[] colunas = {"Produto", "Estoque Atual"};
        Object[][] dados = {
            {"Alface", 200},
            {"Tomate", 150},
            {"Cenoura", 300}
        };

        JTable tabela = new JTable(dados, colunas);
        JScrollPane scrollPane = new JScrollPane(tabela);
        add(scrollPane);

        setVisible(true);
    }
}
