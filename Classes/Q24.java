/*
Q.24

Crie uma classe chamada Fatura para que uma loja de suprimentos de informática a
utilize para representar uma fatura de um item vendido. Uma Fatura deve incluir as se-
guintes informações sobre o item vendido: o número de identificação, a descrição, a
quantidade comprada e o preço unitário. Se a quantidade não for positiva, ela deve ser
configurada como 0. Se o preço por item não for positivo, ele deve ser configurado como
0.0. Forneça também um método chamado calculaTotal que calcula e retorna o valor de
fatura (isto é, multiplica a quantidade pelo preço por item). Escreva um aplicativo de teste
que demonstre as capacidades da classe criada.
 */

package Classes;

public class Q24 {
    public static void main(String[] args) {
        Fatura f1;
        f1 = new Fatura();
        f1.inicializaFatura();
        f1.imprimeDadosProduto();
    }  
}