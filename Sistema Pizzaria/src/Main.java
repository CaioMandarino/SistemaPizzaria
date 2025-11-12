import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu endereço: ");
        String endereco = scanner.nextLine();

        System.out.println("Digite o número de qual pizza deseja");
        System.out.println("[1] Calebresa");
        System.out.println("[2] Quatro Queijos");
        System.out.println("[3] Portuguesa");
        Integer opcao = scanner.nextInt();

        String nomePizza;
        switch (opcao) {
            case 1:
                nomePizza = "Calabresa";
                break;
            case 2:
                nomePizza = "Quatro Queijos";
                break;
            case 3:
                nomePizza = "Portuguesa";
                break;
            default:
                nomePizza = "";
        }

        PedidoControle pedidoControle = new PedidoControle();

        pedidoControle.fazerPedido(nomePizza, endereco);
    }
}