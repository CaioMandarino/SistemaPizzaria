import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu endereço: ");
        String endereco = scanner.nextLine();

        System.out.println("Digite o número da pizza desejada:");
        System.out.println("[1] Calabresa");
        System.out.println("[2] Quatro Queijos");
        System.out.println("[3] Portuguesa");
        int opcao = scanner.nextInt();

        String nomePizza = switch (opcao) {
            case 1 -> "Calabresa";
            case 2 -> "Quatro Queijos";
            case 3 -> "Portuguesa";
            default -> "";
        };

        // Injeção de dependências
        IPizzaFactory fabrica = new PizzaFactory();
        IEnvio envio = new Envio();

        // O Controller coordena o caso de uso
        PedidoController controller = new PedidoController(fabrica, envio);
        controller.fazerPedido(nomePizza, endereco);
    }
}
