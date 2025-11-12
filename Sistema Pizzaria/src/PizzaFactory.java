/**
 * GRASP CREATOR:
 * Centraliza a criação de pizzas e oculta as classes concretas do cliente.
 * O consumidor só precisa informar o tipo desejado.
 * A decisão de qual subtipo de Pizza instanciar fica encapsulada aqui.
 * Reduz acoplamento, padroniza a criação e facilita manutenção e extensão do código.
 */
public class PizzaFactory implements IPizzaFactory {
    @Override
    public Pizza criarPizza(String nome) {
        return switch (nome) {
            case "Portuguesa" -> new Portuguesa();
            case "Quatro Queijos" -> new QuatroQueijos();
            case "Calabresa" -> new Calabresa();
            default -> null;
        };
    }
}
