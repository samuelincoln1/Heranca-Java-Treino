

public class Circulo extends Figura2D {

    private double raio;
    final double PI = 3.14;


    public Circulo() {
        super.setNome("Circulo");
    }

    public Circulo(double raio) {
        super.setNome("Circulo");
        this.raio = raio;
    }

    public double getRaio() {
        return this.raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getPI() {
        return this.PI;
    }

    @Override
    public String toString() {
        return "{" + super.toString() +
            " raio='" + getRaio() + "'" +
            ", PI='" + getPI() + "'" +
            "}";
    }


    @Override
    public double calcularArea() {
       return PI * (raio*raio);
    }
    
}
