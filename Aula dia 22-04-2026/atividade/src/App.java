public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("-----POLIMORFISMO com Animais-----\n");
        Animal animais[] = new Animal[10];
        Animal doguinho = new Animal("Doguinho",3,5.5,0);//Instanciando 1 obj da classe Animal
        Peixe peixinho = new Peixe("Nemo", 1, 10, 3,1);
        Ave passarinho = new Ave("pardal", 2, 12, 10);


        //Associar obejto a posição do array
        animais[0] = doguinho;
        animais[1] = peixinho;
        animais[2] = passarinho;
        //Utilizando objeto do um array
        //animais[0].mover();
        //animais[1].mover();

        for(Animal a: animais){
            a.mover();
        }

        //animais[0].setNome("Novo nome");
    }
}
