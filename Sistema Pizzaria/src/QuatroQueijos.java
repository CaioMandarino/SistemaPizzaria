public class QuatroQueijos implements Pizza {
    public String nome = "Quatro Queijos";

    @Override
    public void fazerPizza() {
        System.out.println("Fazendo a Pizza: " + nome);
        adicionarQueijo();
    }

    @Override
    public String getNome() {
        return nome;
    }

    private void adicionarQueijo() {
        System.out.println("Adicionando queijo");
    }
}
