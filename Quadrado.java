

public class Quadrado extends Figura2D {

    private double lado;


    public Quadrado() {
        super.setNome("Quadrado");
    }

    public Quadrado(double lado) {
        this.lado = lado;
        super.setNome("Quadrado");
    }

    public double getLado() {
        return this.lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "{" + super.toString() +
            " lado='" + getLado() + "'" +
            "}";
    }


    @Override
    public double calcularArea() {
       return lado*lado;
    }
    
}
