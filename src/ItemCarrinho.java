
public class ItemCarrinho {
    private Produto produto;
    private int quantidade;

    // Construtor
    public ItemCarrinho(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    // Getters e Setters
    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    // Método para calcular o subtotal (quantidade * preço do produto)
    public double calcularSubtotal() {
        return produto.getPreco() * quantidade;
    }

    @Override
    public String toString() {
        return "Produto: " + produto.getNome() + " | Quantidade: " + quantidade + " | Subtotal: R$ " + calcularSubtotal();
    }
}