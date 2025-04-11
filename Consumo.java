import java.util.Scanner;

public class Consumo {
    public static void main(String[] args) {
    float distancia, combustivel ; 
    Scanner entradaDoTeclado = new Scanner(System.in);
    
    System.out.printf("Distância percorrida: ");
    distancia = entradaDoTeclado.nextFloat();
    
    System.out.printf("Combustível gasto: ");
    combustivel = entradaDoTeclado.nextFloat();

    float consumo = distancia / combustivel; 

    System.out.println("Consumo médio: " + consumo);
    }
}   