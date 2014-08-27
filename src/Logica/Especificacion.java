/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;

import java.util.List;
import java.util.ArrayList;

  
/**
 *
 * @author Agustin
 */
public class Especificacion {
    private List<String> listEsp;
    
    public void Especificacion(List<String> lesp){
        this.listEsp = lesp;
        
    }
    
    public List<String> getListaEspecificaciones(){
        return this.listEsp;
       
    }
    
    public void agregarEspecificacion(String esp){
        this.listEsp.add(esp);
          
    }
    public void setLista(List<String> l){
    this.listEsp = l;
    }
    
}
