package Ej3Extra;

import java.util.Scanner;

class Juego {

    Scanner leer = new Scanner(System.in);

    public int N1;
    public int N2;
    public int intento1;
    public int intento2;

    public Juego() {
    }
    public Juego(int jugador1, int jugador2) {
        this.N1 = jugador1;
        this.N2 = jugador2;
        this.intento1 = jugador1;
        this.intento2 = jugador2;
    }

    
    public int getN1() {
        return N1;
    }
    public int getN2() {
        return N2;
    }
    public int getintento1() {
        return intento1;
    }
    public int getintento2() {
        return intento2;
    }
  
    public void setN1(int N1) {
        this.N1 = N1;
    }
    public void setN2(int N2) {
        this.N2 = N2;
    }
    public int setintento1() {
        return intento1;
    }
    public int setintento2() {
        return intento2;
    }

    public void IngresarDatos1() {
        System.out.println(" Jugador Nº 1 Ingrese un Número ");
        N1 = leer.nextInt();
        System.out.println(" ..... ");
    }

    public void Adivinador1() {
        System.out.println("Jugador Nº 2 ingrese 1 número\n  Intento Nº 1");
        N2 = leer.nextInt();
       
        for (int i = 1; i <= 4; i++) {
             
            intento1 = 1;
            if (N1 < N2) {
                System.out.println(" más bajo. \n Intento Nº" + (intento1 + 1) + "\n  Ingresá otro número nuevamente");
                N2 = leer.nextInt();

            } else if (N1 > N2) {
                System.out.println("más alto. \n Intento Nº " + (intento1 + 1) + "\n  Ingresá otro número nuevamente");
                N2 = leer.nextInt();
            } else {
                System.out.println("Correcto, adivinaste");
                break;
            }

        }
        if (N1 != N2) {
            System.out.println("agotaste los intentos máximos, comienza un nuevo juego ");
        }
        System.out.println("***************************");
    }

    public void IngresarDatos2() {
        System.out.println(" Jugador Nº 2 Ingrese un Número ");
        N2 = leer.nextInt();
        System.out.println(".....");
    }

    public void Adivinador2() {
        System.out.println("Jugador Nº 1, ingrese 1 número\n  Intento Nº 1");
        N1 = leer.nextInt();
                for (int i = 1; i <= 4; i++) {
            intento2 = i;
            if (N2 < N1) {
                System.out.println(" más bajo. \n Intento Nº" + (intento2 + 1) + "\n  Ingresá otro número nuevamente");
                N1 = leer.nextInt();

            } else if (N2 > N1) {
                System.out.println("más alto. \n Intento Nº " + (intento2 + 1) + "\n  Ingresá otro número nuevamente");
                N1 = leer.nextInt();
            } else {
                System.out.println("Correcto, adivinaste");
                break;
            }
        }
        if (N2 != N1) {
            System.out.println("agotaste los intentos máximos, comienza un nuevo juego ");
        }
    }

    public void Ganador() {
        System.out.println(intento1);
        
        if (intento1 > intento2) {
            System.out.println(" ganó el jugador 2 ");
        } else {
            System.out.println("ganó el jugador 1");
        }

    }

}
