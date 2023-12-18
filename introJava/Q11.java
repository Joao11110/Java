package introJava;
import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float x, y;

        System.out.print("\nDigite um número (x): ");
        x = sc.nextFloat();
        System.out.print("\nDigite um número (y): ");
        y = sc.nextFloat();
        System.out.println();

        if (x < y){
            System.out.print(y + " está acima de " + x);
        }
        else if(x < y){
            System.out.print(y + " está abaixo de " + x); 
        }
        else if(x == y){
            System.out.print(y + " está na mesma linha que " + x);
        }
        if (y < x){
            System.out.print(", " + x + " está a direita de " + y);
        }
        else if (y < x){
            System.out.print(", " + x + " está a esquerda de " + y);
        }
        else if(y == x){
            System.out.print(", " + x + " está na mesma linha que " + y);
        }
        sc.close();
    }
}