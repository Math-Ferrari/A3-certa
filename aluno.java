public class aluno extends pessoa {
    private double nota;

    public aluno(String nome, int idade, double nota) {
        super(nome, idade);// chama o construtor da classe pessoa
        this.nota = nota;// define a nota do aluno
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    
    }

    @Override //indica que você está sobrescrevendo um método que já existe na classe pai ou em object, ela pode sobreescrever o comportamento de métodos existentes como toString()
              
    public void mostrarInformacoes() {
        System.out.println("Nome: " + getNome() + ", Idade: " + getIdade() + ", Nota: " + nota + ");
    }

    @Override
    public String toString() {
        return getNome() + " - " + getIdade() + " anos - Nota: " + nota + " - " + ;
    }
}
