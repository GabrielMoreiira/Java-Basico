import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
    Scanner entradaDoTeclado = new Scanner(System.in);
    String nome1, nome2;
    int idade1, idade2;
    float media;
    
    System.out.println("Dados da Primeira Pessoa");
    System.out.print("Nome: ");
    nome1 = entradaDoTeclado.nextLine();
    System.out.print("Idade: ");
    idade1 = entradaDoTeclado.nextInt();
    entradaDoTeclado.nextLine();

    System.out.println("Dados da Segunda Pessoa");
    System.out.print("Nome: ");
    nome2 = entradaDoTeclado.nextLine(); // Limpa o buffer

    System.out.print("Idade: ");
    idade2 = entradaDoTeclado.nextInt();

    media = (idade1 + idade2) / 2;

    System.out.println("A idade média " + nome1 + " e " + nome2 + " é de " + media + " anos");
    }
}
