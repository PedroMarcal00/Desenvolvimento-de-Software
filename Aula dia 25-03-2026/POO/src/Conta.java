public class Conta {
    // Atributos da classe
    private double saldo;
    private String nome;
    private int numero;
    private double limite;

    //getters e setter - GET(PEGAR) SET(EDITAR)
//------------------------------------------------------------------------
    public void setNome(String nome){
        if (nome != null && nome.length() > 1) {
            this.nome = nome;
        }        
    }
    public void setSaldo(double saldo){
        if (saldo >= 0) {
            this.saldo = saldo;
        }
    }
    public void setNumero(int numero){
        if (numero >= 0) {
            this.numero = numero;
        }
    }
    public void setLimite(double limite){
        if (limite >= 0) {
            this.limite = limite;
        }
    }
//-------------------------------------------------------------------------
    public String getNome(){
        return this.nome;
    }
    public double getSaldo(){
        return this.saldo;
    }
    public int getNumero(){
        return this.numero;
    }
    public double getLimite(){
        return this.limite;
    }
//-------------------------------------------------------------------------
    
    public void saque(double valor){
        if(saldo >= valor && valor >0){
            //this.saldo = this.saldo - valor;
            this.setSaldo(saldo -= valor);
            System.out.println("Saque efetuado com sucesso!");
        }else{
            System.out.println("Saldo insuficiente ou valor de saque inválido");
        }
        System.out.println("Seu saldo atual é: "+ this.saldo);
    }

    boolean sacarVerfica(double quantidade){
        if(quantidade > saldo && quantidade <= 0){
            return false;
        }else{
            this.saldo -= quantidade;
            return true;
        }
    }

    // método padrão para visualizar o objeto
    public String toString(){
        return "Nome: "+ this.nome 
                + " | Num.: " + this.numero 
                + " | Saldo: " + this.saldo
                + " | Limite: " + this.limite;
    } 
}