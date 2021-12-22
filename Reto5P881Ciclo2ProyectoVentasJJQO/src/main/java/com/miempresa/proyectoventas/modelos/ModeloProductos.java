package com.miempresa.proyectoventas.modelos;

//Elaborado por: John Jairo Quiroga Orozco
//Plantilla base del curso P81
//MisionTic 2021
//ngjquiroga@gmail.com
//Fecha finalización edición 12/10/2021



import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.table.DefaultTableModel;


public class ModeloProductos extends ModeloBase{

    public ModeloProductos() {
        super();
    }
    
    //ModeloProductos() throws Exception 
    
    public String insertarProducto(String codigoProducto, String nombreProducto,String descripcionProducto, Float precioProducto){
        String queryValidadKey = "SELECT cod_producto FROM t_productos WHERE cod_producto='"
                +codigoProducto+"'";
        HashMap<String,String> resultado=consultarPrimerResultado(queryValidadKey);
        if(resultado!=null){
            return "Ya existe un producto con este código";
        }
        String query="INSERT INTO t_productos(cod_producto,"
                + "nombre_producto,descripcion_producto,precio_producto) "
                + "VALUES ("
                + "'"+codigoProducto+"','"+nombreProducto+"','"+descripcionProducto+"',"
                + precioProducto+")";
        if(!insertar(query)){
            return "";
        }
        return "NO se puede guardar el producto"; 
    }
    
   
    
    
     public HashMap<String, String> consultarProducto(String codigoProducto){
        HashMap<String,String> productos = new HashMap<String,String>();
        String query = "SELECT * FROM t_productos WHERE cod_producto = '"
                + codigoProducto + "'";
        List<HashMap<String, String>> productoFinal = consultar(query);
        System.out.println(productoFinal);
        if(!productoFinal.isEmpty()){
            productos = productoFinal.get(0);
        }else{
            productos.put("nombre_producto", "");
        }
        return productos;
    }
     
     
     
     
     //REVISANDO
    
    public void actualizarProducto(String codigoProducto, String nombreProducto, String descripcionProducto, float precioProducto){
        String query = "UPDATE t_productos SET nombre_producto=\""+nombreProducto+"\", " + 
                "descripcion_producto=\""+descripcionProducto+"\", "+
                "precio_producto=\""+precioProducto+"\" "+
                "WHERE cod_producto = '"+codigoProducto+"';";
        Boolean operacion = actualizar(query);
        System.out.println("query = " + query);
        System.out.println("operacion = " + operacion);
    }
    
    public void borrarProducto(String codProducto){
        String query = "DELETE FROM t_productos WHERE cod_producto = \""+codProducto+"\";";
        try{
            boolean operacion = borrar(query);
            System.out.println("query = " + query);
            System.out.println("operacion = " + operacion);
        }catch(Exception ex){
            System.out.println("ex = " + ex);
        }
    }
    
    
    
}
