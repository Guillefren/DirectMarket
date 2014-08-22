/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;
import java.util.*;

/**
 *
 * @author Guilleeu
 */
public class Proveedor extends Usuario{
    
    private String nombreCompañia;
    private String linkPagina;
    
    public void Proveedor(){
    
    nombreCompañia= "-";
    linkPagina = "-";
    
    }
    public String getNombreCompañia(){
    
    return nombreCompañia;
    }
    
    public String getLinkPagina(){
    
    return linkPagina;
    }
    
    public void setNombreCompañia(String nc){
    
    this.nombreCompañia = nc;
    }
    
    public void setLinkPagina(String lp){
    
    this.linkPagina = lp;
    }
    
    public Proveedor(){
       nick = null;
       nombre = null;
       apellido = null;
       fnac = null;
      nombreCompañia = null;
      linkPagina = null;
   }
   
   public Proveedor(String ni,String nom, String ap, Date fnac,String nc, String lp){
        
       this.nick = ni;
       this.nombre = nom;
       this.apellido = ap;
       this.fnac = fnac;
       this.linkPagina = lp;
       this.nombreCompañia = nc;
     
   }
   public String getNick(){
       return nick;
          }
   public String getNombre(){
       return nombre;
     }
   public String getApellido(){
       return apellido;
   }
   public void setNick(String ni){
       this.nick = ni;
            }
   public void setNombre(String nom){
       this.nombre = nom;
   }
   public void setApellido(String ap){
        this.apellido = ap;
   }
    
   public void setdatos(String nick, String nombre, String apellido, String email, Date fnac, String Imagen, String nc, String lp){

   this.apellido = apellido;
   this.email = email;
   this.imagen = imagen;
   this.linkPagina = lp;
   this.nick = nick;
   this.nombre = nombre;
   this.nombreCompañia = nc;
   this.fnac = fnac;
   }
   
   public DataProveedor getData(){
   
       DataProveedor dp = new DataProveedor();
       dp.setDatos(nick, nombre, apellido, email,fnac.toString(), linkPagina, nombreCompañia, imagen);
       return dp;
   }
   
   
   
   
   
   
   
   
   
   
   
}












