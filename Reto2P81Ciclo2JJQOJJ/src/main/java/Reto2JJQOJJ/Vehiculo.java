
package Reto2JJQOJJ;
/**
 *
 * @author jjqojj
 * 
 */
public abstract class Vehiculo {
private Double velocidad;
private int pasajeros;
private String placa;
private String tipo;

// Constructor de la clase

    public Vehiculo(Double velocidad, int pasajeros, String placa, String tipo) {
        this.velocidad = velocidad;
        this.pasajeros = pasajeros;
        this.placa = placa;
        this.tipo = tipo;
    }

// Definición de getters and setters.
    
    public Double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(Double velocidad) {
        this.velocidad = velocidad;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    



}
