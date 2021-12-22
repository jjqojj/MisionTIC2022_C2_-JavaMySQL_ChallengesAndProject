
package p81.reto3p81ciclo2jjqojj;


import java.util.ArrayList;
import java.util.List;

public class Partes {



 
    
public static List clases(ArrayList<String> componentes){
    List<String> componentesSinRepetir = new ArrayList<>(); 
     //String[] componentesSinRepetir={};
     for(String comp:componentes){
        if(componentesSinRepetir.contains(comp)){
           
            
        }else{
          componentesSinRepetir.add(comp);  
        }
     }
     
    return  componentesSinRepetir;
 }
    
 
 public static List meFaltanDelaClase(ArrayList<Integer> partesFaltantes, ArrayList<String> listaClases,String componente){
     List<Integer> faltante = new ArrayList<>();
     
     for(Integer falt:partesFaltantes){
         if(listaClases.get(falt).equals(componente)){
             faltante.add(falt);
         }
     }
     
     return faltante;
 }
 
 
 
 
 public static List noTengo(ArrayList<String> listaAlmacen,ArrayList<String> listaEmpresa){
    List<String> meInteresa = new ArrayList<>();
    
    for(String almacen:listaAlmacen){
       if(listaEmpresa.contains(almacen)){
           
       }
       else{
           meInteresa.add(almacen);
       }
    }
    
    return meInteresa;
 }
 
 
 public static Integer puedoCambiar(ArrayList<String> listaAlmacen,ArrayList<String> listaEmpresa){
     Integer cantEmpresa=noTengo(listaAlmacen,listaEmpresa).size();
     Integer cantAlmacen=noTengo(listaEmpresa,listaAlmacen).size(); 
     Integer resultado=Math.min(cantEmpresa,cantAlmacen);
     
     return resultado;
 }
 
 
}
