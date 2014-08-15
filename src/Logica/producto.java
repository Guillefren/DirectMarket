/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;

/**
 *
 * @author Usuario
 */
class producto {
    private String Nombre;
    private int NumRef;
    private String Descripcion;
    private ListaEspecificaciones ListaEsp;
    private Money Precio;
    private String Imagen;
    
    public producto(){
        String Nombre= null;
        int NumRef;
        String Descripcion = null;
        ListaEspecificaciones ListaEsp = null;
        Money precio = null; 
        String Imagen = null;
    }
    public void setDatosProd(String Nombre, int NumRef, String Descripcion, ListaEspecificaciones ListaEsp, Money precio, String Imagen){
        this.Nombre = Nombre;
        this.NumRef = NumRef;
        this.Descripcion = Descripcion;
        this.ListaEsp = ListaEsp;
        this.Precio = Precio;
        
    }
    
    public producto(String nom, int numRef, String desc, ListaEspecificaciones listEsp, Money prec, String imag){
        this.Nombre= nom;
        this.NumRef= numRef;
        this.Descripcion= desc;
        this.ListaEsp =listEsp;
        this.Precio = prec;
        this.Imagen =imag;
      
      
    }
    
    public String getNombre(){
       return Nombre;
          }
    public int getNumRef(){
       return NumRef;
          }
    public String getDescripcion(){
       return Descripcion;
          }
    public ListaEspecificaciones getListEsp(){
        return ListaEsp;
    }
    public Money getPrecio(){
       return Precio;
          }
    public String getImagen(){
       return Imagen;
          }
}
