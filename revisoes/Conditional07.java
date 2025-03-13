import java.util.Locale;
import java.util.Scanner;

public class Conditional07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite o valor de X: ");
        int x = sc.nextInt();
        System.out.print("Digite o valor de Y: ");
        int y = sc.nextInt();

        if (x == 0 && y == 0) {
            System.out.println("Origem.");
        }
        else if (x > 0 && y > 0) {
            System.out.println("Q1");
        }
        else if (x < 0 && y > 0) {
            System.out.println("Q2");
        }
        else if (x < 0 && y < 0) {
            System.out.println("Q3");
        }
        else {
            System.out.println("Q4");
        }

        sc.close();
    }
}