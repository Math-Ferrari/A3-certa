import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<aluno> listaAlunos = new ArrayList<>();
        int opcao = 0;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Listar alunos");
            System.out.println("3 - Mostrar média das notas");
            System.out.println("4 - Deletar aluno");
            System.out.println("5 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();

            switch(opcao) {
                case 1:
                    sc.nextLine();
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Idade: ");
                    int idade = sc.nextInt();
                    System.out.print("Nota: ");
                    double nota = sc.nextDouble();

                    aluno a = new aluno(nome, idade, nota);
                    listaAlunos.add(a);

                    System.out.println("Aluno cadastrado com sucesso!");
                    break;

                case 2:
                    if (listaAlunos.isEmpty()) {
                        System.out.println("Nenhum aluno cadastrado.");
                    } else {
                        System.out.println("\n--- Lista de Alunos ---");
                        for (int i = 0; i < listaAlunos.size(); i++) {
                            System.out.print((i + 1) + ". ");
                            listaAlunos.get(i).mostrarInformacoes();
                        }
                    }
                    break;

                case 3:
                    if (listaAlunos.isEmpty()) {
                        System.out.println("Nenhum aluno cadastrado para calcular média.");
                    } else {
                        double soma = 0;
                        for (aluno al : listaAlunos) {
                            soma += al.getNota();
                        }
                        double media = soma / listaAlunos.size();
                        System.out.printf("Média das notas dos alunos: %.2f\n", media);
                    }
                    break;

                case 4:
                    if (listaAlunos.isEmpty()) {
                        System.out.println("Nenhum aluno cadastrado para deletar.");
                    } else {
                        System.out.println("\n--- Lista de Alunos ---");
                        for (int i = 0; i < listaAlunos.size(); i++) {
                            System.out.println((i + 1) + " - " + listaAlunos.get(i).getNome());
                        }
                        System.out.print("Digite o número do aluno que deseja deletar: ");
                        int index = sc.nextInt();
                        if (index > 0 && index <= listaAlunos.size()) {
                            aluno removido = listaAlunos.remove(index - 1);
                            System.out.println("Aluno " + removido.getNome() + " removido com sucesso.");
                        } else {
                            System.out.println("Número inválido.");
                        }
                    }
                    break;

                case 5:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 5); //repete o menu

        sc.close();
    }
}
