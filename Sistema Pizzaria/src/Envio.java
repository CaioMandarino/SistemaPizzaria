/**
 * GRASP: PURE FABRICATION:
     * Classe criada artificialmente para separar a responsabilidade de envio.
 */
public class Envio implements IEnvio {
    @Override
    public void enviarPizza(Pizza pizza, String endereco) {
        System.out.println("Enviado a pizza: " + pizza.getNome() + " para o endereço: " + endereco);
    }
}
