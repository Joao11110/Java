/*
Escreva uma classe para representar um time de um esporte qualquer em um campeo-
nato desse esporte. Que atributos devem ser representados nessa classe? Quais méto-
dos ela deve conter? Escreva um aplicativo de teste que demonstre as capacidades da
classe criada.

Escolhido: Time de tênis
 */

package Classes;

public class Q23 {
    public static void main(String[] args) {
        TimeEsportivo j1, j2;
        j1 = new TimeEsportivo();
        j2 = new TimeEsportivo();
        j1.inicializaJogador();
        j2.inicializaJogador();
        j1.lista();
        j2.lista();
        j1.removerJogador(j1);
        j1.lista();
        j2.lista();
    }
}