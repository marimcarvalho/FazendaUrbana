import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<Produto> produtos;

    public Carrinho() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        System.out.println(produto.getNome() + " foi adicionado ao carrinho.");
    }

    public void removerProduto(Produto produto) {
        produtos.remove(produto);
        System.out.println(produto.getNome() + " foi removido do carrinho.");
    }

    public double calcularTotal() {
        double total = 0;
        for (Produto p : produtos) {
            total += p.getPreco();
        }
        return total;
    }

    public void exibirCarrinho() {
        if (produtos.isEmpty()) {
            System.out.println("O carrinho está vazio.");
        } else {
            System.out.println("Produtos no carrinho:");
            for (Produto p : produtos) {
                System.out.println(p);
            }
        }
    }

    public void finalizarCompra() {
        if (produtos.isEmpty()) {
            System.out.println("Carrinho vazio! Adicione produtos antes de finalizar a compra.");
        } else {
            System.out.println("Compra finalizada! Total a pagar: R$ " + calcularTotal());
            produtos.clear();
        }
    }
}
