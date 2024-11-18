package src;

import java.util.ArrayList;
import java.util.List;

public class DataStorage {
    // Listas para armazenar clientes, fornecedores, estoque, etc.
    private static List<Cliente> clientes = new ArrayList<>();
    private static List<Fornecedor> fornecedores = new ArrayList<>();
    private static List<Produto> estoque = new ArrayList<>();

    // Método para adicionar um cliente
    public static void addCliente(Cliente cliente) {
        clientes.add(cliente);  // Adiciona cliente à lista
    }

    // Método para obter a lista de clientes
    public static List<Cliente> getClientes() {
        return clientes;
    }

    // Método para adicionar um fornecedor
    public static void addFornecedor(Fornecedor fornecedor) {
        fornecedores.add(fornecedor);
    }

    // Método para obter a lista de fornecedores
    public static List<Fornecedor> getFornecedores() {
        return fornecedores;
    }

    // Método para adicionar um produto ao estoque
    public static void addProdutoAoEstoque(Produto produto) {
        estoque.add(produto);
    }

    // Método para obter a lista de produtos do estoque
    public static List<Produto> getEstoque() {
        return estoque;
    }

    public static List<Producao> getProducoes() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getProducoes'");
    }
}
