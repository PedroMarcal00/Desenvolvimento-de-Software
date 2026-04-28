import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("-----POLIMORFISMO com Animais-----\n");
        //Animal animais[] = new Animal[10];
        ArrayList<Animal> animaisList = new ArrayList<>();
        Animal doguinho = new Animal("Doguinho",3,5.5,0);//Instanciando 1 obj da classe Animal
        Peixe peixinho = new Peixe("Nemo", 1, 10, 3,1);
        Ave passarinho = new Ave("pardal", 2, 12, 10);


        //Associar obejto a posição do array
        //animais[0] = doguinho;
        //animais[1] = peixinho;
        //animais[2] = passarinho;
        //Utilizando objeto do um array
        //animais[0].mover();
        //animais[1].mover();
        //animais[2].mover();

        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n-----Menu-----");
            System.out.println("Opção 1 - Criar Animais");
            System.out.println("Opção 2 - Ver Animais");
            System.out.println("Opção 3 - Fazer Animais se moverem");
            System.out.println("opção 4 - Editar Animais");
            System.out.println("Opção 0 - Sair");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1: 
                    System.out.println("-----Cadastro de Animais-----"); 
                    System.out.println("Escolha qual animal deseja cadastrar \n" + 
                        "1 - Animal generico \n" + 
                        "2 - Peixe \n" + 
                        "3 - Ave \n ");
                    int tipoAnimal = sc.nextInt();

                    System.out.println("Digite o nome do animal: ");
                    String nome = sc.next();

                    System.out.println("Digite a quantidade de patas do animal: ");
                    int patas = sc.nextInt();

                    System.out.println("Digite a velocidade do animal: ");
                    double velocidade = sc.nextDouble();

                    System.out.println("Digite um valor inteiro de localização: ");
                    int localizacao = sc.nextInt();

                    //Especificidades
                    switch (tipoAnimal) {
                        case 1:
                            Animal a = new Animal(nome, patas, velocidade, localizacao);
                            animaisList.add(a);
                            
                            break;
                            
                        case 2:
                            System.out.println("-----Digite o tipo de agua que esta peixe vive-----\n" + 
                                            "0 - Agua doce \n" + 
                                            "1 - Agua Salgada");
                            int agua = sc.nextInt();
                            Peixe b = new Peixe(nome, patas, velocidade, localizacao, localizacao);
                            animaisList.add(b);
                            
                            break;

                        case 3:
                            Ave c = new Ave(nome, patas, velocidade, localizacao);
                            animaisList.add(c);
                            
                            break;

                        default: System.out.println("Opção invalida! TENTE NOVAMENTE!");
                            break;
                    }
                    System.out.println("Temos "+ animaisList.size()+" animais cadastrados!");
                    break;
                case 2: 
                    System.out.println("-----LISTA DE ANIMAIS----\n");
                        for (Animal animalItem : animaisList) {
                            System.out.println(animalItem.toString());
                        }
                    break;
                case 3: 
                    System.out.println("-----MOVER ANIMAIS-----");
                    for (Animal a : animaisList) {
                        a.mover();
                    }

                    break;
                case 4: 
                    System.out.println("Opção 4 selecionada!"); 
                    break;
                case 0: 
                    System.out.println("Encerrando o Sistema...");
                    break;
            
                default:
                    System.out.println("Opção invalida! TENTE NOVAMENTE!");
                    break;
            }
            
        } while (opcao!=0);

        sc.close();
    }
}
