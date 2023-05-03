/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author reroes
 */
public class Barrio {
    
    private String nombre;
    private Ciudad ciudad;
    
    public Barrio(String n, Ciudad c){
        nombre = n;
        ciudad = c;
    }
    
    public void establecerNombre(String n){
        nombre = n;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public void establecerCiudad(Ciudad n){
        ciudad = n;
    }
    
    public Ciudad obtenerCiudad(){
        return ciudad;
    }
    
}
