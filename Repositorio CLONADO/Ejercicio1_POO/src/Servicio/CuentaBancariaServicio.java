
package Servicio;

import Entidades.CuentaBancaria;
import java.util.Scanner;


public class CuentaBancariaServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public CuentaBancaria Crear() {
        System.out.println("Ingrese su numero de cuenta");
        int numCuenta = leer.nextInt();
        System.out.println("Ingrese su DNI");
        long dni = leer.nextLong();
        System.out.println("Ingrese el saldo de su cuenta");
        double saldo = leer.nextDouble();
        
        return new CuentaBancaria(numCuenta, dni, saldo);
        
    }
    
    
    public double agregar(CuentaBancaria aux) {
        System.out.println("Ingrese cuanto desea agregar");
        double saldo1 = leer.nextDouble();
        double saldoAnt = aux.getSaldoActual();
        aux.setSaldoActual(saldo1+saldoAnt);
        return aux.getSaldoActual();
    }
    
    public double retirar(CuentaBancaria aux){
        double saldo1;
        double saldoAnt;
        
        System.out.println("Ingrese el monto que desea retirar");
        saldo1= leer.nextDouble();
        saldoAnt=aux.getSaldoActual();
        if (saldo1>saldoAnt) {
            System.out.println("Fondos insuficientes ha retirado " + aux.getSaldoActual());
            aux.setSaldoActual(0);
        }else{
            aux.setSaldoActual(saldoAnt-saldo1);
        }
        
        return aux.getSaldoActual();
    }
    
    public void ExtraccionRapida(CuentaBancaria aux) {
        double saldoAnt = aux.getSaldoActual();
        do {
            System.out.println("Ingrese cuanto dinero desea extraer. Hasta "+ saldoAnt * 0.20);
            double extraccion = leer.nextDouble();
            if (extraccion>saldoAnt*0.20) {
                System.out.println("Cantidad Invalida, ingrese otra cantidad");
                
            }else{
                aux.setSaldoActual(saldoAnt-extraccion);
                break;
            }
        } while (true);
        
    }
    
    public void ConsultarSaldo(CuentaBancaria aux){
        System.out.println("Saldo " +aux.getSaldoActual());
    }
    
    public void ConsultarDatos(CuentaBancaria aux){
        System.out.println(aux.toString());
    }
}
