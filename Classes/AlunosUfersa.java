/*
25. Escreva uma classe cujos objetos representam alunos matriculados em uma disciplina da
Ufersa. Cada objeto dessa classe deve guardar os seguintes dados do aluno: matrícula,
nome, 2 notas de prova (P 1 e P 2) e 1 nota de trabalho (T). Escreva os seguintes métodos
para esta classe:

• media: calcula a média parcial do aluno (MP)
– cada prova tem peso 2, 5 e o trabalho tem peso 2 (MP = (2,5 × P1 + 2,5× P2 + 2×T)/7)

• provaFinal: calcula quanto o aluno precisa para o exame final (EF)
– retorna zero se o aluno não necessita realizar o exame final (MP < 3 ou MP >= 7)
– média final MF = (MP × 6 + EF × 4)/10
– é necessário que MF seja maior ou igual a 5 para que o aluno seja aprovado
após realizar o exame final

Escreva um aplicativo de teste que demonstre as capacidades da classe criada
*/

package Classes;

import java.util.Scanner;

public class AlunosUfersa {
    Scanner sc = new Scanner((System.in));
    String matricula;
    String nome;
    float prova1;
    float prova2;
    float trabalho;
    float recuperacao;
    double mediaParcial;
    double mediaRecuperacao;
    double mp;
    double mr;

    void InsereDadosAlunoUfersa(){
        System.out.print("\n\nDigite os dados do aluno:\n\n");
        System.out.print("Nome: ");
        nome = sc.nextLine();
        System.out.print("Matrícula: ");
        matricula = sc.nextLine();
        System.out.print("Prova 1: ");
        prova1 = sc.nextFloat();
        System.out.print("Prova 2: ");
        prova2 = sc.nextFloat();
        System.out.print("Trabalho: ");
        trabalho = sc.nextFloat();
    }

    void ImprimeDadosAlunoUfersa(){
        System.out.print("\n\nDados do aluno:\n\n");
        System.out.print("Nome: "+ nome +"\n");
        System.out.print("Matrícula: "+ matricula +"\n");
        System.out.print("Prova 1: "+ prova1 +"\n");
        System.out.print("Prova 2: "+ prova2 +"\n");
        System.out.print("Trabalho: "+ trabalho +"\n");
        mp = mediaParcial();
        System.out.print("Média: "+ mp +"\n");

        if (mp >= 7) {
            System.out.print("Situação: aprovado direto\n\n");   
        }
        else if (mp < 7){
            System.out.print("Situação: em recuperação\n");
            System.out.print("Digite a nota da recuperação: ");
            recuperacao = sc.nextFloat();
            mr = mediaFinal(recuperacao, mp);
            if (mr >= 5) {
                System.out.print("Média final: "+ mr +"\n");
                System.out.print("Situação: aprovado na recuperação\n\n");   
            }
            else{
                System.out.print("Média final: "+ mr +"\n");
                System.out.print("Situação: reprovado na recuperação\n\n");
            }
        }
        else if (mp <= 3 ){
            System.out.print("Situação: Reprovado direto");
        }
    }

    double mediaParcial() {
        mediaParcial = (2.5 * prova1 + 2.5 * prova2 + 2.0 * trabalho) / 7.0;
        return mediaParcial;
    }

    double mediaFinal(float recuperacao, double mp){
        mediaRecuperacao = (mp * 6 + recuperacao * 4)/10;
        return mediaRecuperacao;
    }
}