import java.util.ArrayList;
import java.util.List;

public class CatalogoProduto {
    private List<Produto> listaProdutos;

    // Construtor
    public CatalogoProduto() {
        listaProdutos = new ArrayList<>();
    }

    // Método para adicionar um produto ao catálogo
    public void adicionarProduto(Produto produto) {
        listaProdutos.add(produto);
        System.out.println("Produto adicionado ao catálogo: " + produto.getNome());
    }

    // Método para remover um produto do catálogo por nome
    public void removerProduto(String nome) {
        Produto produtoARemover = null;
        for (Produto produto : listaProdutos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                produtoARemover = produto;
                break;
            }
        }
        if (produtoARemover != null) {
            listaProdutos.remove(produtoARemover);
            System.out.println("Produto removido do catálogo: " + nome);
        } else {
            System.out.println("Produto não encontrado: " + nome);
        }
    }

    // Método para listar todos os produtos no catálogo
    public void listarProdutos() {
        if (listaProdutos.isEmpty()) {
            System.out.println("O catálogo está vazio.");
        } else {
            System.out.println("Catálogo de Produtos:");
            for (Produto produto : listaProdutos) {
                System.out.println(produto);
                System.out.println("-----------------------");
            }
        }
    }

    // Método para buscar um produto por nome
    public Produto buscarProduto(String nome) {
        for (Produto produto : listaProdutos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                return produto;
            }
        }
        System.out.println("Produto não encontrado: " + nome);
        return null;
    }
}
