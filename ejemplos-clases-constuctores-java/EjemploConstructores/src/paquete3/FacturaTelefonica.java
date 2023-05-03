/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

public class FacturaTelefonica {

    private String numeroTelefono;
    private double minutosMes;
    private double valorMinuto;
    private double valorFactura;    
    
    public FacturaTelefonica(){
        numeroTelefono = "123456789";
        minutosMes = 100;
        valorMinuto = 0.25;
        
    }

    public void establecerNumeroTelefono(String c) {
        numeroTelefono = c;
    }

    public void establecerMinutosMes(double c) {
        minutosMes = c;
    }

    public void establecerValorMinuto(double c) {
        valorMinuto = c;
    }

    // public void establecerValorFactura(){
    public void calcularValorFactura() {
        valorFactura = minutosMes * valorMinuto;
    }

    public String obtenerNumeroTelefono() {
        return numeroTelefono;
    }

    public double obtenerMinutosMes() {
        return minutosMes;
    }

    public double obtenerValorMinuto() {
        return valorMinuto;
    }

    public double obtenerValorFactura() {
        return valorFactura;
    }

}
