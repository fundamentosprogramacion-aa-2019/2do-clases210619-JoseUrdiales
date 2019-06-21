/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos2;

import java.util.Scanner;

/**
 * generar un proceso que me permita ingresar 5 (de manera obligatoria) ciudades.
 * si las ciudades no cumplen con la condicion (empezar con a,c,d), no se contabilizan
 * @author Jose Luis
 */
public class Ejecutable {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int limite = 5;
        int contador = 1;
        String ciudad = "";
        while(contador<=limite){
            System.out.println("Ingrese ciudad: ");
            ciudad = entrada.nextLine();
            boolean resultado = Operacion.comprobarCadena(ciudad);
            if (resultado == true){
                System.out.printf("%s\n", ciudad);
                contador += 1;    
            }else{
                System.out.println("Valor ingresado fuera de rango.");
            }            
        }
    }
}
