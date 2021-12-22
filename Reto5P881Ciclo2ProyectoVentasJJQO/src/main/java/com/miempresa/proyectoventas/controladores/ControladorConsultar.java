package com.miempresa.proyectoventas.controladores;

//Elaborado por: John Jairo Quiroga Orozco
//Plantilla base del curso P81
//MisionTic 2021
//ngjquiroga@gmail.com
//Fecha finalización edición 12/10/2021

import com.miempresa.proyectoventas.modelos.ModeloProductos;
import com.miempresa.proyectoventas.vistas.VistaConsultar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;


public class ControladorConsultar {
    JFrame ventanaPadre;
    VistaConsultar ventanaConsultar;

    public ControladorConsultar(JFrame ventanaPadre) {
        this.ventanaPadre = ventanaPadre;
        ventanaConsultar = new VistaConsultar();
        ventanaConsultar.setTitle("Ventana de consultas");
        ImageIcon icono = new ImageIcon("src/main/java/com/miempresa/proyectoventas/vistas/LogoJJQO.png");
        ventanaConsultar.setIconImage(icono.getImage());
        this.ventanaPadre.setVisible(false);
        ventanaConsultar.setVisible(true);
        ventanaConsultar.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ventanaConsultar.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                ventanaPadre.setVisible(true);
            }
        });
       
        
        //REVISANDO ON
        
       JButton botonConsultar = ventanaConsultar.getBotonConsultarProducto();
        botonConsultar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                
                ventanaConsultar.getResultadoConsultarCodigo().setText("");
                ventanaConsultar.getResultadoConsultarNombre().setText("");
                ventanaConsultar.getResultadoConsultarDescripcion().setText("");
                ventanaConsultar.getResultadoConsultarPrecio().setText("");
                    
                String codigoProducto = ventanaConsultar.getCodigoProducto().getText();
                
                
                if("".equals(codigoProducto)){
                  ventanaConsultar.getMsgError().setText("El campo Código Producto es obligatorio");
                  return;
              }
                
              
               
               //Control inicio
               
              
               DecimalFormat formatea = new DecimalFormat("###,###.##"); //formato separador de miles
               
               ModeloProductos modeloProductos = new ModeloProductos();
               HashMap<String, String> respuesta = modeloProductos.consultarProducto(codigoProducto);
                    if(respuesta.get("nombre_producto").equals("")){
                        ventanaConsultar.getResultadoConsultarCodigo().setText("No se encontró el producto Solicitado.");
                    }else{
                        ventanaConsultar.getResultadoConsultarCodigo().setText("PRODUCTO CODIGO: "+codigoProducto);
                        ventanaConsultar.getResultadoConsultarNombre().setText("Nombre: "+respuesta.get("nombre_producto"));
                        ventanaConsultar.getResultadoConsultarDescripcion().setText("Descripción: " + respuesta.get("descripcion_producto") );
                        ventanaConsultar.getResultadoConsultarPrecio().setText("Precio: " + respuesta.get("precio_producto") +" COP");
                    }
               
               
               //Control final
               
               
               
            }
        });
        
        
        
        //REVISANDO OFF
        
        
        
        
        
          
        
        
        ventanaConsultar.getRootPane().setDefaultButton(botonConsultar);
    }
    
}