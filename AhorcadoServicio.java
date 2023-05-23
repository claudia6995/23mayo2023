
package Ahorcado;
import Ahorcado.Ahorcado;

import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class AhorcadoServicio {
    Ahorcado ahorc = new Ahorcado();
    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    
    public void crearJuego(Ahorcado ahorc){
        /// pido palabra
        this.pedirPalabra(ahorc);
        
        ///pregunta si quiere Juego Normal o Rápido
        this.tipo_de_juego(ahorc);
        if(ahorc.getPalabra() == null){
            System.out.println("Ingrese la palabra secreta");
            String palabra = sc.next();
            ahorc.setPalabra(palabra);
        }
        
        
        boolean juego_rapido;
        ///define variable local, para trabajar, segun el resultado del getter
        if(ahorc.isJuego_rapido()){
            juego_rapido = true;
        }else{
            juego_rapido = false;
        }
       

        
        ///preguntar cantidad de intentos
        if(juego_rapido == false){
        System.out.println("Ingrese la Cantidad de Intentos");
        int jugadas_maximas = sc.nextInt();
        ahorc.setJugadas_maximas(jugadas_maximas);
        }else{
            ahorc.setJugadas_maximas(5);
        }
        
        
        ///preguntarle si Desea con Sensibilidad a Mayúsculas y Minúsculas
        if(juego_rapido == false){
            this.minusculasMayusculas(ahorc);
        }else{
            ahorc.setSensible_mayusculas(false);
        }
        
        
        //preguntarle si desea restar intentos aun si acierta
        if(juego_rapido == false){
        this.sensibleIntentosOpcion(ahorc);
        }else{
            ahorc.setSensible_intentos(false);
        }

        ///System.out.println("Ingrese la palabra secreta");
        String palabra = ahorc.getPalabra();
        /////ahorc.setPalabra(palabra);
        ahorc.setTamanio(palabra.length());

        ///una vez que tengo la palabra (y su longitud)
        ///defino el array de char de mi clase, dandole la dimension
        ahorc.setLetras(new char[palabra.length()]);
        ahorc.setLetras_mostrar(new char [palabra.length()]);
        
        ///seteo la cantidad de letras total:
        ahorc.setCant_letras_total(palabra.length());
        
        ///asigno cada letra en un subindice del array
        ///utilizando mi setter modificado
        
        for (int i = 0; i < palabra.length(); i++) {
            ahorc.setLetras(palabra.charAt(i), i);
            ahorc.setLetras_mostrar('_', i);
        }
        
        ///limpiar consola
         for (int i = 0; i < 40; ++i){
             System.out.println();
         }
        System.out.println("======= ¡A JUGAR! =======");
        
    }
    
    public void minusculasMayusculas(Ahorcado ahorc){
        System.out.println("¿Desea que sea sensible a Minúsculas y Mayúsculas?");
        System.out.println("1-SI   2-NO");
        
        int rta=3;
        do{
            rta = sc.nextInt();
        }while(rta!=1 && rta!=2);
 
        switch (rta) {
            case 1:
                ahorc.setSensible_mayusculas(true);
                break;
            case 2:
                ahorc.setSensible_mayusculas(false);
                break;
                
            default:
                System.out.println("Opción inválida");
                break;
        }
    }
    
    
     public void sensibleIntentosOpcion(Ahorcado ahorc){
        System.out.println("¿Desea que los intentos se resten aún si acierta la letra?");
        System.out.println("1-SI   2-NO");
        
        int rta=3;
        do{
            rta = sc.nextInt();
        }while(rta!=1 && rta!=2);
 
        switch (rta) {
            case 1:
                ahorc.setSensible_intentos(true);
                break;
            case 2:
                ahorc.setSensible_intentos(false);
                break;
                
            default:
                System.out.println("Opción inválida");
                break;
        }
    }
     
     
         public void tipo_de_juego(Ahorcado ahorc){
        
        
        int rta=3;
        do{
        System.out.println("¿Modo Normal o Juego Rápido?");
        System.out.println("1-Normal   2-Juego Rápido   3-Ayuda");
            rta = sc.nextInt();
            
            if(rta==3){
            System.out.println("=======================================================");
            System.out.println("Modo Normal: Muestra todas las opciones y detalles, es la versión standard.");
            System.out.println("Juego Rápido: Muestra en pantalla solo lo indispensable");
            System.out.println("Comienza con 5 intentos por defecto, sin sensibilidad a mayusculas, y no gasta intentos si acertamos.");
                System.out.println("===================================================");
            }
            
        }while(rta!=1 && rta!=2);
 
        switch (rta) {
            case 1:
                ahorc.setJuego_rapido(false);
                break;
            case 2:
                ahorc.setJuego_rapido(true);
                break;
            case 3:
               
                break;
            default:
                System.out.println("Opción inválida");
                break;
        }
    }

     
    public void longitud(Ahorcado ahorc){
        System.out.println("La longitud de la palabra es: [" + ahorc.getPalabra().length() + "]");
        
    }
    
    public void buscar(Ahorcado ahorc){
        System.out.println("------------------------------------");
        if(ahorc.isJuego_rapido()){
        System.out.println("Ingrese letra a buscar (Intentos: "+ahorc.getJugadas_maximas()+")");    
        }else{
        System.out.println("Ingrese la letra a Buscar:");
        }
        char letra = sc.next().charAt(0);
        
        int contador = 0;
        boolean encontrada = false;
        
        for (int i = 0; i < ahorc.getPalabra().length(); i++) {
            
            ////caso con Sensibilidad de Mayusculas y Minusculas
            if(!ahorc.isSensible_mayusculas()){
            if(ahorc.getLetrasConIndice(i) == Character.toLowerCase(letra) || ahorc.getLetrasConIndice(i) == Character.toUpperCase(letra)  ){
                contador++;
                encontrada=true;
                ahorc.setLetras_mostrar(letra, i);
                } ///ffin de condicion CON mayusc.
                
        }else{
            ///////caso SIN sensibilidad de Mayusculas y Minusculas
            if(ahorc.getLetrasConIndice(i) == letra){
                contador++;
                encontrada=true;
                ahorc.setLetras_mostrar(letra, i);
                }
            }///fin condicion SIN mayusc.
        }/// fin del for
        
            ///setter modificado por +=
            ahorc.sumarCant_letras_encontradas(contador);
            ///setter modificado por -= 
            if(ahorc.isSensible_intentos()){
            ahorc.restarJugadas_maximas(1);
            }
            
           System.out.println("------------------------------------");
           
            if (encontrada==true){
                    if(contador==1){
                    if(!ahorc.isJuego_rapido()){
                    System.out.println("La letra SI ha sido encontrada (una vez) en la palabra");
                    }
                    }else if(contador>1){
                    if(!ahorc.isJuego_rapido()){
                    System.out.println("La letra SI ha sido encontrada (" + contador + " veces) en la palabra");
                    }    
                    }
            }else{
                if(!ahorc.isJuego_rapido()){
                System.out.println("La letra NO ha sido encontrada en la palabra");
                }
                        if(!ahorc.isSensible_intentos()){
                        ahorc.restarJugadas_maximas(1); 
                    }
            }
    }

    
    public void encontradas(Ahorcado ahorc){
        System.out.println("Letras encontradas: [" + ahorc.getCant_letras_encontradas() + "]");
        System.out.println("Letras restantes: [" + (ahorc.getCant_letras_total() - ahorc.getCant_letras_encontradas() + "]"));
    }
    
    public void intentos(Ahorcado ahorc){
        System.out.println("Intentos restantes: [" + ahorc.getJugadas_maximas() + "]");
    }
    
    //////////////////////// método principal: juego //////////////////////
    
    public void juego(Ahorcado ahorc){
        this.crearJuego(ahorc);

        boolean ganador=false;
        
        do{
        if(!ahorc.isJuego_rapido()){
        this.longitud(ahorc);
        }
        
        this.letrasMostrar(ahorc);
        this.buscar(ahorc);
        
        if(!ahorc.isJuego_rapido()){
        this.encontradas(ahorc);
        }
        
        if(ahorc.getCant_letras_encontradas() == ahorc.getCant_letras_total()){
            ganador=true;
        }
        
        if(!ahorc.isJuego_rapido()){
        this.intentos(ahorc);
        }
        
        
        if(ahorc.getJugadas_maximas() < 1){
            System.out.println("¡Te quedaste sin intentos!");
        }
        
        }while(ganador==false && ahorc.getJugadas_maximas() > 0);
        
        
        if(ganador==true){
            System.out.println("------------------------------------");
            System.out.println("¡Felicitaciones, has ganado!");
            System.out.println("------------------------------------");
        }else{
            System.out.println("------------------------------------");
            System.out.println("¡Lo siento, vuelve a intentarlo!");
            System.out.println("------------------------------------");
        }
    }
    
    /// mostrar las letras tipo "A _ A _ _ L _ _ " -variable letrasMostrar
    public void letrasMostrar(Ahorcado ahorc){
        for (int i = 0; i < ahorc.getCant_letras_total(); i++) {
            System.out.print(ahorc.getLetras_mostrarIndice(i) + " ");
        }
        System.out.println("");
    }
    
    
    
    ////MÉTODO RESET. PARA RESETEAR LOS ATRIBUTOS Y VOLVER A JUGAR
    
    public void reset(Ahorcado ahorc) {
        ahorc.setPalabra(null);
        ahorc.setTamanio(0);
        ahorc.setJugadas_maximas(0);
        ahorc.setCant_letras_encontradas(0);
        ahorc.setLetras(null);
        ahorc.setCant_letras_total(0);
        ahorc.setLetras_mostrar(null);
    }
    
    
    public void pedirPalabra(Ahorcado ahorc){
        JFrame frame = new JFrame("Ingrese la palabra secreta");
        JPasswordField passwordField = new JPasswordField();
        int option = JOptionPane.showOptionDialog(frame, passwordField, "Ingrese la palabra secreta", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, null, null);
        if (option == JOptionPane.OK_OPTION) {
            /// asigno en un array de char, el resultado de JFrame
            char[] password = passwordField.getPassword();
            /// convierto ese array de String en un nuevo String
            String palabra_ingresada = new String(password);
            ///Seteo mi palabra con ese String armado
            ahorc.setPalabra(palabra_ingresada);
            
        frame.dispose();
    }else{
        JOptionPane.showMessageDialog(null, "Debe ingresar una palabra secreta", "Error", JOptionPane.ERROR_MESSAGE);
        }
    
}
}