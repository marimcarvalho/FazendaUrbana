package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaCompra extends JFrame {
    private JPanel panel;
    private JComboBox<String> comboPagamento;
    private JButton btnEmitirNotaFiscal, btnFinalizarCompra;

    public TelaCompra() {
        // Configuração da tela
        setTitle("Tela de Compra");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1));

        // Opções de pagamento
        comboPagamento = new JComboBox<>(new String[]{"Pix", "Débito", "Crédito"});

        // Botões
        btnEmitirNotaFiscal = new JButton("Emitir Nota Fiscal");
        btnFinalizarCompra = new JButton("Finalizar Compra");

        panel.add(comboPagamento);
        panel.add(btnEmitirNotaFiscal);
        panel.add(btnFinalizarCompra);

        add(panel);

        // Ação para emitir a nota fiscal
        btnEmitirNotaFiscal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Nota Fiscal emitida com sucesso!");
            }
        });

        // Ação para finalizar a compra
        btnFinalizarCompra.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String pagamentoSelecionado = (String) comboPagamento.getSelectedItem();
                JOptionPane.showMessageDialog(null, "Compra finalizada com pagamento via: " + pagamentoSelecionado);
                dispose();  // Fecha a tela de compra
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TelaCompra());
    }
}
