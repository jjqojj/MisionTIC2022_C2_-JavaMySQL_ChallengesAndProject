
package Reto2JJQOJJ;
/**
 *
 * @author jjqojj
 * 
 */
public class Publico extends Vehiculo {
        protected String carga;

    public Publico(String carga, Double velocidad, int pasajeros, String placa, String tipo) {
        super(velocidad, pasajeros, placa, tipo);
        this.carga = carga;
    }

 
    
  
        
        @Override
     public String toString(){
         return "Vehículo Publico-Placa:"+getPlaca()+" Velocidad: " 
                 +getVelocidad()+" Km/h "+" Pasajeros: "+getPasajeros()
                 +" Carga Máxima: "+this.carga;
     }
  
 
    
}
