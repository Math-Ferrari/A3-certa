public class pessoa {
    private String nome;
    private int idade;

    public pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome + ", Idade: " + idade);
    }
}