/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p81.reto3p81ciclo2jjqojj;

import java.util.ArrayList;
import java.util.List;
//import p81.reto3p81ciclo2jjqojj.Partes;

/**
 *
 * @author jjqoj
 */
public class MainPrueba {
    
    
    public static void main(String[] args) {
        
        ArrayList<String> componentes1= new ArrayList();
        
       componentes1.add("electrónicos");
       componentes1.add("ópticos");
       componentes1.add("ópticos");
       componentes1.add("software");
       componentes1.add("software");
       componentes1.add("comunicaciones");
       componentes1.add("electrónicos");
       componentes1.add("software");
       componentes1.add("ópticos");
       componentes1.add("comunicaciones");
       componentes1.add("software");
       
        
       //// Revisando método 1
       System.out.println("Método 1");
       System.out.println(componentes1.get(0));
       System.out.println(Partes.clases(componentes1));
        
       
       ////////////////////////////////////////////////////////////
       
       
        ArrayList<Integer> partesFaltantes1= new ArrayList();
        partesFaltantes1.add(0);
        partesFaltantes1.add(3);
        partesFaltantes1.add(6);
        //partesFaltantes1.add(7);
        
        ArrayList<String> listado1= new ArrayList<>();
        listado1.add("electrónicos");
        listado1.add("ópticos");
        listado1.add("ópticos");
        listado1.add("software");
        listado1.add("software");
        listado1.add("comunicaciones");
        listado1.add("electrónicos");
        listado1.add("software");
        listado1.add("ópticos");
        listado1.add("comunicaciones");
        listado1.add("software");
        listado1.add("software");
        String componente="electrónicos";
        
        ArrayList<Integer> partesFaltantes2= new ArrayList<>();
        partesFaltantes2.add(5);
        partesFaltantes2.add(2);
        partesFaltantes2.add(11);
        partesFaltantes2.add(17);
        partesFaltantes2.add(23);
        partesFaltantes2.add(19);
        partesFaltantes2.add(0);
        partesFaltantes2.add(1);
        partesFaltantes2.add(16);
        partesFaltantes2.add(7);
        partesFaltantes2.add(18);
        partesFaltantes2.add(28);
        partesFaltantes2.add(6);
        partesFaltantes2.add(13);
        partesFaltantes2.add(8);
        
        
        ArrayList<String> listado2= new ArrayList<>();
        listado2.add("1");
        listado2.add("3");
        listado2.add("3");
        listado2.add("3");
        listado2.add("2");
        listado2.add("1");
        listado2.add("3");
        listado2.add("2");
        listado2.add("1");
        listado2.add("2");
        listado2.add("1");
        listado2.add("1");
        listado2.add("2");
        listado2.add("2");
        listado2.add("2");
        listado2.add("3");
        listado2.add("2");
        listado2.add("1");
        listado2.add("3");
        listado2.add("3");
        listado2.add("3");
        listado2.add("3");
        listado2.add("3");
        listado2.add("3");
        listado2.add("3");
        listado2.add("2");
        listado2.add("3");
        listado2.add("2");
        listado2.add("1");
        listado2.add("2");
        
        
        
        
         String componente2="3";
         //// Revisando método 2
        System.out.println("Método 2");
        System.out.println(Partes.meFaltanDelaClase(partesFaltantes1,listado1,componente));
        System.out.println(Partes.meFaltanDelaClase(partesFaltantes2,listado2,componente2));
         ////////////////////////////////////////////////////////////
         
        ArrayList<String> OtraEmpresa= new ArrayList();
        OtraEmpresa.add("1");
        OtraEmpresa.add("3");
        OtraEmpresa.add("4");
        OtraEmpresa.add("6");
        OtraEmpresa.add("7");
        OtraEmpresa.add("8");
        
        
        ArrayList<String> Empresa= new ArrayList();
        Empresa.add("2");
        Empresa.add("3");
        Empresa.add("5");
        Empresa.add("7");
           
            //// Revisando método 3
        System.out.println("Método 3");
        System.out.println(Partes.noTengo(OtraEmpresa,Empresa));
        
        ////////////////////////////////////////////////////////////
        
        ArrayList<Integer> OtraEmpresa2= new ArrayList();
        OtraEmpresa2.add(0);
        OtraEmpresa2.add(2);
        OtraEmpresa2.add(3);
        OtraEmpresa2.add(5);
        OtraEmpresa2.add(7);
        OtraEmpresa2.add(10);
        OtraEmpresa2.add(11);
        OtraEmpresa2.add(12);
        OtraEmpresa2.add(13);
        
        
        ArrayList<Integer> Empresa2= new ArrayList();
        Empresa2.add(2);
        Empresa2.add(4);
        Empresa2.add(8);
        Empresa2.add(6);
        Empresa2.add(5);
        
         //// Revisando método 4
        System.out.println("Método 4");
        System.out.println(Partes.puedoCambiar(OtraEmpresa,Empresa));
        
    }
    
}
