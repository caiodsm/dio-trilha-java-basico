import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Exibir as mensages para o nosso usuário
        System.out.println("Por favor, digite o seu número !");
        int contaUsuario = scanner.nextInt();
        
        System.out.println("Por favor, digite o número da Agência !");
        String agenciausuario = scanner.next();

        String scanner2 = scanner.nextLine();
        System.out.println("Por favor, digite o seu Nome !");
        String nomeCliente = scanner.nextLine();
       
        System.out.println("Por favor, digite o seu saldo !");
        double saldoCliente = scanner.nextDouble();
        //Obter pela scanner os valores digitados no terminal
        
        

        //Exibir  a mensagem final usando concat
        String mensagemFinal = "Olá ";
        
        mensagemFinal = mensagemFinal.concat(nomeCliente +  ", obrigado por criar uma conta em nosso banco, sua agência é ").concat(agenciausuario + ", conta ").concat(contaUsuario + " e seu saldo ").concat(saldoCliente + " já está disponível para saque");
        System.out.println(mensagemFinal);
        
    }
}
