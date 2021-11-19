
public class Cilindro extends Figura3D {

    private double raio;
    private double altura;
    final double PI = 3.14;

    public Cilindro() {
        super.setNome("Cilindro");
    }

    public Cilindro(double raio, double altura) {
        this.raio = raio;
        this.altura = altura;
        super.setNome("Cilindro");
    }

    public double getRaio() {
        return this.raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }    

    public double getPI() {
        return this.PI;
    }

    @Override
    public String toString() {
        return "{" + super.toString() + 
            " raio='" + getRaio() + "'" +
            ", altura='" + getAltura() + "'" +
            ", PI='" + getPI() + "'" +
            "}";
    }

    @Override
    public double calcularArea() {
        return 2*PI *raio*(raio + altura);
    }

    @Override
    public double calcularVolume() {
        return PI * raio * raio * altura;
    }
    
}
