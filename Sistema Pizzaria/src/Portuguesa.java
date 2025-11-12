/**
 * GRASP: POLYMORPHISM
 * Implementa o comportamento específico da pizza Portuguesa.
 * Garante alta coesão, pois contém apenas lógica referente a esse tipo de pizza.
 */
public class Portuguesa implements Pizza{
    public String nome = "Portuguesa";

    @Override
    public void fazerPizza() {
        System.out.println("Fazendo a Pizza: " + nome);
        adicionarOvo();
    }

    @Override
    public String getNome() {
        return nome;
    }

    private void adicionarOvo() {
        System.out.println("Adicionando ovos");
    }
}
