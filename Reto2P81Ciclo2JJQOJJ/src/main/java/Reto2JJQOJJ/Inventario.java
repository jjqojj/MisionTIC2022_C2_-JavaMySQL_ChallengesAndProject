
package Reto2JJQOJJ;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author jjqojj
 * 
 */
public class Inventario {
    private List<Vehiculo> vehiculos   = new ArrayList<>();
    
    
    public void addVehiculos (Vehiculo v){
        this.vehiculos.add(v);
    }
    
    
    @Override
    public String toString(){
        String pantalla="***Inventario Vehículo***";
        for(Vehiculo v:this.vehiculos){
            pantalla+="\n\t"+v.toString();
            
        }
        return pantalla;
    }
    
    
}
