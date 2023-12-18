package PraticaAula;
import java.util.Scanner; // Importa a classe Scanner

public class bemvindo {
  public static void main(String[] args) {

    // Cria uma variável tipo string
    Scanner nome = new Scanner(System.in);
    String usuario;

    // Lê essa variável
    System.out.println("\nDigite seu nome: "); 
    usuario = nome.next();

    // Imprime uma mensagem de boas-vindas com o nome inserido
    System.out.println("Bem vindo! " + usuario + "\n");  
    nome.close();
  }
}