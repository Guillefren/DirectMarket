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
abstract class Categoria {
    private String Nombre;
    private Boolean ContProd;
    


public void Categoria(){
    this.Nombre = null;
    


}
public void SetNombre(String nombre){
    this.Nombre=nombre;

}


    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Boolean isContProd() {
        return ContProd;
    }

    public void setContProd(Boolean ContProd) {
        this.ContProd = ContProd;
    }


    


}










