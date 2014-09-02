/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;
import java.util.*;
import Conexionbd.*;

import javax.swing.JOptionPane;
/**
 *
 * @author Herobrine
 */
public class ControladorCategoria {
    private List<Compuesta> ListaCompuesta;
    private List<Hoja> ListaHoja;
    
   
    
    
    
    
 public void ControladorCategoria(){
        
    ListaCompuesta = new LinkedList();
    ListaHoja = new LinkedList();
    
    }

    
 
 public void AltaCategoria(String nombre, Boolean contieneProducto, String padre){
 
     if (contieneProducto){
         Hoja h = new Hoja();
         h.SetNombre(nombre);
         ListaHoja.add(h);
         agregar ag = new agregar();
         ag.agregarHoja(h);
            
     }
     else{
         Compuesta c = new Compuesta();
         c.SetNombre(nombre);
         if(padre!=null){
             c.SetPadre(padre);
             agregar ag = new agregar();
             ag.agregarCompuesta(c);
             
         }
     }
 
 }
 
  public List<Hoja> ListarHoja(){
        getLista gl = new getLista();
        return gl.getListaHoja();
        /*List<DataHoja> DataListaHojas = new LinkedList();
        DataHoja dh = new DataHoja();
        for(int i=0; i < ListaHoja.size(); i++){
            System.out.print(ListaHoja.get(i).getNombre());
            Hoja hh  = new Hoja();
            hh = ListaHoja.get(i);
            dh.setNombre(hh.getNombre());
            dh.setPadre(hh.getPadre());
            JOptionPane.showMessageDialog(null, dh.getNombre());
            DataListaHojas.add(dh);
        }
        return DataListaHojas;*/
    }
        public List<DataHoja> ListarHojas(){
            
             getLista gl = new getLista();
             ListaHoja = gl.getListaHoja();
             List<DataHoja> DataListaHojas = new LinkedList();
        DataHoja dh = new DataHoja();
        for(int i=0; i < ListaHoja.size(); i++){
            System.out.print(ListaHoja.get(i).getNombre());
            Hoja hh  = new Hoja();
            hh = ListaHoja.get(i);
            dh.setNombre(hh.getNombre());
            dh.setPadre(hh.getPadre());
            JOptionPane.showMessageDialog(null, dh.getNombre());
            DataListaHojas.add(dh);
        }
        return DataListaHojas;
        }
  
  
  public List<DataCompuesta> ListarCompuesta(){
        
    getLista gl = new getLista();
    ListaCompuesta = gl.getListaCompuesta();
    List<DataCompuesta> DataListaCompuesta = new LinkedList();
    DataCompuesta dc = new DataCompuesta();
        Iterator it = ListaCompuesta.iterator();
        while(it.hasNext()){
            if ( it instanceof Compuesta){
                Compuesta c  = new Compuesta();
                c = (Compuesta) it;
                dc = c.getData();
                DataListaCompuesta.add(dc);
            
            }
            it.next();
         }
        return DataListaCompuesta;
            
    }
  

public Compuesta SeleccionarCompuesta(String nombre){
        
        getLista gl = new getLista();
        ListaCompuesta = gl.getListaCompuesta();
        
       Iterator it = ListaCompuesta.iterator();
       
       for(int i=0; i<=ListaCompuesta.size();i++){
           Compuesta c = new Compuesta();
            if(it instanceof Compuesta){
                
                c = (Compuesta)it;
                if (c.getNombre()== nombre){
                    return c;
                }
            it.next();
            
            }
       }
    
    return null;
    }
  

/*public Hoja SeleccionarHoja(String nombre){
        
        getLista gl = new getLista();
        ListaHoja = gl.getListaHoja();
        
       Iterator it = ListaHoja.iterator();
       
       for(int i=0; i<=ListaHoja.size();i++){
           Hoja h = new Hoja();
            if(it instanceof Hoja){
                
                h = (Hoja)it;
                if (h.getNombre() == nombre){
                    return h;
                }
            
            }
       }
    
    return null;
    }*/

public List<DataProducto> getProductosxCat(String cat){
    getLista gl = new getLista();
    return gl.getProductosxCat(cat);
}

    


public Hoja SeleccionarHoja(String nombre){
        
        getLista gl = new getLista();
        ListaHoja = gl.getListaHoja();
        
       Iterator it = ListaHoja.iterator();
       
       for(int i=0; i<=ListaHoja.size();i++){
           Hoja h = new Hoja();
            if(it instanceof Hoja){
                
                h = (Hoja)it;
                if (h.getNombre() == nombre){
                    return h;
                }
            
            }
       }
    
    return null;
    }
}
