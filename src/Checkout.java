public class Checkout {
    private CarrinhoDeCompras carrinho;
    private CadastroCliente cliente;
    private double taxaFrete;
    private double taxaImposto;
    private double desconto;

    // Construtor
    public Checkout(CarrinhoDeCompras carrinho, CadastroCliente cliente, double taxaFrete, double taxaImposto) {
        this.carrinho = carrinho;
        this.cliente = cliente;
        this.taxaFrete = taxaFrete;
        this.taxaImposto = taxaImposto;
        this.desconto = 0.0;
    }

    // Método para aplicar um desconto
    public void aplicarDesconto(double valorDesconto) {
        this.desconto = valorDesconto;
    }

    // Método para calcular o valor total dos itens no carrinho com frete, imposto e desconto aplicados
    public double calcularTotal() {
        double subtotal = carrinho.calcularTotal();
        double valorImposto = subtotal * taxaImposto;
        double total = subtotal + valorImposto + taxaFrete - desconto;
        return total;
    }

    // Método para processar o pagamento (simulação)
    public boolean processarPagamento(String metodoPagamento) {
        double total = calcularTotal();
        System.out.println("Processando pagamento...");
        System.out.println("Método de pagamento: " + metodoPagamento);
        System.out.println("Total a pagar: R$ " + total);

        // Aqui estaria a lógica de integração com um gateway de pagamento (ex: PayPal, Stripe, etc.)
        System.out.println("Pagamento realizado com sucesso!");
        return true;
    }

    // Método para exibir o resumo do pedido
    public void exibirResumoPedido() {
        System.out.println("Resumo do Pedido:");
        carrinho.listarItens();
        System.out.println("Frete: R$ " + taxaFrete);
        System.out.println("Imposto: " + (carrinho.calcularTotal() * taxaImposto));
        System.out.println("Desconto: R$ " + desconto);
        System.out.println("Total: R$ " + calcularTotal());
    }
}
