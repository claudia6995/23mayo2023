
package Ahorcado;

import Ahorcado.Ahorcado;
import Ahorcado.AhorcadoServicio;


public class Ahorcado {
    private String palabra;
    private int tamanio;
    private char[] letras;
    private char[] letras_mostrar;
    private int cant_letras_encontradas;
    private int cant_letras_total ;
    private int jugadas_maximas;
    private boolean sensible_mayusculas = false;
    private boolean sensible_intentos = false;
    private boolean juego_rapido;

    
    public Ahorcado() {
    }

    public Ahorcado(String palabra, int tamanio, char[] letras, char[] letras_mostrar, int cant_letras_encontradas, int cant_letras_total, int jugadas_maximas) {
        this.palabra = palabra;
        this.tamanio = tamanio;
        this.letras = letras;
        this.letras_mostrar = letras_mostrar;
        this.cant_letras_encontradas = cant_letras_encontradas;
        this.cant_letras_total = cant_letras_total;
        this.jugadas_maximas = jugadas_maximas;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public char[] getLetras() {
        return letras;
    }
    
    /// modificado
      public char getLetrasConIndice(int subindice) {
        return letras[subindice];
    }

    public void setLetras(char[] letras) {
        this.letras = letras;
    }
    
    ////setter modificado
        public void setLetras(char letra, int subindice) {
        this.letras[subindice] = letra;
    }
        
    ////setter modificado para mostrar en " _ _ _ _ _ _ "
        public void setLetras_mostrar(char letra, int subindice) {
        this.letras_mostrar[subindice] = letra;
    }
    

    public int getCant_letras_encontradas() {
        return cant_letras_encontradas;
    }

    
    public void setCant_letras_encontradas(int cant_letras_encontradas) {
        this.cant_letras_encontradas = cant_letras_encontradas;
    }
    
    /// settermodificado
    public void sumarCant_letras_encontradas(int cant_letras_encontradas) {
    this.cant_letras_encontradas += cant_letras_encontradas;
    }

    public int getJugadas_maximas() {
        return jugadas_maximas;
    }

    public void setJugadas_maximas(int jugadas_maximas) {
        this.jugadas_maximas = jugadas_maximas;
    }
    
    //// //// setter  modificado
    public void restarJugadas_maximas(int jugadas_maximas) {
        this.jugadas_maximas -= jugadas_maximas;
    }

    public int getCant_letras_total() {
        return cant_letras_total;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public void setCant_letras_total(int cant_letras_total) {
        this.cant_letras_total = cant_letras_total;
    }

    public void setSensible_mayusculas(boolean sensible_mayusculas) {
        this.sensible_mayusculas = sensible_mayusculas;
    }

    public int getTamanio() {
        return tamanio;
    }

    public boolean isSensible_mayusculas() {
        return sensible_mayusculas;
    }

    
    
    public boolean isSensible_intentos() {
        return sensible_intentos;
    }

    public void setSensible_intentos(boolean sensible_intentos) {
        this.sensible_intentos = sensible_intentos;
    }

    
    public boolean isJuego_rapido() {
        return juego_rapido;
    }

    public void setJuego_rapido(boolean juego_rapido) {
        this.juego_rapido = juego_rapido;
    }

    
    
    
    
    public char[] getLetras_mostrar() {
        return letras_mostrar;
    }
    
    public char getLetras_mostrarIndice(int indice) {
        return letras_mostrar[indice];
    }

    public void setLetras_mostrar(char[] letras_mostrar) {
        this.letras_mostrar = letras_mostrar;
    }

    @Override
    public String toString() {
        return "Ahorcado{" + "palabra=" + palabra + ", tamanio=" + tamanio + ", letras=" + letras + ", cant_letras_encontradas=" + cant_letras_encontradas + ", cant_letras_total=" + cant_letras_total + ", jugadas_maximas=" + jugadas_maximas + '}';
    }
    
    
    
}
