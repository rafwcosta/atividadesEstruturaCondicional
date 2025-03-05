package revisoes;

import java.util.Locale;
import java.util.Scanner;

public class Conditional06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite um valor de 0 a 100: ");
        double numero = sc.nextDouble();

        if (numero < 0.0 || numero > 100.0) {
            System.out.println("Fora do intervalo! Reinicie o código.");
        }
        else if (numero <= 25.0) {
            System.out.println("[0,25]");
        }
        else if (numero <= 50.0) {
            System.out.println("[25,50]");
        }
        else if (numero <= 75.0) {
            System.out.println("[50,75]");
        }
        else {
            System.out.println("[75,100]");
        }

        sc.close();
    }
}