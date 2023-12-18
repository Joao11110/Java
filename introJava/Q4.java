package introJava;
import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float far, cel;
        System.out.print("\nDigite a temperatura em Celcius: ");
        cel = input.nextFloat();
        far = cel * 9/5 + 32;
        System.out.print("A temperatura em Fahrenheit é: " + far + "\n");
        input.close();
    }
}