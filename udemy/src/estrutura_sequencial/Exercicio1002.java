package estrutura_sequencial;

import java.util.Scanner;
import  java.lang.Math;

public class Exercicio1002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double R = sc.nextDouble();
        double PI = 3.14159;
        double A = PI * Math.pow(R, 2);

        System.out.printf("A=%.4f%n", A);
    }
}
