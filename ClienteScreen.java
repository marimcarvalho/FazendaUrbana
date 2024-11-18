package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClienteScreen extends JFrame {
    private JPanel panel;
    private JButton btnVisualizarProdutos, btnRealizarCompra, btnVerRelatorio;

    public ClienteScreen() {
        // Configuração da tela
        setTitle("Tela do Cliente");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1));

        // Botões de ação
        btnVisualizarProdutos = new JButton("Visualizar Produtos");
        btnRealizarCompra = new JButton("Realizar Compra");
        btnVerRelatorio = new JButton("Ver Relatório");

        panel.add(btnVisualizarProdutos);
        panel.add(btnRealizarCompra);
        panel.add(btnVerRelatorio);

        add(panel);

        // Adicionando listeners aos botões
        btnVisualizarProdutos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Abrir a tela de visualização de produtos
                new TelaProdutos();  // Supondo que você tenha a classe TelaProdutos
            }
        });

        btnRealizarCompra.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Abrir a tela de compra
                new TelaCompra();  // Supondo que você tenha a classe TelaCompra
            }
        });

        btnVerRelatorio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Abrir a tela de relatórios (como Relatório de Compras)
                new TelaRelatorio();  // Supondo que você tenha a classe TelaRelatorio
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        // Exemplo de como criar um cliente
        Cliente cliente = new Cliente("Maria Silva", "123.456.789-00", "maria@exemplo.com");
        
        // Exemplo de como mostrar os dados do cliente
        System.out.println(cliente);  // Imprime: Maria Silva (123.456.789-00)

        // Inicializando a tela do cliente
        SwingUtilities.invokeLater(() -> new ClienteScreen());
    }
}
