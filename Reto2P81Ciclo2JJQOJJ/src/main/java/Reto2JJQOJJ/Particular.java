
package Reto2JJQOJJ;
/**
 *
 * @author jjqojj
 * 
 */
public class Particular extends Vehiculo{
    protected String color;

    public Particular(String color, Double velocidad, int pasajeros, 
            String placa, String tipo) {
        super(velocidad, pasajeros, placa, tipo);
        this.color = color;
    }

    
    
    @Override
    public String toString(){
    return "Vehículo Particular-Placa: "+getPlaca()+" Velocidad: "+
            getVelocidad()+" Km/h Pasajeros: "+getPasajeros()+" Color: "+
            this.color;
    
}
    
    
    
    
    
    
    
    
}
