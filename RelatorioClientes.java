package src;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class RelatorioClientes {

    // Construtor para exibir o relatório
    public RelatorioClientes() {
        // Recupera a lista de clientes do DataStorage
        List<Cliente> clientes = DataStorage.getClientes();

        // Cria a janela de relatório
        JFrame frame = new JFrame("Relatório de Clientes - Fazenda Urbana");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Cria a tabela com os dados dos clientes
        String[] colunas = {"Nome", "E-mail"};
        String[][] dados = new String[clientes.size()][2];

        // Preenche os dados da tabela
        for (int i = 0; i < clientes.size(); i++) {
            Cliente cliente = clientes.get(i);
            dados[i][0] = cliente.getNome();
            dados[i][1] = cliente.getEmail();
        }

        // Cria a tabela
        JTable tabela = new JTable(dados, colunas);
        tabela.setFillsViewportHeight(true);

        // Cria um painel de rolagem para a tabela
        JScrollPane scrollPane = new JScrollPane(tabela);
        frame.add(scrollPane, BorderLayout.CENTER);

        // Exibe a janela
        frame.setVisible(true);
    }

    // Método main para testar a classe diretamente
    public static void main(String[] args) {
        // Inicializa o DataStorage e adiciona alguns clientes fictícios para teste
        DataStorage.addCliente(new Cliente("João Silva", "joao@exemplo.com", "senha123"));
        DataStorage.addCliente(new Cliente("Maria Souza", "maria@exemplo.com", "senha456"));
        DataStorage.addCliente(new Cliente("Carlos Oliveira", "carlos@exemplo.com", "senha789"));

        // Chama a classe RelatorioClientes para exibir o relatório
        new RelatorioClientes();
    }
}
