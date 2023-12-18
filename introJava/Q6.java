package introJava;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        int dias = 0, horas = 0, minutos = 0;

        System.out.print("\nDigite o tempo em minutos: ");
        Scanner ent = new Scanner(System.in);
        minutos = ent.nextInt();

        dias = minutos/1440;
        horas = (minutos % 1440)/60;
        minutos = (minutos % 1440)%60; 
        System.out.println("\n" + dias + " dias " + horas + " horas " + minutos + " minutos\n");
        ent.close();
    }
}