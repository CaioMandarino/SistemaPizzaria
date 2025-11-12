/**
 * GRASP: POLYMORPHISM
    * Implementa o comportamento específico da pizza Calabresa.
    * Garante alta coesão, pois contém apenas lógica referente a esse tipo de pizza.
 */
public class Calabresa implements Pizza {
    public String nome = "Calabresa";

    @Override
    public void fazerPizza() {
        System.out.println("Fazendo a Pizza: " + nome);
        adicionarCalabresa();
    }

    @Override
    public String getNome() {
        return nome;
    }

    private void adicionarCalabresa() {
        System.out.println("Adicionando calebresa");
    }
}
