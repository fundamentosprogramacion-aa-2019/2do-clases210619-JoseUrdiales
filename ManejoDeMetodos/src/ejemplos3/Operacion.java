/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos3;

/**
 *
 * @author Jose Luis
 */
public class Operacion {
    public static int obtenerSuma(int [] valores){
        int suma = 0;
        for (int i = 0; i < valores.length; i++){
            suma = suma + valores[i];
        }
        return suma;
    }
}
