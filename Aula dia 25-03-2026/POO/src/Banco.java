import java.util.Scanner;
public class Banco {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Funcionario funcionario1 = new Funcionario();

    System.out.println("Digite o nome do funcionario: ");
    String nome = sc.next();

    System.out.println("Digite o departamento: ");
    String departamento = sc.next();

    System.out.println("Digite o salario ");
    double salario = sc.nextDouble();
    
    System.out.println("Digite a data de admissão: ");
    String data = sc.next();


  }

}
