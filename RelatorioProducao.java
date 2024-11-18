package src;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class RelatorioProducao extends JFrame {
    
    public RelatorioProducao() {
        setTitle("Relatório de Produção");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        // Criando dados fictícios para o relatório
        String[] colunas = {"Produto", "Quantidade", "Data"};
        Object[][] dados = {
            {"Alface", 50, "10/11/2024"},
            {"Tomate", 30, "09/11/2024"},
            {"Cenoura", 100, "08/11/2024"}
        };

        JTable tabela = new JTable(dados, colunas);
        JScrollPane scrollPane = new JScrollPane(tabela);
        add(scrollPane);

        setVisible(true);
    }
}
