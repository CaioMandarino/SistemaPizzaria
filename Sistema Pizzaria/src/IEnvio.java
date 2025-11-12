/**
 * GRASP: PURE FABRICATION (interface)
    * Define o contrato para o serviço de envio.
    * Separa a responsabilidade de entrega do fluxo principal de negócio.
    * Alta coesão e baixo acoplamento entre o Controller e o serviço concreto.
 */
public interface IEnvio {
    void enviarPizza(Pizza pizza, String endereco);
}
