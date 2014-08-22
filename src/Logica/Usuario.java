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
abstract class Usuario {
     String nick;
     String nombre;
     String apellido;
     String email;
     Date fnac;
     String imagen;
     
     public void Usuario(){
     
              nick = "-";
              nombre = "-";
              apellido = "-";
              email = "-";
              fnac = new Date();
              imagen = "-";
     
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
   
   public String getEmail(){
   
   return email;
   }
   
   public Date getNacimiento(){
   
   return fnac;
   }
   
   public String getImagen(){
   
   return imagen;
   }
     
 }
