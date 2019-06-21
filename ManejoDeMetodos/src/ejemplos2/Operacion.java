/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos2;

/**
 *
 * @author Jose Luis
 */
public class Operacion {
    public static boolean comprobarCadena(String cadena){
        boolean bandera = false;
        if(cadena.startsWith("A") || (cadena.startsWith("D")) || 
                (cadena.startsWith("C"))){
            bandera = true;
        }
        return bandera;
    }
}
