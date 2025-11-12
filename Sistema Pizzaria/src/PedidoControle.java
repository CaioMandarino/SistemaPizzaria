/**
 * Controller: recebe o evento de sistema "fazerPedido" e coordena o caso de uso.
 * Não cria objetos concretos nem executa regra de negócio: delega para serviços/fábricas.
 */
public class PedidoControle {

    public void fazerPedido(String nome, String endereco) {
        CriarPizza criarPizza = new CriarPizza();
        Pizza pizza = criarPizza.fazerPizza(nome);

        if (pizza == null) {
            return;
        }

        pizza.fazerPizza();
        Envio envio = new Envio();
        envio.enviarPizza(pizza, endereco);
    }
}
