
package Reto2JJQOJJ;

import java.util.Scanner;

/**
 *
 * @author jjqojj
 * 
 */

public class Main {
    
    public static void main(String[] args) {
       Inventario inventario = new Inventario();
       
       String[] elementos;
       
       Scanner sc = new Scanner(System.in);
       
       
       do{
           elementos=sc.nextLine().split("&");
           
           if(elementos[0].equals("1")){
               
               String salida=elementos[0];
               String tipo=elementos[1];
               String placa=elementos[2];
               Double velocidad=Double.valueOf(elementos[3]);
               int pasajeros=Integer.valueOf(elementos[4]);
               String ArgumentoParticular=elementos[5];
                
               Vehiculo carro=null;
               
               if(tipo.equalsIgnoreCase("publico")){
                   
                   carro = new Publico(ArgumentoParticular,velocidad,pasajeros,placa,tipo);
               } else if(tipo.equalsIgnoreCase("particular")){
                   carro = new Particular(ArgumentoParticular,velocidad,pasajeros,placa,tipo);   
               }
               inventario.addVehiculos(carro);
               
               }
           else if(elementos[0].equals("2")){
               System.out.println(inventario.toString());
              
            }}
           while(!elementos[0].equals("3"));
            
           
       }
        
}   
        

