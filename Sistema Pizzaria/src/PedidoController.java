/**
 * GRASP: CONTROLLER
    * Atua como o Controller que coordena o caso de uso "Fazer Pedido".
    * Não executa regras de negócio nem cria objetos concretos.
    * Atribui funções para outras classes ("PizzaFactory" e "Envio").
    * Baixo acoplamento e alta coesão.
 *  */
public class PedidoController {
    private final IPizzaFactory fabrica;
    private final IEnvio envio;

    public PedidoController(IPizzaFactory fabrica, IEnvio envio) {
        this.fabrica = fabrica;
        this.envio = envio;
    }

    public void fazerPedido(String nome, String endereco) {
        Pizza pizza = fabrica.criarPizza(nome);

        if (pizza == null) {
            System.out.println("Tipo de pizza inválido!");
            return;
        }

        pizza.fazerPizza();
        envio.enviarPizza(pizza, endereco);
    }
}
