import java.util.ArrayList;
import java.util.Scanner;

public class Controle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Aluno> listaAlunos = new ArrayList<>();

        System.out.println("--- Cadastro de Alunos ---");

        // Loop para leitura dos dados
        while (true) {
            System.out.print("Digite o nome do aluno (ou 'fim' para encerrar): ");
            String nome = scanner.nextLine();

            // Verifica se o usuário deseja encerrar o programa
            if (nome.equalsIgnoreCase("fim")) {
                break;
            }

            System.out.print("Digite a primeira nota parcial (0 a 100): ");
            int nota1 = scanner.nextInt();

            System.out.print("Digite a segunda nota parcial (0 a 100): ");
            int nota2 = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer do teclado

            // Instancia o objeto Aluno e adiciona à lista
            Aluno aluno = new Aluno(nome, nota1, nota2);
            listaAlunos.add(aluno);
            System.out.println("Aluno cadastrado com sucesso!\n");
        }

        // Se nenhum aluno foi cadastrado, encerra o programa de forma segura
        if (listaAlunos.isEmpty()) {
            System.out.println("Nenhum aluno foi cadastrado.");
            scanner.close();
            return;
        }

        // Variáveis para as estatísticas
        double somaDasMedias = 0;
        int aprovados = 0;
        int naFinal = 0;
        int reprovados = 0;

        // Primeiro passo: Calcular soma das médias e contar situações
        // Regra de negócio assumida: Aprovado >= 70, Final >= 40 e < 70, Reprovado < 40
        for (Aluno aluno : listaAlunos) {
            double media = aluno.calcularMediaIndividual();
            somaDasMedias += media;

            if (media >= 70) {
                aprovados++;
            } else if (media >= 40) {
                naFinal++;
            } else {
                reprovados++;
            }
        }

        // Cálculo da média da turma
        double mediaDaTurma = somaDasMedias / listaAlunos.size();

        // Exibição dos resultados finais
        System.out.println("\n--- Estatísticas da Turma ---");
        System.out.printf("Média da turma: %.2f%n", mediaDaTurma);
        System.out.println("Quantidade de alunos aprovados: " + aprovados);
        System.out.println("Quantidade de alunos na final: " + naFinal);
        System.out.println("Quantidade de alunos reprovados: " + reprovados);

        // Exibir alunos abaixo da média da turma
        // Nota: Como o enunciado pede "códigos" mas a classe não possui atributo ID/Código,
        // exibiremos o nome dos alunos que ficaram abaixo da média da turma.
        System.out.println("\nAlunos com nota abaixo da média da turma:");
        boolean encontrouAbaixoDaMedia = false;
        for (Aluno aluno : listaAlunos) {
            if (aluno.calcularMediaIndividual() < mediaDaTurma) {
                System.out.println("- " + aluno.getNome() + " (Média: " + aluno.calcularMediaIndividual() + ")");
                encontrouAbaixoDaMedia = true;
            }
        }

        if (!encontrouAbaixoDaMedia) {
            System.out.println("Nenhum aluno ficou abaixo da média da turma.");
        }

        scanner.close();
    }
}
