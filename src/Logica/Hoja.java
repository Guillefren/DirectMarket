/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;

/**
 *
 * @author Herobrine
 */
public class Hoja extends Categoria {
    
   private String nombre;
    
    
    
 public void Hoja(){
    
    }
public void Hoja(String nombre){
    this.nombre=nombre;
}
public void SetNombre(String nombre){
    this.nombre=nombre;

}
 
public String GetNombre(){
    return this.nombre;

}

public DataHoja getData(){
    DataHoja dh = new DataHoja();
    dh.DataHoja(nombre);
    return dh;
}
 
 
 

 
    
}
