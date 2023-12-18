package PraticaAula;
import java.util.Scanner;

public class DataIf {
    public static void main(String[] args) {
        
        // Variaveis
        int dia, mes, ano;
        String nomeDoMes = "";

        // Input
        Scanner ent = new Scanner(System.in);
        System.out.print("\nDia: ");
        dia = ent.nextInt();
        System.out.print("Mes: ");
        mes = ent.nextInt();
        System.out.print("Ano: ");
        ano = ent.nextInt();

        // Checagem do mes
        if(mes == 1){nomeDoMes = "janeiro";} 
        else if(mes == 2){nomeDoMes = "feveiro";}
        else if(mes == 3){nomeDoMes = "marco";}
        else if(mes == 4){nomeDoMes = "abril";}
        else if(mes == 5){nomeDoMes = "maio";}
        else if(mes == 6){nomeDoMes = "junho";}
        else if(mes == 7){nomeDoMes = "julho";}
        else if(mes == 8){nomeDoMes = "agosto";}
        else if(mes == 9){nomeDoMes = "setembro";}
        else if(mes == 10){nomeDoMes = "outubro";}
        else if(mes == 11){nomeDoMes = "novembro";}
        else{nomeDoMes = "dezembro";}

        // Imprime a data
        System.out.print("\n" + dia + " de " + nomeDoMes + " de " + ano + "\n");
        ent.close();   
    }
}