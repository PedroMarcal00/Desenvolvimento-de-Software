import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);        
        Conta conta1 = new Conta(); 

        System.out.println("Digite o nome");
        String n = sc.next();//lendo do teclado
        conta1.setNome(n);//usando set
        

        System.out.println("Digite o numero da conta: ");
        int num = sc.nextInt();
        conta1.setNumero(num);
        

        System.out.println("Digite o saldo: ");
        double s = sc.nextDouble();
        conta1.setSaldo(s);
        

        System.out.println("Digite o limite: ");
        double l = sc.nextDouble();
        conta1.setLimite(l);
        

        System.out.println("O nome digitado é: " + conta1.getNome());
        System.out.println("O numero da conta é " + conta1.getNumero());
        System.out.println("O saldo é " + conta1.getSaldo());
        System.out.println("O limite da conta é " + conta1.getLimite());

        Conta conta2 = new Conta();
        System.out.println(conta2.toString());
        System.out.println(conta1.toString());


        sc.close(); // fechar o scanner
    }
} 