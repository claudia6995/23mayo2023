
package Servicios;

import java.util.Date;
import java.time.LocalDate;
import java.util.Scanner;


public class FechaService {

    Scanner leer = new Scanner(System.in);

    public Date fechaNacimiento() {
        int  anio,mes, dia;
        System.out.println("Ingrese su año  de nacimiento");
        anio = leer.nextInt();
        System.out.println("Ingrese su mes  de nacimiento");
        mes = leer.nextInt();
        System.out.println("Ingrese su dìa de nacimiento");
        dia = leer.nextInt();

        Date fNac = new Date(anio, mes, dia);
        System.out.print("La fecha de Nacimiento es "+ dia + "-" + mes + "-" + (anio));
        System.out.println(" ");
        return fNac;

    }

    public Date fechaActual() {
        Date fechaActual = new Date();
       System.out.println("La fecha actual es: " + LocalDate.now());

        return fechaActual;
    }

    public int diferencia(Date fechaActual,Date fechaNacimiento) {
        long milisegundos = fechaActual.getTime()-fechaNacimiento.getTime();
        long milisegEnAnio= 1000L*60L*60L*365L;

        int dif = (int) ((int)(milisegundos)/milisegEnAnio);
        System.out.println( "La diferencia es "+ dif);
        return dif;
    }

       
    }

    

