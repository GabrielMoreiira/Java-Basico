import java.util.Scanner;

public class Medidas {
    public static void main(String[] args) {
        Scanner entradaDoTeclado = new Scanner(System.in);
        float a, b, c, areaQuadrado, areaTriangulo, areaTrapezio; 

        System.out.print("Digitea medida A: ");
        a = entradaDoTeclado.nextFloat();

        System.out.print("Digite a medida B: ");
        b = entradaDoTeclado.nextFloat();

        System.out.print("Digite a medida de C: " );
        c = entradaDoTeclado.nextFloat();

        areaQuadrado = a * a;
        areaTriangulo = (a * b) / 2;
        areaTrapezio = ((a + b) * c) / 2;

        System.out.println("Área Quadrado: " + areaQuadrado);
        System.out.println("Área Triângulo: " + areaTriangulo);
        System.out.println("Área Trpézio: " + areaTrapezio);
    }
}
