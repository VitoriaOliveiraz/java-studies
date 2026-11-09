package estrutura_sequencial;

import java.util.Scanner;

public class Exercicio1014 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int totalKm = leitor.nextInt();
        double litros = leitor.nextDouble();
        double litrosGastos = totalKm / litros;

        System.out.printf("%.3f  km/l%n", litrosGastos);

    }
}
