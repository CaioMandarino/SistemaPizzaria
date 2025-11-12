/**
 * Creator: centraliza a criação de pizzas e oculta as classes concretas do cliente.
 * O consumidor só precisa informar o tipo desejado; a decisão de qual subtipo de Pizza
 * instanciar fica encapsulada aqui. Isso reduz acoplamento, padroniza a criação e facilita
 * manutenção e extensão do código.
 */
public class CriarPizza {
    public Pizza fazerPizza(String nome) {
        switch (nome) {
            case "Portuguesa":
                return new Portuguesa();
            case "Quatro Queijos":
                return new QuatroQueijos();
            case "Calabresa":
                return new Calabresa();
        }
        return null;
    }
}

