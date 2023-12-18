/*
25. Escreva uma classe cujos objetos representam alunos matriculados em uma disciplina da
Ufersa. Cada objeto dessa classe deve guardar os seguintes dados do aluno: matrícula,
nome, 2 notas de prova (P 1 e P 2) e 1 nota de trabalho (T ). Escreva os seguintes métodos
para esta classe:

• media: calcula a média parcial do aluno (M P )
– cada prova tem peso 2, 5 e o trabalho tem peso 2 (M P = (2,5×P 1+2,5×P 2+2×T)/7)

• provaFinal: calcula quanto o aluno precisa para o exame final (EF)
– retorna zero se o launo não necessita realizar o exame final (M P < 3 ou M P >= 7)
– média final M F = (MP × 6 + EF × 4)/10
– é necessário que MF seja maior ou igual a 5 para que o aluno seja aprovado
após realizar o exame final

Escreva um aplicativo de teste que demonstre as capacidades da classe criada
*/

package Classes;

public class Q25{
    public static void main(String[] args) {
        AlunosUfersa aluno;
        aluno = new AlunosUfersa();
        aluno.InsereDadosAlunoUfersa();
        aluno.ImprimeDadosAlunoUfersa();
    }
}