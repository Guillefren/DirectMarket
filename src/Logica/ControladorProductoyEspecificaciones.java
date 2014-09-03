/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;

import Conexionbd.*;
import java.sql.SQLException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class ControladorProductoyEspecificaciones {
  
    public List<producto> ListaProductos;
    public   List<Especificacion>  ListaEspecificaciones;
    
    public void ControladorProductoyEspecificaciones(){
        
     ListaProductos = new LinkedList();
     ListaEspecificaciones = new LinkedList();
    
    }
  
    public void RegistrarEspecificaciones(){
         //lista especificaciones, guarda todas las que se ingresen
         //se insertan en bd.sentencia.executeQuery("INSERT INTO PRODUCTO(ESPECIFICACIONES)VALUES('?')");
        
    }
    
    
    public void RegistrarProducto(String Nombre, int NumRef, String Descripcion, List<String> Especif, Money precio, String nomprov, List<String> Imagen, List<Hoja> hojas){
    
      
        producto p = new producto();
         Especificacion Esp = new Especificacion();
         Esp.setLista(Especif);
         ControladorUsuario cu = new ControladorUsuario();
         Proveedor pr = cu.SeleccionarProv(nomprov);
         //JOptionPane.showMessageDialog(null, Esp.getListaEspecificaciones().size());        
         //System.out.print(pr.getData().getNombre());
         p.setDatosProd(Nombre, NumRef, Descripcion, Esp, precio, pr, Imagen, hojas);
         agregar ag = new agregar();
         ag.agregarproducto(p);
         
          /*Conexionbd.conexion bd;
             bd = new Conexionbd.conexion();
             bd.conectarBase();
             try {
             bd.sentencia.executeQuery("INSERT INTO PRODUCTO(NOMBRE, NUM_REF, DESCRIPCION, PRECIO, IMAGENES)VALUES('"+p.getNombre()+"','"+p.getNumRef()+"','"+p.getDescripcion()+"','"+p.getPrecio()+"','"+p.getImagen()+"')");
             
             bd.desconectarBaseDeDatos();
         } catch (SQLException ex) {
             Logger.getLogger(agregar.class.getName()).log(Level.SEVERE, null, ex);
         }*/
    
}
          
           /* CargarImagen(jpg)*/
          
    public List<DataProducto> ListarProductos(String cat){
        
    getLista gl = new getLista();
    ListaProductos = gl.getListaProducto(cat);
    List<DataProducto> DataListaProducto = new LinkedList();
    producto p = new producto();
    DataProducto dp = new DataProducto();
    
     for(int i=0; i<ListaProductos.size();i++){
         p = ListaProductos.get(i);
         dp=p.getDataProd();
         DataListaProducto.add(dp);
     }
        return DataListaProducto;
              

    }
    
    
    
     public producto SeleccionarProducto(String Nombre){
              
        getLista gl = new getLista();
       
        ListaProductos = gl.getListaProductoSolo();
      
        
        
        JOptionPane.showMessageDialog(null, gl.getListaProductoSolo().size());
        
        for(int i=0; i<ListaProductos.size();i++){
            
            if (ListaProductos.get(i).getNombre().equals(Nombre)){
               // if(ListaProductos.get(i).getProvee()== null)
                    
                return ListaProductos.get(i);
            }
        
         
     }
            return null;
       
    }  
     
     public Especificacion getEspecificacionesProd(producto prod){
         getLista gl = new getLista();
         return gl.getEspecificacionesProd(prod);
     }
    
    
}
