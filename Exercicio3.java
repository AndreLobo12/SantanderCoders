import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = scanner.nextInt();

        // Desenha a primeira pirâmide
        for (int i = 0; i < numero; i++) {
            for (int j = 0; j < numero - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i * 2; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Desenha a segunda pirâmide
        for (int i = numero; i >= 0; i--) {
            for (int j = 0; j < numero - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i * 2; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
