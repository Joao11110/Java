/*3. Escreva um programa que receba um ângulo em graus e o converta para sua represen-
tação em radianos. Divulgue também seno, cosseno, tangente, cossecante, secante e
cotangente do ângulo. */

package introJava;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        double angulo=0, radianos=0, seno=0, cosseno=0, tangente=0, cossecante=0, secante=0, cotangente=0;

        System.out.print("\nDigite o ângulo: ");
        angulo = ent.nextDouble();

        radianos = angulo*(Math.PI/180);
        seno = Math.sin(radianos);
        cosseno = Math.cos(radianos);
        tangente = Math.tan(cossecante);
        cossecante = Math.cosh(cossecante);
        secante = Math.sinh(secante);
        cotangente = Math.cosh(cotangente);

        System.out.print("Radianos: " + radianos + "\n");
        System.out.print("Seno: " + seno + "\n");
        System.out.print("Cosseno: " + cosseno + "\n");
        System.out.print("Tangente: " + tangente + "\n");
        System.out.print("Cossecante: " + cossecante + "\n");
        System.out.print("Secante: " + secante + "\n");
        System.out.print("Cotangente: " + cotangente + "\n\n");
        ent.close();
    }
}