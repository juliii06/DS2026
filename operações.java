
package operações;

import java.util.Scanner;

public class Operações {


   
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        
           System.out.println ("Digite um número: ");
        int num1 = sc.nextInt( );
         
            System.out.println ("Digite o segundo número: ");
         int num2 = sc.nextInt( );
         
            System.out.println("Fale a operação que deseja");
                System.out.println("soma:digite 0, subtração:digite 1, multiplicação:digite 2");
                double op = sc.nextDouble(); 
             
        if (op == 0){
        System.out.println ("A soma dos números é: " + (num1 + num2));
    }  else if (op == 1){
        System.out.println ("A subtração dos números é: " + (num1 - num2));
            } else if (op == 2){
        System.out.println("A multiplicação dos números é: " + (num1 * num2));
            } else{
            System.out.println("Opção inválida");
            }
        
    }  
}
