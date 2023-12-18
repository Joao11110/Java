package introJava;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

        System.out.print("\nCalcule sua média\n");
        Scanner entrada = new Scanner(System.in);
        float n1, n2, n3, med;
        System.out.print("\nPrimeira nota: ");
        n1 = entrada.nextFloat();
        System.out.print("Segunda nota: ");
        n2 = entrada.nextFloat();
        System.out.print("Terceira nota: ");
        n3 = entrada.nextFloat();
        med = (n1+n2+n3)/3;
        System.out.println("Sua média é: " + med);
        entrada.close();
    }
}