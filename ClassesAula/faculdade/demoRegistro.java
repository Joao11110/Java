package ClassesAula.faculdade;

public class demoRegistro {
    public static void main(String[] args) {
        RegistroAcademico ra = new RegistroAcademico();
        ra.inicializaRegistroAcademico("joao", "1234", 3, 0.75);
        System.out.print("\nNome: "+ ra.nome +"\n");
        System.out.print("Matricula: "+ ra.matricula +"\n");
        System.out.print("Código do curso: "+ ra.codigoCurso +"\n");
        System.out.print("Percentual de cobrança: "+ ra.percentualDeCobranca +"\n");
        System.out.print("Mesalidade: "+ ra.calculaMensalidade() +"\n\n");

        RegistroAcademico r2 = new RegistroAcademico();
        r2.inicializaRegistroAcademico("pedro", "1235", 3, 0.75);
        System.out.print("\nNome: "+ r2.nome +"\n");
        System.out.print("Matricula: "+ r2.matricula +"\n");
        System.out.print("Código do curso: "+ r2.codigoCurso +"\n");
        System.out.print("Percentual de cobrança: "+ r2.percentualDeCobranca +"\n");
        System.out.print("Mesalidade: "+ r2.calculaMensalidade() +"\n\n");

    }
}