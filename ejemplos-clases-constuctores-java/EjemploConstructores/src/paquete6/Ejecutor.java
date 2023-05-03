/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;

public class Ejecutor {
    public static void main(String[] args) {
        // Se crea un objeto haciendo referencia al constructor sin 
        // argumentos
        FacturaTelefonica fac = new FacturaTelefonica();
        System.out.println("Objeto sin argumentos\n");
        System.out.printf("Número telefónico: %s\n"
                + "Minutos mes: %.2f\nValor minuto: %.2f\n"
                + "Valor factura: %.2f\n", fac.obtenerNumeroTelefono(),
                fac.obtenerMinutosMes(),
                fac.obtenerValorMinuto(),
                fac.obtenerValorFactura());
        
        // Se crea un objeto haciendo referencia al constructor 
        // con argumentos de la clase
        String numero = "123456789";
        double minutos = 100;
        double valorMinutos = 0.25;
        
        FacturaTelefonica fac2 = new FacturaTelefonica(numero, minutos, 
                valorMinutos);
        System.out.println("\nObjeto con argumentos\n");
        System.out.printf("Número telefónico: %s\n"
                + "Minutos mes: %.2f\nValor minuto: %.2f\n"
                + "Valor factura: %.2f\n", fac2.obtenerNumeroTelefono(),
                fac2.obtenerMinutosMes(),
                fac2.obtenerValorMinuto(),
                fac2.obtenerValorFactura());
    }
}
