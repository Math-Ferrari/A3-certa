public class aluno extends pessoa {
    private double nota;

    public aluno(String nome, int idade, double nota) {
        super(nome, idade);
        this.nota = nota;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome: " + getNome() + ", Idade: " + getIdade() + ", Nota: " + nota + ");
    }

    @Override
    public String toString() {
        return getNome() + " - " + getIdade() + " anos - Nota: " + nota + " - " + ;
    }
}