package revisoes;

import java.util.Scanner;
import java.util.Locale;

public class Conditional01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite um valor inteiro: ");
        int valor = sc.nextInt();

        if (valor > 0) {
            System.out.println("Número positivo!");
        }
        else {
            System.out.println("Negativo!");
        }

        sc.close();
    }
}