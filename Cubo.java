

public class Cubo extends Figura3D {

    private double aresta;

    public Cubo() {
        super.setNome("Cubo");
    }

    public Cubo(double aresta) {
        super.setNome("Cubo");
        this.aresta = aresta;
    }

    public double getAresta() {
        return this.aresta;
    }

    public void setAresta(double aresta) {
        this.aresta = aresta;
    }


    @Override
    public String toString() {
        return "{" + super.toString() +
            " aresta='" + getAresta() + "'" +
            "}";
    }

    @Override
    public double calcularArea() {
        return (aresta*aresta)*6;
    }

    @Override
    public double calcularVolume() {    
        return aresta*aresta*aresta;
    }
    
}
