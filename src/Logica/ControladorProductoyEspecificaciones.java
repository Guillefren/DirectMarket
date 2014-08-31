/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;

import Conexionbd.*;
import java.util.*;

/**
 *
 * @author Usuario
 */
public class ControladorProductoyEspecificaciones {
  
    public List ListaProductos;
    public List ListaEspecificaciones;
    
    public void ControladorProductoyEspecificaciones(){
        
    List<producto> ListaProductos = new LinkedList();
    List<Especificacion> ListaEspecificaciones = new LinkedList();
    
    }
  
    
    
    
    public void RegistrarProducto(String Nombre, int NumRef, String Descripcion, List<String> Especif, Money precio, String Imagen){
         producto p = new producto();
         Especificacion Esp = new Especificacion();
         Esp.setLista(Especif);
         p.setDatosProd(Nombre, NumRef, Descripcion, Esp, precio, Imagen);
         ListaProductos.add(p);
          agregar ag = new agregar();
         // ag.agregarproducto(p);
          ag = new agregar();
         // ag.agregarEsp(Esp);
       
       
   }
          
           /* CargarImagen(jpg)*/
          
    public List<DataProducto> ListarProductos(){
        
    getLista gl = new getLista();
   // ListaProductos = gl.getListaProducto();
    List<DataProducto> DataListaProducto = new LinkedList();
        Iterator it = ListaProductos.iterator();
        while(it.hasNext()){
            if ( it instanceof producto){
                producto pr  = new producto();
                pr = (producto) it;
                DataProducto dpr = new DataProducto();
                dpr = pr.getDataProd();
                DataListaProducto.add(dpr);
            
            }
            it.next();
         }
        return DataListaProducto;

    }
          public producto SeleccionarProducto(String Nombre){
    
        getLista gl = new getLista();
        return gl.SeleccionarProducto(Nombre);
//       ListaProductos = gl.getListaProducto();
//        Iterator it = ListaProductos.iterator();
//
//        while (it.hasNext()){
//            if (it instanceof producto){
//                producto pr = new producto();
//                pr = (producto)it;
//                if (pr.getNombre()== Nombre)
//                    return pr;
//
//            }
//            it.next();
//
//        }
//        return null;
    }
  
     
    
    
    
}
