import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<Forma2D> formas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Cadastrar Triângulo");
            System.out.println("2. Cadastrar Retângulo");
            System.out.println("3. Cadastrar Círculo");
            System.out.println("4. Ver áreas");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a altura do triângulo: ");
                    double alturaT = scanner.nextDouble();
                    System.out.print("Digite a largura do triângulo: ");
                    double larguraT = scanner.nextDouble();
                    System.out.print("Digite o estilo do triângulo: ");
                    String style = scanner.next();
                    formas.add(new Triangulo(alturaT, larguraT, style));
                    System.out.println("Triângulo cadastrado!");
                    break;
                case 2:
                    System.out.print("Digite a largura do retângulo: ");
                    double larguraR = scanner.nextDouble();
                    System.out.print("Digite a altura do retângulo: ");
                    double alturaR = scanner.nextDouble();
                    formas.add(new Retangulo(larguraR, alturaR));
                    System.out.println("Retângulo cadastrado!");
                    break;
                case 3:
                    
                case 4:
                    
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 5);

        scanner.close();
    }
}
