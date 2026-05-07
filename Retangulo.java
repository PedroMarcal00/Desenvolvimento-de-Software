public class Retangulo extends Forma2D {

    Retangulo() {
        super();
    }

    // Construtor para Retangulo
    Retangulo(double w, double h) {
        super(w, h, "retangulo"); // Construtor da superclasse
    }

    Retangulo(double w) {
        super(w, "retangulo"); // Construtor da superclasse
    }

    public double area() {
        return getLargura() * getAltura();
    }
}
