/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;

/**
 *
 * @author Agustin
 */
public class cliente extends Usuario{
   public cliente(){
       nick = null;
       nombre = null;
       apellido = null;
      
   }
   
   public cliente(String ni,String nom, String ap){
        
       this.nick = ni;
       this.nombre = nom;
       this.apellido = ap;
     
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
   
   
}
