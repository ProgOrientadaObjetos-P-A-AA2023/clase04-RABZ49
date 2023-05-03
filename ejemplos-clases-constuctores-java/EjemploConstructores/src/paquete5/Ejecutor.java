/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

public class Ejecutor {
    public static void main(String[] args) {
        // Se crea un objeto que tiene un contructor 
        // con argumentos
        String numero = "123456789";
        double minutos = 100;
        double valorMinutos = 0.25;
        
        FacturaTelefonica fac = new FacturaTelefonica(numero, minutos, 
                valorMinutos);
        System.out.printf("Número telefónico: %s\n"
                + "Minutos mes: %.2f\nValor minuto: %.2f\n"
                + "Valor factura: %.2f\n", fac.obtenerNumeroTelefono(),
                fac.obtenerMinutosMes(),
                fac.obtenerValorMinuto(),
                fac.obtenerValorFactura());
    }
}
