package PraticaAula;
import java.util.Scanner;
import java.util.Calendar;

public class ValidaCartao {
    public static void main(String[] args) {

        // Variaveis
        String nome="", numero="", codigo="";
        int mes, ano, mesAtual, anoAtual;
        Scanner ent = new Scanner(System.in);
        boolean cartaoInvalido;
        System.out.printf("%s%s%s", nome, numero, codigo);

        // Ano e Mes
        Calendar calendar = Calendar.getInstance();
        anoAtual = calendar.get(Calendar.YEAR);
        mesAtual = calendar.get(Calendar.MONTH);

        // Entrada e saida
        System.out.print("Nome: ");
        nome = ent.nextLine();
        System.out.print("Numero: ");
        numero = ent.nextLine();
        System.out.print("Codigo: ");
        codigo = ent.nextLine();

        // Verificação
        do {
            System.out.print("Dia: ");
            mes = ent.nextInt();
            System.out.print("Mes: ");
            ano = ent.nextInt();
            cartaoInvalido = ano < anoAtual ||
            (ano == anoAtual && mes == mesAtual);
            if (cartaoInvalido) System.out.println("\nCartao invalido!\n");
        } while (ano < anoAtual || (ano == anoAtual && mes == mesAtual));
        System.out.println("\nCartao foi validado prossiga com a sua compra\n!");
        ent.close();
    }
}