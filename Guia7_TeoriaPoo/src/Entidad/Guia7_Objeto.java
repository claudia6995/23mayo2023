
package Entidad;

public class Guia7_Objeto {
        
        private String nombre;
        private int edad;
        private int FechaNac;
        private String apodo;
// Contructor vacio
    public Guia7_Objeto() {
    }
// construcor con los parametros. 
    public Guia7_Objeto(String nombre, int edad, int FechaNac, String apodo) {
        this.nombre = nombre;
        this.edad = edad;
        this.FechaNac = FechaNac;
        this.apodo = apodo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getFechaNac() {
        return FechaNac;
    }

    public void setFechaNac(int FechaNac) {
        this.FechaNac = FechaNac;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }
// Muestras los datos originales. 
    @Override
    public String toString() {
        return "Guia7_Objeto{" + "nombre=" + nombre + ", edad=" + edad + ", FechaNac=" + FechaNac + ", apodo=" + apodo + '}';
    }
        
              
        
        
    }
    
            
    
