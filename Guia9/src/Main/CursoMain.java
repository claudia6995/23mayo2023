package Main;

import Class.Curso;
import Servicios.CursoServicio;
import java.util.Scanner;

public class CursoMain {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        CursoServicio cs = new CursoServicio();
        Curso c = new Curso();

        cs.crearCurso(c);
        cs.calcularGananciaSemanal(c);
        System.out.println("La ganancia es: $ " + cs.calcularGananciaSemanal(c));
    }
}
