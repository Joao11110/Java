package introJava;
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        System.out.print("\nCalcule a area de um quadrado\n");
        Scanner entrada = new Scanner(System.in);
        float lado;
        System.out.print("\nDigite o tamanho do lado do quadrado: ");
        lado = entrada.nextFloat();
        lado = lado*lado;
        System.out.println("O area do quadrado igual a: " + lado);
        entrada.close();
    }
}