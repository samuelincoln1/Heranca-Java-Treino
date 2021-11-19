

import java.lang.Math;

public class Piramide extends Figura3D  {

    private double arestaBase;
    private double altura;


    public Piramide() {
        super.setNome("Piramide");
    }

    public Piramide(double arestaBase, double altura) {
        super.setNome("Piramide");
        this.arestaBase = arestaBase;
        this.altura = altura;
    }

    public double getArestaBase() {
        return this.arestaBase;
    }

    public void setArestaBase(double arestaBase) {
        this.arestaBase = arestaBase;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "{" + super.toString() +
            " arestaBase='" + getArestaBase() + "'" +
            ", altura='" + getAltura() + "'" +
            "}";
    }

    @Override
    public double calcularArea() {
        double hip2 = (altura*altura) + ((arestaBase/2)*(arestaBase/2));
        double apotema = Math.sqrt(hip2);
        double areaLateral = (arestaBase * apotema)/2;
        double area = (areaLateral*4) + (arestaBase*arestaBase);
        return area;
    }

    @Override
    public double calcularVolume() {
        double areaBase = arestaBase * arestaBase;
        return (areaBase * altura)/3;
    }
    
}
