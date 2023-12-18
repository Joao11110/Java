package introJava;
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int codigo;
        double valor, desconto;

        // Usuário insere infomações
        System.out.print("\nDigite o código do setor: ");
        codigo = ent.nextInt();
        System.out.print("Digite o valor do produto: ");
        valor = ent.nextFloat();

        // Desconto é dado pelo setor e valor do produto
        if (codigo == 111){
            if (valor > 100) { // 40% de desconto
                desconto = valor*1.4 - valor;
                valor = valor - desconto;
                System.out.print("\nSetor de Eletros:\nValor do produto (40% desconto): " + valor + "\n");
            }
            else if (valor >= 50 && valor <= 100){ // 20% de desconto
                desconto = valor*1.2 - valor;
                valor = valor - desconto;
                System.out.print("\nSetor de Eletros:\nValor do produto (20% desconto): " + valor + "\n");
            }
            else if (valor < 50){ // 10% de desconto
                desconto = valor*1.1 - valor;
                valor = valor - desconto;
                System.out.print("\nSetor de Eletros:\nValor do produto (10% desconto): " + valor + "\n");
            }
        }
        else if(codigo == 222){
            if (valor >= 500) { // 10% de desconto
                desconto = valor*1.1 - valor;
                valor = valor - desconto;
                System.out.print("\nSetor de Cama, mesa e banho:\nValor do produto (10% desconto): " + valor + "\n");   
            }
            else{
                System.out.print("\nSetor de Cama, mesa e banho:\nValor do produto: " + valor + "\n"); 
            }
        }
        // Setor não foi identificado
        else{
            System.out.print("\nSetor inválido");
        }
        ent.close();
    }
}