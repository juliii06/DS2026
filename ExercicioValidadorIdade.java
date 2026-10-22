import java.util.Scanner;

// Exceção personalizada
class IdadeInvalidaException extends Exception {
    public IdadeInvalidaException(String mensagem) {
        super(mensagem);
    }
}

public class ExercicioValidadorIdade {

    public static void validarIdade(int idade) throws IdadeInvalidaException {
        if (idade > 120) {
            throw new IdadeInvalidaException("Idade inválida!");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite sua idade: ");
            int idade = scanner.nextInt();

            validarIdade(idade);
            System.out.println("Idade válida!");

        } catch (IdadeInvalidaException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Por favor, digite um número inteiro válido.");
        } finally {
            scanner.close();
        }
    }
}
