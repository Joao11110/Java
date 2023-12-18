package PraticaAula;
import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int n, fat;
        System.out.print("\nInsira um número: ");
        n = ent.nextInt();
        for(int count = 0; count <= n; count++){
            fat = 1;
            for (int i = count; i > 1; i--){
                fat *= i; 
            }
            System.out.print("\nFatorial de " + count + " = " + fat);
        }
        System.out.println();
        ent.close();
    }
}
