//Esta classe serve para implementear rotinas de menu

import java.util.Scanner;

public class MenuFormas {
    private Scanner sc;

    public MenuFormas(){
        sc = new Scanner(System.in);

    }

    public void encerraSistema(){
        System.out.println("Encerrando sistema...");
        sc.close();
    }

    public int exibirMenu(){
        String texto  = "--- FORMAS 2D ---\n"+
                        "1 - Cadastrar Forma\n"+
                        "2 - Listar Formas \n"+
                        "3 - Calcular área \n"+
                        "0 - Sair \n"+
                        "-------------------\n"+
                        "Digite a opção escolhida: \n";
        System.out.println(texto);
        return sc.nextInt();
    }

    public Forma2D cadastraForma2D(){
        System.out.println("Digite qual forma deseja cadastrar? \n"+
                           "1 - Circulo \n"+
                           "2 - Retangulo \n"+
                           "3 - Triangulo \n");
        int optionForm = sc.nextInt();
        //Ler dados genericos
        System.out.println("Digite o nome da forma: ");
        String nome = sc.next();
        System.out.println("Digite a altura da forma: ");
        Double altura = sc.nextDouble();
        System.out.println("Digite a largura da forma: ");
        Double largura = sc.nextDouble();
        //Usa dados para construir forma especifica
        switch (optionForm) {
            case 1:
                Circulo c = new Circulo(altura, nome);     
                return c;
                
            case 2:  
                if (altura==largura) {
                    Retangulo r = new Retangulo(largura);
                    return r;
                }else{
                    Retangulo r = new Retangulo(altura, largura);
                    return r;
                }
            case 3:
                System.out.println("Digite o estilo do triangulo");
                String estilo = sc.next();
                Triangulo t = new Triangulo(altura, largura, estilo);                
            default:
                break;
        }
        return null;
    }

    
}
