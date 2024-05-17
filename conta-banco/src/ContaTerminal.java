import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in);
    

        System.out.println("Por favor, digite o número da Agência ! ");
        int numero = scanner.nextInt();
        
        
        System.out.println("Por favor, digite o nome da Agência ! ");
        String agencia = scanner.next();
        
        
        System.out.println("Por favor, digite o seu Nome ! ");
        String nomeCliente = scanner.next();
        

        System.out.println("Por favor, digite o seu Saldo ! ");
        double saldo = scanner.nextDouble();
        

        System.out.println("Olá " +nomeCliente+", obrigado p0or criar uma conta em nosso banco, sua agência é "+agencia+", conta "+ numero +" e seu saldo "+saldo+" já está disponível para saque");

        //Exibir as mensagens para o nosso usuário


        //Obter pela scanner os valores digitados no terminal


        //Exibir a mensagem conta criada


    }
}
