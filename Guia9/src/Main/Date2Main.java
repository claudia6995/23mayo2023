package Main;


import Servicios.FechaServicio2;


public class Date2Main {

    public static void main(String[] args) {
        
        FechaServicio2 fs = new FechaServicio2();
        // fs.fechaNacimiento();
       //  fs.fechaActual();  no hace falta llamarlo porque ya esta invocado en diferencia. 
        fs.diferencia(fs.fechaNacimiento(), fs.fechaActual());
         fs.calcularEdad(fs.fechaNacimiento(), fs.fechaActual());
    }

}
