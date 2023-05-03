/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

/**
 *
 * @author reroes
 */
public class Publicacion {

    private Autor autor;
    private int anioPublicacion;

    public Publicacion(Autor a, int anio) {
        autor = a;
        anioPublicacion = anio;
    }

    public void establecerAutor(Autor aut) {
        autor = aut;
    }

    public void establecerAnioPublicacion(int anio) {
        anioPublicacion = anio;
    }

    public Autor obtenerAutor() {
        return autor;
    }

    public int obtenerAnioPublicacion() {
        return anioPublicacion;
    }
}
