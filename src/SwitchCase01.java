import java.util.Scanner;
import java.util.Locale;

public class SwitchCase01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Dia da semana: ");
        int x = sc.nextInt();

        String dia;

        switch (x) {
            case 1:
                dia = "Domingo!";
                break;
            case 2:
                dia = "Segunda!";
                break;
            case 3:
                dia = "Terça!";
                break;
            case 4:
                dia = "Quarta!";
                break;
            case 5:
                dia = "Quinta!";
                break;
            case 6:
                dia = "Sexta!";
                break;
            case 7:
                dia = "Sábado!";
                break;
        
            default:
                dia = "Valor inválido!";
                break;
        }

        System.out.println("Dia da semana: " + dia);

        sc.close();
    }
}