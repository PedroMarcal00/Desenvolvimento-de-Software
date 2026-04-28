public class Ave extends Animal{

    public Ave(String nome, int patas, double velocidade, int localizacao) {
        super(nome, patas, velocidade, localizacao);
    }

    public Ave() {
    }
    
    @Override
    public void mover(){
        System.out.println("Ave " + getNome() + " se movendo >>>>>>>>");
        super.setLocalizacao(1);
    }
    @Override
    public String toString() {
        return "Ave |nome: " + getNome() + ", patas: " + getPatas() + ", velocidade: " + getVelocidade() + ", localizacao: "
                + getLocalizacao() + "|";
    }
}
