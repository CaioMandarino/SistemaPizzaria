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
