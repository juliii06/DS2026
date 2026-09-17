import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        // Configura o scanner para aceitar pontos em números decimais (ex: 7.5)
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        ArrayList<Double> notas = new ArrayList<>();
        int opcao = 0;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Adicionar nota");
            System.out.println("2 - Remover nota por posição");
            System.out.println("3 - Listar notas");
            System.out.println("4 - Calcular média");
            System.out.println("5 - Ordenar notas");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            
            if (scanner.hasNextInt()) {
                opcao = scanner.nextInt();
            } else {
                System.out.println("Opção inválida!");
                scanner.next(); // Limpa o buffer
                continue;
            }

            switch (opcao) {
                case 1:
                    System.out.print("Digite a nota a ser adicionada: ");
                    double novaNota = scanner.nextDouble();
                    notas.add(novaNota);
                    System.out.println("Nota adicionada com sucesso!");
                    break;

                case 2:
                    if (notas.isEmpty()) {
                        System.out.println("A lista está vazia.");
                    } else {
                        System.out.println("Notas cadastradas:");
                        for (int i = 0; i < notas.size(); i++) {
                            System.out.println("[" + i + "] -> " + notas.get(i));
                        }
                        System.out.print("Digite o índice da nota que deseja remover: ");
                        int indice = scanner.nextInt();
                        if (indice >= 0 && indice < notas.size()) {
                            notas.remove(indice);
                            System.out.println("Nota removida com sucesso!");
                        } else {
                            System.out.println("Índice inválido!");
                        }
                    }
                    break;

                case 3:
                    if (notas.isEmpty()) {
                        System.out.println("Nenhuma nota cadastrada.");
                    } else {
                        System.out.println("Notas cadastradas: " + notas);
                    }
                    break;

                case 4:
                    if (notas.isEmpty()) {
                        System.out.println("Não há notas para calcular a média.");
                    } else {
                        double soma = 0;
                        for (double nota : notas) {
                            soma += nota;
                        }
                        double media = soma / notas.size();
                        System.out.printf("Média das notas: %.2f\n", media);
                    }
                    break;

                case 5:
                    if (notas.isEmpty()) {
                        System.out.println("A lista está vazia.");
                    } else {
                        Collections.sort(notas);
                        System.out.println("Notas ordenadas com sucesso: " + notas);
                    }
                    break;

                case 0:
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
