/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejodemetodos;

/**
 *
 * @author Jose Luis
 */
public class ManejoDeMetodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Operacion.metodoUno();
        Operacion.metodoTres("52");
        Operacion.metodoUno();
        String m = Operacion.metodoDos();
        System.out.println(m);
        Operacion.metodoTres("20","51");
        System.out.println(m);
        Operacion.metodoUno();
    }
    
}
