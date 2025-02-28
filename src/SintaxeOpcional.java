import java.util.Scanner;
import java.util.Locale; 

public class SintaxeOpcional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Quanto minutos você consumiu da franquia?: ");
        int minutos = sc.nextInt();

        double conta = 50.0;
        if (minutos > 100) {
            conta += (minutos - 100) * 2.0;
        }

        System.out.printf("Valor da conta: %.2f%n", conta);

        sc.close();
    }
}