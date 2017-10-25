/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Asignatura;

/**
 *
 * @author Salas
 */
public class Asignatura {
    private String nombre;
    private int creditos;
    private Carrera carrera;

    public Asignatura(Carrera c) {
        carrera = c;
        nombre ="INFORMATICA";
        creditos = 5;
    }
    

     public void establecer_nombre(String n){
        nombre = n;
    }
      public void establecer_creditos(int c1){
        creditos = c1;
    }
       public void establecer_carrera(Carrera c){
        carrera = c;
    }
       public String obtener_nombre(){
        return nombre;
    }
    
    public int obtener_creditos(){
        return creditos;
    }
    public Carrera obtener_carrera(){
        return carrera;
    }

    @Override
     public String toString(){
        String cadena = String.format("Datos del Estudiante \n"
                + "Nombre: %s\n"
                + "creditos: %s\n"
                + "carrera: %s\n"
                ,obtener_nombre(),
                obtener_creditos(),
                obtener_carrera());
                
     return cadena;
}  
}
