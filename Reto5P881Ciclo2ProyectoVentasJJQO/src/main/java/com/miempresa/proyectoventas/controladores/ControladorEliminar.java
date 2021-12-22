
package com.miempresa.proyectoventas.controladores;

//Elaborado por: John Jairo Quiroga Orozco
//Plantilla base del curso P81
//MisionTic 2021
//ngjquiroga@gmail.com
//Fecha finalización edición 12/10/2021


import com.miempresa.proyectoventas.modelos.ModeloProductos;
import com.miempresa.proyectoventas.vistas.VistaEliminar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.HashMap;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ControladorEliminar{
    JFrame ventanaPadre;
    VistaEliminar ventanaEliminar;

    public ControladorEliminar(JFrame ventanaPadre) {
        this.ventanaPadre = ventanaPadre;
        ventanaEliminar = new VistaEliminar();
        ventanaEliminar.setTitle("Ventana para eliminar registros");
        ImageIcon icono = new ImageIcon("src/main/java/com/miempresa/proyectoventas/vistas/LogoJJQO.png");
        ventanaEliminar.setIconImage(icono.getImage());
        this.ventanaPadre.setVisible(false);
        ventanaEliminar.setVisible(true);
        ventanaEliminar.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ventanaEliminar.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                ventanaPadre.setVisible(true);
            }
        });
        
        
        
        //REVISANDO ON
        JButton botConsultar = ventanaEliminar.getBotonConsultar();
        JButton botEliminar= ventanaEliminar.getBotonEliminar();
        botConsultar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String codigoProducto = ventanaEliminar.getCodigoProducto().getText();
                
                
                if("".equals(codigoProducto)){
                ventanaEliminar.getMsgError().setText("El campo Código Producto es obligatorio");
                return;}
                
                
                ModeloProductos modeloProducto = new ModeloProductos();
                    HashMap<String,String> resultado = modeloProducto.consultarProducto(codigoProducto);
                    if(!resultado.get("nombre_producto").equalsIgnoreCase("")){
                        ventanaEliminar.getMsgError().setText("Producto Codigo: " + codigoProducto);
                        ventanaEliminar.getEliminarCodigoProducto().setText(resultado.get("cod_producto"));
                        ventanaEliminar.getEliminarNombreProducto().setText(resultado.get("nombre_producto"));
                        ventanaEliminar.getEliminarDescripcionProducto().setText(resultado.get("descripcion_producto"));
                        ventanaEliminar.getEliminarPrecioProducto().setText(resultado.get("precio_producto"));
                        
                        
                        
                botEliminar.addActionListener(new ActionListener(){
                            @Override
                public void actionPerformed(ActionEvent ec) {
                ventanaEliminar.getMsgError().setText("");
                }
                });
                ventanaEliminar.getBotonEliminar().addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent ee) {
                                modeloProducto.borrarProducto(ventanaEliminar.getCodigoProducto().getText());
                                ventanaEliminar.getMsgError().setText("Producto eliminado con éxito");
                                ventanaEliminar.getEliminarNombreProducto().setText("");
                                ventanaEliminar.getEliminarDescripcionProducto().setText("");
                                ventanaEliminar.getEliminarPrecioProducto().setText("");
                                ventanaEliminar.getEliminarCodigoProducto().setText("");

                            }
                        });                    
                    }else{
                        ventanaEliminar.getMsgError().setText("El producto con codigo " + codigoProducto + " No existe");
                    }
                
            }
            
        });
        
    }
}
                
                
                
                

             
         
        
        //REVISANDO OFF


                

/*

*/