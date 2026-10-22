 import java.util.Locale;
import java.util.Scanner;

class SaldoInsuficienteException extends Exception {
    private double saldoDisponivel;
    private double valorSolicitado;

    public SaldoInsuficienteException(double saldoDisponivel, double valorSolicitado) {
        super(String.format("Saldo insuficiente. Saldo disponível: R$ %.2f.", saldoDisponivel));
        this.saldoDisponivel = saldoDisponivel;
        this.valorSolicitado = valorSolicitado;
    }

    public double getSaldoDisponivel() {
        return saldoDisponivel;
    }

    public double getValorSolicitado() {
        return valorSolicitado;
    }
}

public class SimuladorSaque {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        try {
            System.out.print("Saldo disponível: ");
            double saldo = scanner.nextDouble();

            System.out.print("Valor do saque: ");
            double valorSaque = scanner.nextDouble();

            if (valorSaque <= 0) {
                throw new IllegalArgumentException("Erro: O valor do saque deve ser maior que zero.");
            }

            if (valorSaque > saldo) {
                throw new SaldoInsuficienteException(saldo, valorSaque);
            }

            saldo -= valorSaque;
            System.out.printf("Saque realizado. Novo saldo: R$ %.2f.%n", saldo);

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro: Entrada inválida.");
        } finally {
            System.out.println("Operação finalizada.");
            scanner.close();
        }
    }
}
