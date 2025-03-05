package revisoes;

import java.util.Locale;
import java.util.Scanner;

public class Conditional04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Hora inicial: ");
        int horaInicial = sc.nextInt();
        System.out.print("Hora final: ");
        int horaFinal = sc.nextInt();

        int duracao;
        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        }
        else {
            duracao = 24 - horaInicial + horaFinal;
        }

        System.out.println("O jogo durou: " + duracao + " horas!");

        sc.close();
    }
}
