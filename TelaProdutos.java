package src;

import javax.swing.*;

public class TelaProdutos extends JFrame {
    
    public TelaProdutos() {
        setTitle("Produtos Disponíveis");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        // Exemplo de dados fictícios
        String[] colunas = {"Produto", "Preço"};
        Object[][] dados = {
            {"Alface", 2.5},
            {"Tomate", 3.0},
            {"Cenoura", 2.0}
        };

        JTable tabela = new JTable(dados, colunas);
        JScrollPane scrollPane = new JScrollPane(tabela);
        add(scrollPane);

        setVisible(true);
    }
}
