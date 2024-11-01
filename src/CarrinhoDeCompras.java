import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<ItemCarrinho> itens;

    // Construtor
    public CarrinhoDeCompras() {
        itens = new ArrayList<>();
    }

    // Método para adicionar um produto ao carrinho
    public void adicionarProduto(Produto produto, int quantidade) {
        for (ItemCarrinho item : itens) {
            if (item.getProduto().getNome().equalsIgnoreCase(produto.getNome())) {
                item.setQuantidade(item.getQuantidade() + quantidade);
                System.out.println("A quantidade do produto " + produto.getNome() + " foi atualizada.");
                return;
            }
        }
        itens.add(new ItemCarrinho(produto, quantidade));
        System.out.println("Produto " + produto.getNome() + " adicionado ao carrinho.");
    }

    // Método para remover um produto do carrinho
    public void removerProduto(String nomeProduto) {
        ItemCarrinho itemParaRemover = null;
        for (ItemCarrinho item : itens) {
            if (item.getProduto().getNome().equalsIgnoreCase(nomeProduto)) {
                itemParaRemover = item;
                break;
            }
        }
        if (itemParaRemover != null) {
            itens.remove(itemParaRemover);
            System.out.println("Produto " + nomeProduto + " removido do carrinho.");
        } else {
            System.out.println("Produto " + nomeProduto + " não encontrado no carrinho.");
        }
    }

    // Método para listar todos os itens do carrinho
    public void listarItens() {
        if (itens.isEmpty()) {
            System.out.println("O carrinho está vazio.");
        } else {
            System.out.println("Itens no carrinho:");
            for (ItemCarrinho item : itens) {
                System.out.println(item);
            }
            System.out.println("Total: R$ " + calcularTotal());
        }
    }

    // Método para calcular o total do carrinho
    public double calcularTotal() {
        double total = 0.0;
        for (ItemCarrinho item : itens) {
            total += item.calcularSubtotal();
        }
        return total;
    }

    // Método para esvaziar o carrinho
    public void esvaziarCarrinho() {
        itens.clear();
        System.out.println("O carrinho foi esvaziado.");
    }
}
