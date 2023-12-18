package ClassesAula.faculdade;

public class RegistroAcademico {
    String nome;
    String matricula;
    int codigoCurso;
    double percentualDeCobranca;

    void inicializaRegistroAcademico(String nome, String matricula, int codigoCurso, double percentualDeCobranca){
        this.nome = nome;
        this.matricula = matricula;
        this.codigoCurso = codigoCurso;
        this.percentualDeCobranca = percentualDeCobranca;
    }

    double calculaMensalidade(){
        return 100*codigoCurso*percentualDeCobranca;
    }
}