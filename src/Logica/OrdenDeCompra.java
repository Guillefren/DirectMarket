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
public class OrdenDeCompra {
    private int numero;
    private Date fecha;
    private Money precioTotal;
    private List<producto> lproducto;
    
    public  OrdenDeCompra(){
           numero = 0;
           fecha = new Date();
           precioTotal = new Money();
           lproducto = new LinkedList();
    }
    
    public void setNumero(int num){
        this.numero = num;
    }
    
    public void setFecha(Date fec){
        this.fecha = fec;
    }

    public int getNumero() {
        return numero;
    }

    public Date getFecha() {
        return fecha;
    }

    public Money getPrecioTotal() {
        return precioTotal;
    }
   
    public void setPrecioTotal(Money pre){
        this.precioTotal = pre;
    }
   public DataOrdenDeCompra getData(){
        DataOrdenDeCompra odc = new DataOrdenDeCompra();
        odc.setDatos(numero, fecha, precioTotal);
        return odc;

   }
   
    
}
