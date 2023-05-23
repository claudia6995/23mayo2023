package Servicios;

import com.sun.swing.internal.plaf.metal.resources.metal;
import java.util.Date;
import java.util.Scanner;

public class FechaServicio2 {

    Scanner leer = new Scanner(System.in);

    /**
     * FechaService, en paquete Servicios, que tenga los siguientes métodos:
     */
    /**
     * Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento. Luego los pase por parámetro a un nuevo objeto Date. El método debe retornar el objeto Date. Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
     */
    public Date fechaNacimiento() {
        System.out.println("Ingrese año de nacimiento");
        int año = leer.nextInt() - 1900;
        System.out.println("Ingrese mes de nacimiento");
        int mes = leer.nextInt() - 1;
        System.out.println("Ingrese dia de nacimiento");
        int dia = leer.nextInt();
        Date fNac = new Date(año, mes, dia);
        return fNac;
    }

    /**
     * Método fechaActual que cree un objeto fecha con el día actual. Para esto usaremos el constructor vacío de la clase Date. Ejemplo: Date fechaActual = new Date(); El método debe retornar el objeto Date.
     *
     * @return
     */
    public Date fechaActual() {
        Date fechaActual = new Date();
        return fechaActual;

    }

    /**
     * Método diferencia que reciba las dos fechas por parámetro y retorna la diferencia de años entre una y otra (edad del usuario). Si necesiten acá tienen más información en clase Date: Documentacion Oracle
     */
    public void diferencia(Date fechaNacimiento, Date fechaActual) {

        int dif = fechaActual.getYear() - fechaNacimiento.getYear();
        System.out.println("La diferencia de años entre  una fecha y otra es " + dif);

    }

    public int calcularEdad(Date fechaNacimiento, Date fechaActual) {

        int edad = fechaActual.getYear() - fechaNacimiento.getYear();
        if (fechaActual.getMonth() < fechaNacimiento.getMonth())  {
        } else if (fechaActual.getDay() >= fechaNacimiento.getDay()) {

            }else{ edad --;
            
            }
        System.out.println("La edad es "+ edad);
        return edad;
            
           
        }

    }

