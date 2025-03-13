import java.util.Locale;
import java.util.Scanner;

public class Conditional02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite um valor inteiro: ");
        int x = sc.nextInt();

        if (x % 2 == 0) {
            System.out.println("Par!");
        }
        else {
            System.out.println("Ímpar!");
        }

        sc.close();
    }
}