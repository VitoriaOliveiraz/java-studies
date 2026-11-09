package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1010 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);


        int codProduto1 = leitor.nextInt();
        int qtdProduto1 = leitor.nextInt();
        double precoProduto1 = leitor.nextDouble();


        int codProduto2 = leitor.nextInt();
        int qtdProduto2 = leitor.nextInt();
        double precoProduto2 = leitor.nextDouble();


        double total = (qtdProduto1 * precoProduto1) + (qtdProduto2 * precoProduto2);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

        leitor.close();
    }
}
