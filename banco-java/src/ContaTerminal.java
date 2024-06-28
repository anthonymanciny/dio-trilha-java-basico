import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
   
    public static void main(String[] args) {
        
      Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

      System.out.println("Por favor, digite o Seu Nome");
      String nomecliente = scanner.next();

      System.out.println("Por favor, digite o número da sua Agencia");
      String agencia = scanner.next();

      System.out.println("Por favor, digite o seu numero");
      int numero = scanner.nextInt();

      System.out.println("Por favor, digite o seu saldo");
      double saldo = scanner.nextDouble();

      System.out.println("Olá "+ nomecliente +", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+ " e seu saldo "+ saldo +" já está disponível para saque.");
    }
}


