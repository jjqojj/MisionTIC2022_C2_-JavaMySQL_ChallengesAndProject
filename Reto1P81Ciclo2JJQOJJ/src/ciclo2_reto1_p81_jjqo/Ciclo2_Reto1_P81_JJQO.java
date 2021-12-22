/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclo2_reto1_p81_jjqo;

/**
 *
 * @author jjqojj
 */


import java.util.Scanner;


public class Ciclo2_Reto1_P81_JJQO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
         // Solicitud de ingreso de cantidad de voluntarios de Pamplona
         // Actualización del reto por cambio de grupo P55**>>P81
         //Pamplona= disco A
         //Huesca = disco B
         //Lugo = disco C
         
         
        Scanner sc = new Scanner (System.in);
        int Pamplona=sc.nextInt();
        
        // Definiendo cantidad de voluntarios Huesca y Lugo
        
        int Huesca=2*Pamplona+4;
        int Lugo=(Huesca+Pamplona)/5;
        
        System.out.println(Pamplona+" "+Huesca+" "+Lugo);
        
        if(Lugo>=0 && Lugo<=20)
        {System.out.println("uno");}
        
         if(Lugo>=21 && Lugo<=30)
        {System.out.println("dos");}
         
          if(Lugo>=31 && Lugo<=50)
        {System.out.println("tres");}
          
          if(Lugo>50)
        {System.out.println("cuatro");}
          
    }
    
}
