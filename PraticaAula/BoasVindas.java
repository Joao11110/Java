package PraticaAula;
import java.util.Scanner;

public class BoasVindas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome;
        int idade;
        System.out.print("\nDigite o seu nome: ");
        nome = entrada.nextLine();
        System.out.print("\nDigite o sua idade: ");
        idade = entrada.nextInt();
        System.out.println("Bem-vindo(a) " + nome + " - idade: " + idade);
        entrada.close();
    }  
}