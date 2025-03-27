import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);  
        
        
        //Solicita o nome do cliente 
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        //Solicita o número da conta
        System.out.println("Por favor, digite o número da Conta: ");
        int conta = scanner.nextInt();

        //Solicita o núemro da agência
        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = scanner.next();

        // Solicita o saldo
        System.out.println("Por favor, digite seu saldo: ");
        double saldo = scanner.nextDouble();

        // Mensagem final
        System.out.println("\nOlá " + nome + ", obrigada por criar uma conta em nosso banco.");
        System.out.println("sua agência é " + agencia + ", conta " + conta + " e seu saldo R$" + saldo + " já está disponível para saque.");

        // Fecha o scanner
        scanner.close();
    
    }
}
