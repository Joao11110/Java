package ClassesAula.Triangulo;

public class DemoTri {
    public static void main(String[] args) {
        Triangulo t1, t2, t3;
        t1 = new Triangulo();
        t1.inicializaTriangulo(2.5, 2.5, 2.5, "retangulo");
        t2 = new Triangulo();
        t2.inicializaTriangulo(2.5, 2.5, 2.5, "retangulo");
        t3 = t1;
        System.out.println(t1 == t2);
        System.out.println(t1 == t3);
    }
}