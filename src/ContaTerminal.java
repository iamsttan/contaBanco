import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int numero;
        String agencia;
        String nomeDoCliente;
        float saldo;
        
        
        System.out.println("Digite o número que será vinculado a sua nova conta: ");
        numero = scan.nextInt();   
       

        scan.nextLine();

        System.out.println("Digite o número que será vinculado a sua nova agência: ");
        agencia = scan.nextLine();
       

        System.out.println("Digite seu nome: ");
        nomeDoCliente = scan.nextLine();
   

        System.out.println("Isira o valor do seu primeiro depósito: ");
        saldo = scan.nextFloat();

        System.out.println("Olá " + nomeDoCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é "
        + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
          System.out.println("Olá " + nomeDoCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é "
        + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
        

        scan.close();
    }
}


        




    

