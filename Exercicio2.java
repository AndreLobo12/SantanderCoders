import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a temperatura:");
        double temperatura = scanner.nextDouble();

        System.out.println("Qual a unidade de origem dessa temperatura? [C, K, F]");
        String unidadeOrigem = scanner.next().toUpperCase();

        System.out.println("Qual a unidade de destino dessa temperatura? [C, K, F]");
        String unidadeDestino = scanner.next().toUpperCase();

        double temperaturaConvertida = 0;

        switch (unidadeOrigem) {
            case "C":
                if (unidadeDestino.equals("F")) {
                    temperaturaConvertida = (temperatura * 9 / 5) + 32;
                } else if (unidadeDestino.equals("K")) {
                    temperaturaConvertida = 273.15 + temperatura;
                }
                break;
            case "F":
                if (unidadeDestino.equals("C")) {
                    temperaturaConvertida = (temperatura - 32) * 5 / 9;
                } else if (unidadeDestino.equals("K")) {
                    temperaturaConvertida = ((temperatura - 32) * 5 / 9) + 273.15;
                }
                break;
            case "K":
                if (unidadeDestino.equals("C")) {
                    temperaturaConvertida = temperatura - 273.15;
                } else if (unidadeDestino.equals("F")) {
                    temperaturaConvertida = ((temperatura - 273.15) * 9 / 5) + 32;
                }
                break;
            default:
                System.out.println("A entrada especificada não é válida.");
                return;
        }

        System.out.printf("%.2f %s = %.2f %s\n", temperatura, unidadeOrigem, temperaturaConvertida, unidadeDestino);
    }
}
