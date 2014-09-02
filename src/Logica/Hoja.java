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
    private String padre;
    
    public Hoja() {
    }

 

    public String getPadre() {
        return padre;
    }

    public void setPadre(String padre) {
        this.padre = padre;
    }
    
    public DataHoja getData(){
    DataHoja dh = new DataHoja();
    dh.setNombre(nombre);
    dh.setPadre(padre);

    return dh;
}
 
 
 

 
    
}
