import java.util.Locale;
import java.util.Scanner;

public class Conditional03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite o valor de X: ");
        int x = sc.nextInt();
        System.out.print("Digite o valor de Y: ");
        int y = sc.nextInt();

        if (x % y == 0 || y % x == 0) {
            System.out.println("São múltiplos!");
        }
        else {
            System.out.println("Não são múltiplos!");
        }

        sc.close();
    }
}