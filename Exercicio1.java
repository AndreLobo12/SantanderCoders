import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do empréstimo:");
        double valorEmprestimo = scanner.nextDouble();

        System.out.println("Digite a taxa de juros do empréstimo:");
        double taxaJuros = scanner.nextDouble() / 100;

        System.out.println("Digite o tempo para pagamento:");
        int tempoPagamento = scanner.nextInt();

        double amortizacao = valorEmprestimo / tempoPagamento;
        double saldoDevedor = valorEmprestimo;

        double totalPrestacao = 0;
        double totalAmortizado = 0;
        double totalJuros = 0;

        System.out.printf("Valor fixo da amortização R$ %.2f, Saldo devedor total R$ %.2f com um juros de %.2f%% ao mês\n", amortizacao, saldoDevedor, taxaJuros * 100);

        for (int i = 1; i <= tempoPagamento; i++) {
            double jurosMensal = saldoDevedor * taxaJuros;
            double parcelaMensal = jurosMensal + amortizacao;

            saldoDevedor -= amortizacao;

            totalPrestacao += parcelaMensal;
            totalAmortizado += amortizacao;
            totalJuros += jurosMensal;

            System.out.printf("Parcela %d | Juros: R$ %.2f | Prestação: R$ %.2f | Saldo devedor: R$ %.2f\n", i, jurosMensal, parcelaMensal, saldoDevedor);
        }

        System.out.printf("Total: Prestação R$ %.2f, Juros R$ %.2f, Amortização R$ %.2f\n", totalPrestacao, totalJuros, totalAmortizado);
    }
}
