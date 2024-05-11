import java.util.Locale;
import java.util.Scanner;

public class ContaBancaria {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    System.out.println("Digite o número da sua conta bancária:");
    int numero = scanner.nextInt();

    System.out.println("Digite a agência da sua conta:");
    String agencia = scanner.next();

    System.out.println("Qual o seu nome?");
    String nomeCliente = scanner.next();

    double saldo = 1280.90;

    System.out.println("Olá, " + nomeCliente + ", Obrigado por criar uma conta em nosso banco, sua agência é " + agencia
        + ", conta " + numero + " e seu saldo " + saldo + " Já está disponível");
  }
}
