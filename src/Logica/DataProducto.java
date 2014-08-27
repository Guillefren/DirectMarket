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
class DataProducto {
    
    private String Nombre;
    private int NumRef;
    private String Descripcion;
    private Especificacion Esp;
    //private Money Precio;
    private String Imagen;
    
    public void DataProducto(){
        Nombre=null;
        Descripcion=null;
        Esp=null;
        //Precio;
        Imagen=null;
    }

    void setDataProd(String Nombre, int NumRef, String Descripcion, Especificacion Especif, String Imagen) {
        this.Nombre=Nombre;
        this.NumRef=NumRef;
        this.Descripcion=Descripcion;
        this.Esp=Especif;
        //private Money Precio;
         this.Imagen=Imagen;
    }
    
}
