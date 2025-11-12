/**
 * GRASP: CREATOR (interface)
    * Define o contrato para criação de objetos Pizza.
    * Favorece Baixo Acoplamento, pois o Controller não precisa conhecer a implementação concreta.
 */
public interface IPizzaFactory {
    Pizza criarPizza(String nome);
}