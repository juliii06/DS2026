package vetor;

import java.util.Scanner;

public class Vetor {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
  
        double[] resultados = new double[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("\n--- Rodada " + (i + 1) + " ---");
            
            System.out.print("Digite o primeiro numero: ");
            double n1 = leitor.nextDouble();
            
            System.out.print("Digite o segundo numero: ");
            double n2 = leitor.nextDouble();
            

            resultados[i] = n1 + n2;
            
            System.out.println("Resultado da rodada " + (i + 1) + " guardado: " + resultados[i]);
        }


        System.out.println("\n======= RELATÓRIO FINAL =======");
        for (int i = 0; i < resultados.length; i++) {
            System.out.println("Soma " + (i + 1) + ": " + resultados[i]);
        }

        leitor.close();
    }
}
