/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;
import java.util.*;
import Conexionbd.*;
/**
 *
 * @author Herobrine
 */
public class ControladorCategoria {
    private List ListaCompuesta;
    private List ListaHoja;
    
   
    
    
    
    
 public void ControladorCategoria(){
        
    List<Compuesta> ListaCompuesta = new LinkedList();
    List<Hoja> ListaHoja = new LinkedList();
    
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
 
  public List<DataHoja> ListarHoja(){
        
    getLista gl = new getLista();
    ListaHoja = gl.getListaHoja();
    List<DataHoja> DataListaHoja = new LinkedList();
    DataHoja dh = new DataHoja();
        Iterator it = ListaHoja.iterator();
        while(it.hasNext()){
            if ( it instanceof Hoja){
                Hoja h  = new Hoja();
                h = (Hoja) it;
                dh = h.getData();
                DataListaHoja.add(dh);
            
            }
            it.next();
         }
        return DataListaHoja;
            
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
  

public Hoja SeleccionarHoja(String nombre){
        
        getLista gl = new getLista();
        ListaHoja = gl.getListaHoja();
        
       Iterator it = ListaHoja.iterator();
       
       for(int i=0; i<=ListaHoja.size();i++){
           Hoja h = new Hoja();
            if(it instanceof Hoja){
                
                h = (Hoja)it;
                if (h.GetNombre() == nombre){
                    return h;
                }
            
            }
       }
    
    return null;
    }






}
