package PraticaAula;
import java.util.Scanner;

public class FatorialRec {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int n, fat;

        System.out.print("Infotme n: ");
        n = ent.nextInt();
        fat = fatorial(n);
        System.out.print("Fatorial de " + n + " é " + fat);
        ent.close();
    }

    public static int fatorial(int num){
        if (num == 0) {
            return 1; 
        }
        else{
            return num*fatorial(num-1);
        }
    }
}
