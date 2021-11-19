

public class Teste {
    public static void main(String[] args) {

        Circulo circulo = new Circulo(5);
        Quadrado quadrado = new Quadrado(3);
        Triangulo triangulo = new Triangulo(8, 10);
        Cilindro cilindro = new Cilindro(2, 15);
        Cubo cubo = new Cubo(9);
        Piramide piramide = new Piramide(12, 18);

        FiguraGeometrica[] figuras = new FiguraGeometrica[6];
        figuras[0] = circulo;
        figuras[1] = quadrado;
        figuras[2] = triangulo;
        figuras[3] = cilindro;
        figuras[4] = cubo;
        figuras[5] = piramide;

        for (FiguraGeometrica f : figuras) {

            if (f instanceof Figura2D) {

                Figura2D f2d = (Figura2D) f;
                System.out.println(f.toString());
                System.out.println("Area: " + f2d.calcularArea());

            } else if (f instanceof Figura3D) {

                Figura3D f3d = (Figura3D) f;
                System.out.println(f.toString());
                System.out.println("Area: " + f3d.calcularArea());
                System.out.println("Volume: " + f3d.calcularVolume());

            }
        }

    }
}
