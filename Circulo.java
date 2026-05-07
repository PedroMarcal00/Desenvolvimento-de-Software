public class Circulo extends Forma2D {    

    // Construtores
    public Circulo() {        
    }
    public Circulo(double raio, String nome){
        super(raio, nome);
    }

    

    double pi = 3.14159;
    // Metodos
    public double area() {
        double raio = getAltura();
        return pi*raio*raio;
    }
    @Override
    public String toString() {
        return "Circulo [area()=" + area() + ", getAltura()=" + getAltura() + ", getNome()=" + getNome() + "]";
    }

    

}
