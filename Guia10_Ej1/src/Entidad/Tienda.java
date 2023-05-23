
package Entidad;

import java.util.HashMap;


public class Tienda {
  
//private String productos;
//private Double precio;
    
private HashMap<String,Double>producto= new HashMap();

    public Tienda() {
    }
   
public Tienda(HashMap<String, Double> producto) {
        this.producto = producto;
    }

    public HashMap<String, Double> getProducto() {
        return producto;
    }

    public void setProducto(HashMap<String, Double> producto) {
        this.producto = producto;
    }

    @Override
    public String toString() {
        return "Tienda{" + "producto:  " + producto + '}';
    }

  
}

//Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
//productos que venderemos y el precio que tendrán. 