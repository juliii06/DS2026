package alice.sai.pkgdo.celular;

import java.util.Scanner;

public class AliceSaiDoCelular {


    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
        
        System.out.println("Informe o número de A");
        
        int a = scan.nextInt();
        
        System.out.println("Informe o número de B");
        int b = scan.nextInt();
        
        System.out.println("Qual operação você deseja utilizar? 1 - Adição, 2 - Subtração, 3 - Divisão , 4 - Multiplicação");
        int operaçao = scan.nextInt();
        
      if(operaçao == 1){
          double result = a + b;
          System.out.println("result");
      }
      if (operaçao == 2){
          double result = a - b;
          System.out.println("result");
      }
        if (operaçao == 3){
          double result = a / b;
            System.out.println("result");
      }
          if (operaçao == 4){
          double result = a * b;
              System.out.println(result);
      }
        
    }
}

