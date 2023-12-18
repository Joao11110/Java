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

import java.util.Scanner;

public class Fatura {
    String identificador;
    String descricao;
    int quantidade;
    float preco;
    float fatura;
    Scanner sc = new Scanner(System.in);
    
    void inicializaFatura(){
        System.out.print("\n\nDigite os dados do produto:\n\n");
        System.out.print("Identificador: ");
        identificador = sc.nextLine();
        System.out.print("Descrição: ");
        descricao = sc.nextLine();
        System.out.print("Quantidade: ");
        quantidade = sc.nextInt();
        System.out.print("Preço: ");
        preco = sc.nextFloat();
    }

    void imprimeDadosProduto(){
        System.out.print("\nIdentificador: "+ identificador +"\n");
        System.out.print("Descrição: "+ descricao +"\n");
        System.out.print("Quantidade: "+ quantidade +"\n");
        System.out.print("Preço: "+ preco +"\n");
        fatura = quantidade * preco;
        System.out.print("Fatura: "+ fatura +"\n\n");
    }
}

