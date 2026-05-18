public class Triangulo extends Forma2D {
    private String style;

    // Construtores
    public Triangulo() {
        super();
        style = "nada";
    }

    public Triangulo(double w, double h, String s) {
        super(w, h, "Triangulo");
        style = s;
    }

    public Triangulo(double x, String nome, String style) {
        super(x, nome);
        this.style = style;
    }

    // Getters e Setters
    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    // implementar metodos abstratos
    public double area() {
        return (getAltura() * getLargura()) / 2;
    }

    @Override
    public String toString() {
        return "Triangulo |style=" + style + ", Altura:" + getAltura() + ", Largura:" + getLargura()
                + ", Nome:" + getNome() + "|";
    }

}
