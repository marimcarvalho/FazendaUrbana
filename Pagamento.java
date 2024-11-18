package src;

public class Pagamento {
    public static boolean processarPagamento(String formaPagamento, double valor) {
        // Simulação de pagamento: sempre retorna true (pagamento bem-sucedido)
        // Aqui podemos adicionar lógica real de processamento de pagamento
        System.out.println("Processando pagamento via " + formaPagamento + " de R$ " + valor);
        return true;
    }
}
