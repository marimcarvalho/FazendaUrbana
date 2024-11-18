package src;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private List<String> produtos;

    public Estoque() {
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(String produto) {
        produtos.add(produto);
    }

    public void exibirEstoque() {
        if (produtos.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Estoque vazio!", "Estoque", JOptionPane.INFORMATION_MESSAGE);
        } else {
            String[][] data = new String[produtos.size()][1];
            String[] columnNames = {"Produto"};

            for (int i = 0; i < produtos.size(); i++) {
                data[i][0] = produtos.get(i);
            }

            JTable table = new JTable(data, columnNames);
            JScrollPane scrollPane = new JScrollPane(table);
            JFrame frame = new JFrame("Estoque de Produtos");
            frame.setSize(400, 300);
            frame.add(scrollPane);
            frame.setVisible(true);
        }
    }
}
