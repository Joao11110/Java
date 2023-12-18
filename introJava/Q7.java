package introJava;
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int n1, n2, n3;

        System.out.print("\nInsira um número: ");
        n1 = ent.nextInt();
        System.out.print("Insira um número: ");
        n2 = ent.nextInt();
        System.out.print("Insira um número: ");
        n3 = ent.nextInt();

        if (n1 <= n2 && n1 < n3) {
           System.out.print("Menor número:" + n1 + "\n");
        }
        else if (n2 <= n1 && n2 <= n3) {
            System.out.print("Menor número:" + n2 + "\n");
        }
        else if (n3 <= n1 && n3 <= n2) {
            System.out.print("Menor número:" + n3 + "\n");
        }
        ent.close();
    }
}