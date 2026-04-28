public class Peixe extends Animal {
    private int agua;

    //CONSTRUTORES
    public Peixe(){}

    public Peixe(String nome, int patas, double velocidade, int localizacao, int agua) {
        super(nome, patas, velocidade, localizacao);//Atributas da super class Animal
        this.agua = agua;//Atributo da classe Peixe
    }

    //GETTERS E SETTERS
    public int getAgua() {
        return agua;
    }

    public void setAgua(int agua) {
        this.agua = agua;
    }
    
    public void mover(){
        System.out.println("Peixe " + getNome() + " se movendo ~~~~~~>");
        super.setLocalizacao(super.getLocalizacao() + 2);
    }

    @Override
    public String toString() {
        return "Peixe  |agua: " + (agua == 0 ? "Doce" : "Salgada") + ", Nome: " + getNome() + ", Patas: " + getPatas() + ", Velocidade: "
            + getVelocidade() + ", Localizacao: " + getLocalizacao() + "|";
    }

    

    

    
}
