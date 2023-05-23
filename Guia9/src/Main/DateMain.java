package Main;

import Servicios.FechaService;
import java.util.Date;

public class DateMain {

    public static void main(String[] args) {
        FechaService f = new FechaService();
        f.fechaNacimiento();
        f.fechaActual();
        f.diferencia(f.fechaActual(), f.fechaNacimiento());

    }
    }
