/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;
import java.util.*;

/**
 *
 * @author Herobrine
 */
public class Compuesta extends Categoria {
    //ArrayList <Categoria> NombreArrayList= new ArrayList <Categoria> ();
    private List Hijas;
    private Categoria padre;
    private String nombre;
    
    
    
    
    
 public void Compuesto(){
     List<Categoria> ListaCategoria = new LinkedList<Categoria>();
     this.padre=null;
     this.nombre=null;
     
     
     
     
 }
public void SetPadre(String nombre){
    Compuesta cat = new Compuesta();
    ControladorCategoria cont = new ControladorCategoria();
    cat= cont.BuscarCompuesta(nombre);
    this.padre=cat;

}



public String getNombre(){
    return this.nombre;

}
 

public DataCompuesta getData(){
    DataCompuesta dc = new DataCompuesta();
    dc.DataCompuesta(nombre);
    return dc;
}
 
 

    
    
}
