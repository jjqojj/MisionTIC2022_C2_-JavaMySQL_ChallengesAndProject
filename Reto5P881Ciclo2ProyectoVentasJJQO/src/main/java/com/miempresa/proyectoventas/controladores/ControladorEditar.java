package com.miempresa.proyectoventas.controladores;


//Elaborado por: John Jairo Quiroga Orozco
//Plantilla base del curso P81
//MisionTic 2021
//ngjquiroga@gmail.com
//Fecha finalización edición 12/10/2021

import com.miempresa.proyectoventas.modelos.ModeloProductos;
import com.miempresa.proyectoventas.vistas.VistaEditar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.HashMap;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ControladorEditar{
    JFrame ventanaPadre;
    VistaEditar ventanaEditar;

    public ControladorEditar(JFrame ventanaPadre) {
        this.ventanaPadre = ventanaPadre;
        ventanaEditar = new VistaEditar();
        ventanaEditar.setTitle("Ventana de edición");
        ImageIcon icono = new ImageIcon("src/main/java/com/miempresa/proyectoventas/vistas/LogoJJQO.png");
        ventanaEditar.setIconImage(icono.getImage());
        this.ventanaPadre.setVisible(false);
        ventanaEditar.setVisible(true);
        ventanaEditar.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ventanaEditar.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                ventanaPadre.setVisible(true);
            }
        });
        
        
        
        // Revisando on
        JButton botonConsultar = ventanaEditar.getBotonBuscarRegistro();
        JButton botonActualizar= ventanaEditar.getBotonGuardarCambios();
        botonConsultar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ev){
               
                ventanaEditar.getMsgError().setText("");
                String codigoProducto = ventanaEditar.getCodigoProducto().getText();
                
                if("".equals(codigoProducto)){
                  ventanaEditar.getMsgError().setText("El campo Código Producto es obligatorio");
                  return;
              }
                
               
                ModeloProductos modeloProducto = new ModeloProductos();
                    HashMap<String,String> resConsulta = modeloProducto.consultarProducto(codigoProducto);
                    if(!resConsulta.get("nombre_producto").equals("")){
                        ventanaEditar.getMsgError().setText("Producto a editar con código: "+codigoProducto);
                        
                        
                        ventanaEditar.getEditarNombreProducto().setText(resConsulta.get("nombre_producto"));
                        ventanaEditar.getEditarDescripcionProducto().setText(resConsulta.get("descripcion_producto"));
                        ventanaEditar.getEditarPrecioProducto().setText(resConsulta.get("precio_producto"));
                        
                        
                        botonActualizar.addActionListener(new ActionListener(){
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                Float precioFloat; 
                                String editarNombreProducto = ventanaEditar.getEditarNombreProducto().getText();
                                String editarDescripcionProducto = ventanaEditar.getEditarDescripcionProducto().getText();
                                String editarPrecioProducto = ventanaEditar.getEditarPrecioProducto().getText();
                                
                                if("".equals(editarNombreProducto)){
                                ventanaEditar.getMsgError().setText("El campo Nombre Producto es obligatorio");
                                return;
                                }if("".equals(editarDescripcionProducto)){
                                ventanaEditar.getMsgError().setText("El campo Descripción Producto es obligatorio");
                                return;
                                }if("".equals(editarPrecioProducto)){
                                ventanaEditar.getMsgError().setText("El campo Precio Producto es obligatorio");
                                return;
                                }
                               
                                
                                
                                Float precioActualizadoFloat;
                                try{
                                precioActualizadoFloat=Float.valueOf(editarPrecioProducto);
                                }catch(Exception ex){
                                ventanaEditar.getMsgError().setText("El precio del producto debe ser  numérico");
                                return;
                                }
                                
                                modeloProducto.actualizarProducto(codigoProducto, editarNombreProducto, editarDescripcionProducto, precioActualizadoFloat);
                                ventanaEditar.getResultado().setText("");
                                ventanaEditar.getMsgError().setText("Producto "+codigoProducto+" actualizado.");
                                ventanaEditar.getEditarNombreProducto().setText("");
                                ventanaEditar.getEditarDescripcionProducto().setText("");
                                ventanaEditar.getEditarPrecioProducto().setText("");
                               
                                
            }
        });
        
        
       
        // Revisando off
        
                    }else{
                        ventanaEditar.getMsgError().setText("No existe un producto con codigo: "+codigoProducto);                        
                    }
            
            }
                   
        
    });
    
}
            
}






