package revisoes;

import java.util.Scanner;
import java.util.Locale;

public class Conditional02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite um valor inteiro: ");
        int valor = sc.nextInt();

        if (valor % 2 == 0) {
            System.out.println("Par!");
        }
        else {
            System.out.print("Ímpar!");
        }

        sc.close();
    }
}