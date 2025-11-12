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
