public class Circulo extends Forma2D {    

    // Construtores
    public Circulo(double altura, String nome){
        super(altura, nome);
    }      
    public Circulo() {
    }
    


    // Metodos
    public double area() {
        double pi = 3.14159;
        double raio = getAltura()/2;
        return (raio * raio) * pi;
    }
    @Override
    public String toString() {
        return "Circulo | Raio: " + (getAltura()/2) + ", diametro: " + getAltura() + "|";
    }

    

}
