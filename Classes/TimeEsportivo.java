/*
Escreva uma classe para representar um time de um esporte qualquer em um campeo-
nato desse esporte. Que atributos devem ser representados nessa classe? Quais méto-
dos ela deve conter? Escreva um aplicativo de teste que demonstre as capacidades da
classe criada.

Escolhido: Time de tênis
 */

package Classes;

import java.util.Scanner;

public class TimeEsportivo {
    String no; // Nome
    int cp; // Campeonatos
    String cl; // Classes
    float sl; // Salário
    int id; // Idade
    int tc; // Taças
    Scanner sc = new Scanner(System.in);

    void inicializaJogador(){
        System.out.print("\n\nDigite os dados do jogador:\n");
        System.out.print("Nome: ");
        no = sc.next();
        System.out.print("Idade: ");
        id = sc.nextInt();
        System.out.print("Classe: ");
        cl = sc.next();
        System.out.print("Campeonatos: ");
        cp = sc.nextInt();
        System.out.print("Taças: ");
        tc = sc.nextInt();
        System.out.print("Salário: ");
        sl = sc.nextFloat();
    }

    void lista(){
        if (no == null && id == 0 && cl == null && cp == 0 && tc == 0 && sl == 0) {
            System.out.print("\n\nJogador não identificado ou removido!\n"); 
        }
        else{
            System.out.println("\n\nDados do jogador:\n");
            System.out.print("Nome: "+ no +"\n");
            System.out.print("Idade: "+ id +"\n");
            System.out.print("Classe: "+ cl +"\n");
            System.out.print("Campeonatos: "+ cp +"\n");
            System.out.print("Taças: "+ tc +"\n");
            System.out.print("Salário: "+ sl +"\n\n");  
        }       
    }

    void removerJogador(TimeEsportivo jogador){
        jogador.no = null;
        jogador.id = 0;
        jogador.cl = null;
        jogador.cp = 0;
        jogador.tc = 0;
        jogador.sl = 0;
    }
}