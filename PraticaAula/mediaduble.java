package PraticaAula;
import java.util.Scanner;

public class mediaduble {
    public static void main(String[] args) {

        System.out.print("\nCalcule sua média\n");
        Scanner entrada = new Scanner(System.in);
        double n1, n2, n3, med = 0.0;
        System.out.print("\nPrimeira nota: ");
        n1 = entrada.nextDouble();
        System.out.print("Segunda nota: ");
        n2 = entrada.nextDouble();
        System.out.print("Terceira nota: ");
        n3 = entrada.nextDouble();
        med = media(n1,n2,n3);
        System.out.println("Sua média é: " + med);
        entrada.close();
    }

    public static double media(double n1, double n2, double n3){
    double media;
    media = (n1 + n2 + n3)/3;
    return media;
    }
}
