import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       //TODO: Conhecer e importar a classe Scanner
       //Exibir as mensagens para nosso usuário
       //Obter pelo Scanner os valores digitados
       //Exibir a mensagem final

        double saldo = 237.48;

       @SuppressWarnings("resource")
       Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

       System.out.println("Digite a sua agência: ");
       int agencia = scanner.nextInt();

        System.out.println("Digite o número da sua conta: ");
        String conta = scanner.next();

        System.out.println("Digite seu nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Digite seu Sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Olá " + nomeCliente + " " + sobrenome);
        System.out.println("Obrigado por criar uma conta em nosso Banco!");
        System.out.println("Sua agencia é: " + agencia);
        System.out.println("Sua conta é: " + conta);
        System.out.println("Seu saldo atual é de R$" + saldo + " e já está disponível para saque!");
        




    }
}
