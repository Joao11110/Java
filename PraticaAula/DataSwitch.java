package PraticaAula;
import java.util.Scanner;

public class DataSwitch {
    public static void main(String[] args) {
        
        // Variaveis
        int dia, mes, ano, diasNoMes = 0;
        String nomeDoMes = "";

        // Input
        Scanner ent = new Scanner(System.in);
        System.out.print("\nDia: ");
        dia = ent.nextInt();
        System.out.print("Mes: ");
        mes = ent.nextInt();
        System.out.print("Ano: ");
        ano = ent.nextInt();

        // Checagem do mes e dos dias
        switch (mes) {
            case 1:
                nomeDoMes = "janeiro";
                diasNoMes = 31;
                break;
            case 2:
                nomeDoMes = "feveiro";
                diasNoMes = 28;
                break;
            case 3:
                nomeDoMes = "marco";
                diasNoMes = 31;
                break;
            case 4:
                nomeDoMes = "abril";
                diasNoMes = 28;
                break;
            case 5:
                nomeDoMes = "maio";
                diasNoMes = 31;
                break;
            case 6:
                nomeDoMes = "junho";
                diasNoMes = 30;
                break;
            case 7:
                nomeDoMes = "julho";
                diasNoMes = 31;
                break;
            case 8:
                nomeDoMes = "agosto";
                diasNoMes = 31;
                break;
            case 9:
                nomeDoMes = "setembro";
                diasNoMes = 30;
                break;
            case 10:
                nomeDoMes = "outubro";
                diasNoMes = 31;
                break;
            case 11:
                nomeDoMes = "novembro";
                diasNoMes = 30;
                break;
            case 12:
                nomeDoMes = "dezembro";
                diasNoMes = 30;
                break;
            default:
                break;
        }

        // Imprime a data e o numero de dias do mes
        System.out.print("\n" + dia + " de " + nomeDoMes + " de " + ano + "\n" + "Esse mes tem " + diasNoMes + " dias\n");
        ent.close();
    }
}