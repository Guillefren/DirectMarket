/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;

import Conexionbd.agregar;

/**
 *
 * @author Usuario
 */
class producto {
    private String Nombre;
    private int NumRef;
    private String Descripcion;
    private Especificacion Esp;
    //private Money Precio;
    private String Imagen;
    
    public producto(){
        Nombre= null;
        Descripcion = null;
        Imagen = null;
        Esp = null;
      //  Money precio = null; 
       
    }
    public void setDatosProd(String Nombre, int NumRef, String Descripcion, Especificacion Especif , Money precio, String Imagen){
        this.Nombre = Nombre;
        this.NumRef = NumRef;
        this.Descripcion = Descripcion;
        this.Esp = Especif;
      //  this.Precio = Precio;
        
    }
    
    public producto(String nom, int numRef, String desc,/* ListaEspecificaciones listEsp, Money prec, */String imag){
        this.Nombre= nom;
        this.NumRef= numRef;
        this.Descripcion= desc;
         //   this.Precio = prec;
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
    public Especificacion getEsp(){
        return Esp;
    }
  /*  public Money getPrecio(){
       return Precio;
          }*/
    public String getImagen(){
       return Imagen;
          }
    public void setNombre(String nom){
       this.Nombre = nom;
            }
    public void setNumRef(int numRef){
       this.NumRef = numRef;
            }
    public void setDescripcion(String desc){
       this.Descripcion = desc;
            }
    public void setEsp(Especificacion Esp){
       this.Esp= Esp;
            }
    public void setPrecio(Money prec){
//       this.Precio = prec;
            }
    public void setImagen(String imag){
       this.Imagen = imag;
            }
    
      public void agregarProd(producto pro){
       agregar ag;
       ag = new agregar();
     //  ag.agregarProducto(pro);
       
       
   }
    
    public DataProducto getDataProd(){
   
   DataProducto dpr = new DataProducto();
   dpr.setDataProd(Nombre, NumRef, Descripcion, Esp , /*precio,*/ Imagen);
   return dpr;
   }
}
