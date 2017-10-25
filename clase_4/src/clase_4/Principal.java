/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase_4;

/**
 *
 * @author Salas
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Carrera c = new Carrera("Electornica");
        c.establecer_nombre("informatica");
        c.establecer_modalidad("Distancia");
        Carrera c2 = new Carrera("Electornica");
        System.out.println(c2.obtener_modalidad());
        Carrera c3 = new Carrera("Sistemas"+"\n","Semipresencial");
        System.out.println(c3.obtener_modalidad()+c3.obtener_nombre());
        c3.establecer_modalidad(c3.obtener_modalidad().toUpperCase());
        System.out.println(c3.obtener_modalidad());
        
        
    }
    
}
