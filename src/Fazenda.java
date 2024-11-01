import java.util.Scanner;


public class Fazenda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Carrinho carrinho = new Carrinho();

        Produto produto1 = new Produto("abobrinha italiana", 40.00);
        Produto produto2 = new Produto("Cenoura", 50.00);
        Produto produto3 = new Produto("chuchu ", 20.00);

        boolean continuar = true;

        while (continuar) {
            System.out.println("\nBem-vindo ao Fazenda Urbana!");
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Adicionar abobrinha italiana ao carrinho");
            System.out.println("2 - Adicionar Cenoura ao carrinho");
            System.out.println("3 - Adicionar chuchu ao carrinho");
            System.out.println("4 - Exibir carrinho");
            System.out.println("5 - Finalizar compra");
            System.out.println("6 - Sair");
            System.out.print("Opção: ");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    carrinho.adicionarProduto(produto1);
                    break;
                case 2:
                    carrinho.adicionarProduto(produto2);
                    break;
                case 3:
                    carrinho.adicionarProduto(produto3);
                    break;
                case 4:
                    carrinho.exibirCarrinho();
                    break;
                case 5:
                    carrinho.finalizarCompra();
                    break;
                case 6:
                    continuar = false;
                    System.out.println("Obrigado por usar comprar!");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }

        scanner.close();
    }
}
