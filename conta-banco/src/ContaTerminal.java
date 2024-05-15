import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();
        
        System.out.println("Digite o número da conta: ");
        int numero = scanner.nextInt();
        
        System.out.println("Digite seu Nome: ");
        scanner.nextLine(); // Consumindo a nova linha deixada pelo nextInt()
        String nome = scanner.nextLine();
        
        System.out.println("Digite seu Saldo: ");
        double saldo = scanner.nextDouble();

        // Imprimindo os dados obtidos pelo Correntista
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}