/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;
import java.util.*;

/**
 *
 * @author Agustin
 */
class DataOrdenDeCompra {

    private int numero;
    private Date fecha;
    private Money precioTotal;
    
    public void DataOrdenDeCompra(){
         numero = 0;
         fecha = null;
         precioTotal = null;

    }
    public void setDatos(int num, Date fec, Money pre){
    
    this.numero = num;
    this.fecha = fec;
    this.precioTotal = pre;

    }
}
