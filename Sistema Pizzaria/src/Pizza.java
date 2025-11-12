/**
 * GRASP: POLYMORPHISM
 *  - Define o comportamento comum de todas as pizzas.
 *  - Cada subtipo implementa o método conforme suas particularidades.
 *  - Elimina o uso de “if/switch” em outros pontos do código.
 */

public interface Pizza {
    public void fazerPizza();

    public String getNome();
}
