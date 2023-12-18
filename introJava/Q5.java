package introJava;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int c, d, u;

        System.out.print("Digite a centena: ");
        c = ent.nextInt();
        System.out.print("Digite a dezena: ");
        d = ent.nextInt();
        System.out.print("Digite a unidade: ");
        u = ent.nextInt();
        System.out.printf("\nInverso: %d%d%d", u,d,c);
        ent.close();   
    }
}