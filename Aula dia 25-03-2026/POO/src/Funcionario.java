public class Funcionario {

  String nome;
  String departamento;
  Double salario;
  String dataEntrada;
  String RG;
  Boolean Ativo;

  void bonificacao(Double aumento){
    this.salario += aumento;
  }

  void demissao(){
    this.Ativo = false;
  }

  void mostrarDados(){
    System.out.println("\n ----- Dados do Funcionario -----\n");
    System.out.println("Nome: " + this.nome + "\n");
    System.out.println("RG: " + this.RG + "\n");
    System.out.println("Departamento: " + this.departamento + "\n");
    System.out.println("Salario: " + this.salario + "\n");
    System.out.println("Data de Adimissão: " + this.dataEntrada + "\n");
    System.out.println("Funcionario ativo: " + this.Ativo + "\n");
  }  

}