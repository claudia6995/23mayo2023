package Servicios;

import Class.Curso;
import java.util.Scanner;

public class CursoServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Curso c = new Curso();

    public void cargarAlumnos(Curso c) {
        // permitirá al usuario ingresar los alumnos que asisten a las clases. almacenar esta información en un arreglo e iterar con un bucle,solicitando en cada repetición que se ingrese el nombre de cada alumno.

        String[] vAux = new String[5];

        for (int i = 0; i < vAux.length; i++) {
            System.out.println("Ingrese Alumno");
            vAux[i] = leer.next();
        }
        c.setAlumnos(vAux);
    }

    public void crearCurso(Curso c) {
        // pide los valores de los atributos al usuario y después se le asignan a sus respectivos atributos para llenar el objeto Curso. En este método invocamos al método cargarAlumnos() para asignarle valor al atributo alumnos
        String[] VauxT = new String[2];

        VauxT[0] = "Mañana";
        VauxT[1] = "Tarde";

        System.out.println("Ingrese nombreCurso");
        c.setNombreCurso(leer.next());
        System.out.println("Ingrese Cantidad de horas por día");
        c.setCantidadHorasPorDia(leer.nextInt());
        System.out.println("Ingrese Cantidad de días por Semana");
        c.setCantidadDiasPorSemana(leer.nextInt());

        System.out.println("Ingrese Precio por Hora");
        c.setPrecioPorHora(leer.nextDouble());
        cargarAlumnos(c);
    }

    public double calcularGananciaSemanal(Curso c) {
        // calcular la ganancia en una semana por curso. se deben multiplicar la cantidad de horas por día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que se repite el encuentro.
        double ganancia = c.getPrecioPorHora() * c.getCantidadHorasPorDia() * c.getCantidadDiasPorSemana() * c.getTurno().length * c.getAlumnos().length;

        return ganancia;
    }

}
