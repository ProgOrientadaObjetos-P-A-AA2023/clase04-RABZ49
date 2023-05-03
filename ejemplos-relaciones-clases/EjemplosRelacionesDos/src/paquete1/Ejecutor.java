/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Ejecutor {
    
    public static void main(String[] args) {
        
        Barrio barrio1 = new Barrio("San Sebastián");
        Barrio barrio2 = new Barrio("Sucre");
        
        Persona persona1 = new Persona("René Elizalde", "1100909909", barrio1);
        
        System.out.printf("El barrio de la persona %s (%s) es: %s\n",
                persona1.obtenerNombre(),
                persona1.obtenerBarrio().obtenerNombre());
        
        persona1.establecerBarrio(barrio2);
        
        System.out.printf("El barrio de la persona %s (%s) es: %s\n",
                persona1.obtenerNombre(),
                persona1.obtenerBarrio().obtenerNombre());
    }
}
