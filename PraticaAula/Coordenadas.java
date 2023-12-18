package PraticaAula;
import java.util.Scanner;

public class Coordenadas {
    public static void main(String[] args) {

        // Variaveis
        Scanner entrada = new Scanner(System.in);
        double x1, x2, y1, y2, distancia;

        // Entrada
        System.out.print("Digite a coordenada x1: ");
        x1 = entrada.nextDouble();
        System.out.print("Digite a coordenada y1: ");
        y1 = entrada.nextDouble();
        System.out.print("Digite a coordenada x2: ");
        x2 = entrada.nextDouble();
        System.out.print("Digite a coordenada y2: ");
        y2 = entrada.nextDouble();

        // Distancia = raiz((x2-x1)^2 + (y2 - y1)^2)
        distancia = Math.sqrt(Math.pow(x2-x1,2.0) + Math.pow(y2-y1,2.0));
        System.out.print("\nDistancia: "+ distancia);
        entrada.close();
    }  
}
